package com.Excel_Read_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writeOperations {

	public static void main(String[] args) throws IOException {
		
	FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/Excel_WriteOperations.xlsx");
		
	XSSFWorkbook workbook=new XSSFWorkbook(file);
		
	XSSFSheet sheet=workbook.getSheet("sheet1");
		
	Row r=sheet.createRow(4);
	
	Cell c=r.createCell(4);
		
	c.setCellValue("hari");

	//to save excel data(below to steps are very important operations) 
	FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/Excel_WriteOperations.xlsx");
	workbook.write(file1);
	
	
	}

}
