package com.ExcelReadOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_singleTest_Data {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
		  XSSFWorkbook workbook=new XSSFWorkbook(file);
		  XSSFSheet sheet=workbook.getSheet("sheet1");
		  
		  
		  //identify the particular row and cell of the sheet
		  Row r=sheet.getRow(0);
		  Cell c  =r.getCell(0);
		  
		  // identify the cell data by using c.get string cell value
		  
		  String data =c.getStringCellValue();
		  System.out.println(data);
		  
		  
		  
		  
		  

	}

}
