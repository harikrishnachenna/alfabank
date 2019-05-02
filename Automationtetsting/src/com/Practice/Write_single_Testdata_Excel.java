package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_single_Testdata_Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet4");
	
		//
		Row  r= sheet.createRow(7);
		Cell c=r.createCell(6);
		
		c.setCellValue("i want to become a millionaiore");
		
		FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
		workbook.write(file1);
		
		
		
		
	}

}
