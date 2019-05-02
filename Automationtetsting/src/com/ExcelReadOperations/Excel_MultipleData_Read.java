package com.ExcelReadOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_MultipleData_Read {

	public static void main(String[] args) throws IOException {
		
	FileInputStream file =new FileInputStream ("./src/com/ExcelTestDataFiles/multipleTest Data.xlsx");
 
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet= workbook.getSheet("sheet1");
	
	int rowcount =sheet.getLastRowNum();
	
	//to go to active row
	for(int i=0;i<=rowcount;i++) {
		
		Row r= sheet.getRow(i);
	
	  int cellcount  = r.getLastCellNum();
	  
	  for (int k=0;k<cellcount;k++) {
		  
		  Cell c=r.getCell(k);
		  
		   String data=c.getStringCellValue();
		   System.out.print(data+ "  ");
	  }
	  System.out.println();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// identify the row and coloumn of webpage
	
	 //Row r=sheet.getRow(0);
	// Cell c=r.getCell(0);
		//String data =c.getStringCellValue();
		
		
		
	}

}
