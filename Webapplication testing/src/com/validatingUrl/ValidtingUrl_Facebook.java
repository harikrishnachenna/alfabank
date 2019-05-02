package com.validatingUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidtingUrl_Facebook {

	public static void main(String[] args) {
		
	
		WebDriver driver=null;
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		
		String actualUrl=driver.getCurrentUrl();
		System.out.println("The Actual Url of the Facebook webpage :"+actualUrl);
		 
		 
		
		String expectedUrl="www.facebook.com";
		System.out.println("The Expedcted Url of Facebook webpage  :"+expectedUrl);
		
		if(actualUrl.contains(expectedUrl)) {
			
			System.out.println("Url matched  -----   PASS");
		}
		
		else {
			
			System.out.println("Url mis-matched  ----- FAIL");
	            
		             }
		
		}

		
		

		 
		
		
		
		
		
	}


