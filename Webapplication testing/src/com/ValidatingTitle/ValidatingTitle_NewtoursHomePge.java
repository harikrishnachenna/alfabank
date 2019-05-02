package com.ValidatingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_NewtoursHomePge {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url ="http://NewTours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(url);
		
		String expectedtitle="Welcome: Mercury Tours";
		System.out.println("The Expected Title of a web page :"+expectedtitle);
		
		 String actualtitle=driver.getTitle();
		 System.out.println("The Actual title of the web page :"+actualtitle);
		 
		 if(actualtitle.equals(expectedtitle)){
			 System.out.println("The Title match : PASS");
		         }
			 else {
				 System.out.println("The Title doesnot match  : FAIL");
				 
			 }
			 
			 
		 }
		 
	}


