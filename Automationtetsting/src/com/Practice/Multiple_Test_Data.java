package com.Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple_Test_Data {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("/src/com/ExcelTestDataFiles/multipleTest Data.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		
		 int rowcount=sheet.getLastRowNum();
		   for(int i=0;i<rowcount;i++) {
		 	
			   Row r=sheet.getRow(i);
			   
			   int cellcount=r.getLastCellNum();
			     for(int j=0;j<cellcount;j++) {
			    	 Cell c=r.getCell(j);
			       
			    	 String data=c.getStringCellValue();
			    	 
			    	System.out.print(data      +   " ");
			    	 
			     
			     }
			
			System.out.println();
		}
		
		
	}

}
