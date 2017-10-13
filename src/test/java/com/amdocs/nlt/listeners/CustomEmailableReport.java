package com.amdocs.nlt.listeners;

import com.amdocs.nlt.util.SortByTestTagName;
import com.amdocs.nlt.util.Utilities;
import org.apache.commons.io.FileUtils;
import org.testng.*;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;

import java.io.*;
import java.util.*;

/**
 * Reporter that generates a single-page HTML report of the test results.
 *
 */
public class CustomEmailableReport implements IReporter {
    private static final Logger LOG = Logger.getLogger(CustomEmailableReport.class);

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        int sNo = 0;
        List<CustomTestMethodResult> completeReport = new ArrayList<>();
        try {
            FileUtils.copyFile(new File(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/TotalReport_Template.html"), new File(outputDirectory, "CustomizedReport.html"));
            FileUtils.copyDirectory(new File(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/Scripts"), new File(outputDirectory, "Scripts"));
            FileUtils.copyDirectory(new File(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/Styles"), new File(outputDirectory, "Styles"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int totalTestMethods=0, totalPassedTestmethods=0, totalFailedMethods=0, totalSkippedMethods=0, totalPartialSuccessTestMethods=0;
        long totalTimeTakenTestinSeq=0;

        String totalReport = readFile(outputDirectory + "/CustomizedReport.html");
        String totalRowTemplate = readFile(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/TotalRowtemplate.html");

        //iterate through multiple testng xml files (Currently we have only 1)
        for (ISuite indSuite : suites) {
            Map<String, ISuiteResult> indSuiteResults = indSuite.getResults();

            //iterate through test tags in testng xml
            for (Map.Entry<String, ISuiteResult> indTestResultMapEntry:indSuiteResults.entrySet()) {
                ISuiteResult indTestResult = indTestResultMapEntry.getValue();

                long testDuration = indTestResult.getTestContext().getEndDate().getTime() - indTestResult.getTestContext().getStartDate().getTime();
                totalTimeTakenTestinSeq = totalTimeTakenTestinSeq + testDuration;

                List<ITestResult> allTestMethodResults = getAllTestMethodResults(indTestResult);
                CustomTestMethodResultsSummary summaryObj = new CustomTestMethodResultsSummary(indTestResult);

//                totalRowTemplate = totalRowTemplate.replace("${TotalTestMethods}", summaryObj.getTotalTestMethodsCount());
//                totalRowTemplate = totalRowTemplate.replace("${TotalPassedtestMethods}", summaryObj.getTotalPassedMethodsCount());
//                totalRowTemplate = totalRowTemplate.replace("${TotalFailedTestMethods}", summaryObj.getTotalFailedMethodsCount());
//                totalRowTemplate = totalRowTemplate.replace("${TotalSkippedTestMethods}", summaryObj.getTotalSkippedMethodsCount());
//                totalRowTemplate = totalRowTemplate.replace("${TotalPartialSuccessTestMethods}", summaryObj.getTotalPartialSuccessMethodsCount());
//                totalRowTemplate = totalRowTemplate.replace("${TotalDurationSequential}", summaryObj.getTimeDuration());

                for (ITestResult indTestMethodResult : allTestMethodResults) {
                    totalTestMethods++;

                    CustomTestMethodResult obj = new CustomTestMethodResult(indTestResult, indTestMethodResult);
                    completeReport.add(obj);

                    if (obj.getTestMethodStatus() == Status.PASS) {
                        totalPassedTestmethods++;
                    } else if (obj.getTestMethodStatus() == Status.FAIL) {
                        totalFailedMethods++;
                    } else if (obj.getTestMethodStatus() == Status.SKIP) {
                        totalSkippedMethods++;
                    } else if (obj.getTestMethodStatus() == Status.PARTIALSUCCESS) {
                        totalPartialSuccessTestMethods++;
                    }
                }
            }
        }

        Collections.sort(completeReport, new SortByTestTagName());
        for (int i = 0; i<completeReport.size(); i++) {
            CustomTestMethodResult currentRow = completeReport.get(i);
            CustomTestMethodResult previousRow;
            if (i >0)
                previousRow = completeReport.get(i-1);

            sNo++;
            String rowTemplate = readFile(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/Rowtemplate.html");

            rowTemplate = rowTemplate.replace("${StatusClass}", currentRow.getMethodRowClass());
            rowTemplate = rowTemplate.replace("${Sno}", String.valueOf(sNo));

//            if (currentRow[1].equalsIgnoreCase(previousRow[1])) {
//                rowTemplate = rowTemplate.replace("${TestName}", "");
//                rowTemplate = rowTemplate.replace("${TimeTakenForTest}", "");
//            }else {
                rowTemplate = rowTemplate.replace("${TestName}", currentRow.getTestName());
                rowTemplate = rowTemplate.replace("${TimeTakenForTest}", currentRow.getTestDuration());
//            }

            //Dummy row span value
            rowTemplate = rowTemplate.replace("${TotalTestMethods}", "");

//            if (currentRow[3].equalsIgnoreCase(previousRow[3]) && currentRow[4].equalsIgnoreCase(previousRow[4])){
//                rowTemplate = rowTemplate.replace("${PackageName}", "");
//                rowTemplate = rowTemplate.replace("${ClassName}", "");
//            } else {
                rowTemplate = rowTemplate.replace("${PackageName}", currentRow.getTestMethodPackage());
                rowTemplate = rowTemplate.replace("${ClassName}", currentRow.getTestMethodClass());
//            }

            rowTemplate = rowTemplate.replace("${MethodName}", currentRow.getTestMethodName());
            rowTemplate = rowTemplate.replace("${StartTimeForMethod}", currentRow.getTestMethodStartTime());
            rowTemplate = rowTemplate.replace("${TimeTakenForMethod}", currentRow.getTestMethodDuration());
            String exceptionPopup = "";
            String screenShotLink = "";
            if (currentRow.getTestMethodStatus() == Status.FAIL) {
                exceptionPopup = prepareStackTracePopupHtml(currentRow);
                screenShotLink = "<a href='screenshots/" + currentRow.getTestMethodUniqueName() + ".png'>screenshot</a>";
            }
            rowTemplate = rowTemplate.replace("${ExceptionPopUp}", exceptionPopup);
            rowTemplate = rowTemplate.replace("${ScreenShotLink}", screenShotLink);

            totalReport = totalReport.replace("<!--test result-->", rowTemplate);

        }
        totalRowTemplate = totalRowTemplate.replace("${TotalTestMethods}", String.valueOf(totalTestMethods));
        totalRowTemplate = totalRowTemplate.replace("${TotalPassedtestMethods}", String.valueOf(totalPassedTestmethods));
        totalRowTemplate = totalRowTemplate.replace("${TotalFailedTestMethods}", String.valueOf(totalFailedMethods));
        totalRowTemplate = totalRowTemplate.replace("${TotalSkippedTestMethods}", String.valueOf(totalSkippedMethods));
        totalRowTemplate = totalRowTemplate.replace("${TotalPartialSuccessTestMethods}", String.valueOf(totalPartialSuccessTestMethods));
        totalRowTemplate = totalRowTemplate.replace("${TotalDurationSequential}", Utilities.timeConversion(totalTimeTakenTestinSeq));

        totalReport = totalReport.replace("<!--total test result-->", totalRowTemplate);

        writeFile(new File(outputDirectory, "CustomizedReport.html"), totalReport);
    }

    public String prepareStackTracePopupHtml(CustomTestMethodResult currentRow) {
        String exceptionPopup;
        exceptionPopup = readFile(System.getProperty("user.dir") + "/src/main/resources/htmlTemplates/CellPopup.html");

        exceptionPopup = exceptionPopup.replace("${ClassName_MethodName}", currentRow.getTestMethodUniqueName());
        exceptionPopup = exceptionPopup.replace("${StackTrace}", currentRow.getStackTrace());
        exceptionPopup = exceptionPopup.replace("${Exception}", currentRow.getExceptionName());
        return exceptionPopup;
    }

    public List<ITestResult> getAllTestMethodResults(ISuiteResult indTestResult) {
        Set<ITestResult> allPassedResults = indTestResult.getTestContext().getPassedTests().getAllResults();
        Set<ITestResult> allFailedResults = indTestResult.getTestContext().getFailedTests().getAllResults();
        Set<ITestResult> allSkippedResults = indTestResult.getTestContext().getSkippedTests().getAllResults();
        Set<ITestResult> allPartialSuccessResults = indTestResult.getTestContext().getFailedButWithinSuccessPercentageTests().getAllResults();

        List<ITestResult> allResults = new ArrayList<>();
        allResults.addAll(allPassedResults);
        allResults.addAll(allFailedResults);
        allResults.addAll(allSkippedResults);
        allResults.addAll(allPartialSuccessResults);
        return allResults;
    }

    public String readFile(String path) {
        String content = "";
        try {
            content = new Scanner(new File(path)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }

    public void writeFile(File file, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
