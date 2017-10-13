package com.amdocs.nlt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelFileReader {
	public static void main(String[] args) {
		 
		 try {
		    
		  FileInputStream file = new FileInputStream(new File("./Data/testdata.xls"));
		  HSSFWorkbook workbook = new HSSFWorkbook(file);
		 
		  HSSFSheet sheet = workbook.getSheetAt(0);
		   
		  String heading = sheet.getRow(0).getCell(0).getStringCellValue();
		    
		  String userName = sheet.getRow(1).getCell(0).getStringCellValue();
		    
		  String password = sheet.getRow(2).getCell(0).getStringCellValue();
		    
		  System.out.println("Heading is:" + heading);
		    
		  System.out.println("Search Text 1 is:" + userName);
		    
		  System.out.println("Search Text 2 is:" + password);
		 
		  file.close();
		 
		 } catch (FileNotFoundException fnfe) {
		  fnfe.printStackTrace();
		 } catch (IOException ioe) {
		  ioe.printStackTrace();
		 }
		 }
}
