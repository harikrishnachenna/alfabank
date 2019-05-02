package com.getPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_IdentifyingAnElement_Gmail {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String Url="http:google.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Url);
		
		String expected_element="Gmail";
		System.out.println("The expected_element on Google web page :"+expected_element);
		
		String google_pagesource=driver.getPageSource();
		
		if(google_pagesource.contains(expected_element)) {
			
			System.out.println("Element Found-Pass"); 
		}
		
		else{
			
			System.out.println("Element Not Found-fail");
		}
		
		driver.quit();
		
	}

}
