package com.amdocs.nlt.listeners;

import com.amdocs.nlt.util.Utilities;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ISuiteResult;
import org.testng.ITestResult;

public class CustomTestMethodResult {
    private ITestResult currentTestMethodResult;
    private ISuiteResult currentTestResult;

    public CustomTestMethodResult(ISuiteResult currentTestResult, ITestResult currentTestMethodResult) {
        this.currentTestResult = currentTestResult;
        this.currentTestMethodResult = currentTestMethodResult;
    }

    public String getTestName() {
        return currentTestResult.getTestContext().getName();
    }

    public String getTestDuration() {
        return Utilities.timeConversion(currentTestResult.getTestContext().getEndDate().getTime() - currentTestResult.getTestContext().getStartDate().getTime());
    }

    public String getTestMethodPackage() {
        return currentTestMethodResult.getTestClass().getRealClass().getPackage().getName();
    }

    public String getTestMethodClass() {
        return currentTestMethodResult.getTestClass().getRealClass().getSimpleName();
    }

    public String getTestMethodName() {
        return currentTestMethodResult.getMethod().getMethodName();
    }

    public Status getTestMethodStatus() {
        return Status.valueOf(currentTestMethodResult.getStatus());
    }

    public String getTestMethodUniqueName() {
        return getTestMethodPackage().replace(".", "_") + "_" + getTestMethodClass() + "_" + getTestMethodName();
    }

    public String getMethodRowClass(){
        if (getTestMethodStatus() == Status.PASS) {
            return "passedTest";
        } else if (getTestMethodStatus() == Status.FAIL) {
            return "failedTest";
        } else if (getTestMethodStatus() == Status.SKIP) {
            return "skippedTest";
        } else if (getTestMethodStatus() == Status.PARTIALSUCCESS) {
            return "partialSuccessTest";
        }
        return "";
    }

    public String getExceptionName() {
        String exceptionName = "";
        if (getTestMethodStatus() == Status.FAIL) {
            exceptionName = currentTestMethodResult.getThrowable().getClass().getName();
        }
        return exceptionName;
    }

    public String getStackTrace() {
        String stackTrace = "";
        if (getTestMethodStatus() == Status.FAIL) {
            stackTrace = StringEscapeUtils.escapeHtml(ExceptionUtils.getFullStackTrace(currentTestMethodResult.getThrowable()));
        }
        return stackTrace;
    }

    public String getTestMethodDuration() {
        return Utilities.timeConversion(currentTestMethodResult.getEndMillis() - currentTestMethodResult.getStartMillis());
    }

    public String getTestMethodStartTime() {
        return Utilities.dateConversion(currentTestMethodResult.getStartMillis());
    }
}

enum Status {
    PASS(1), FAIL(2), SKIP(3), PARTIALSUCCESS(4);

    public int value;
    Status(int i) {
        this.value = i;
    }
    public static Status valueOf(int i){
        Status returnObj = null;
        for (Status obj: Status.values()) {
            if (obj.value == i)
                returnObj = obj;
            else
                continue;
        }
        return returnObj;
    }
}