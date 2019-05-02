package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_single_Testdata {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("./src/com/ExcelTestDataFiles/SeleniumTestData.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet2");
		
	//identify the row and cell of the sheet
		
		 Row r =sheet.getRow(0);
		Cell c = r.getCell(0);
		
		
		//identify the cell data by using the 
	
		 String data =c.getStringCellValue();
		 System.out.println(data);
		 
		 
		 
	
	
	}

}
