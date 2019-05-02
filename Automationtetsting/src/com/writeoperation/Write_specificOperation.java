package com.writeoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_specificOperation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
		
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		
		XSSFSheet sheet= workbook.getSheet("Sheet3");
		
		Row r=sheet.createRow(3);
		
		Cell c =r.createCell(5);
		
		c.setCellValue("harikrishna");
		
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
        workbook.write(file1);

	// Why it is not displays any data in excel sheet
	}

}
