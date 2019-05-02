package com.capturingUrl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingUrl_Facebook {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String Url= "http://facebook.com";
		
	
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(Url);
		 
		  String ActualTitle=driver.getTitle();
		  System.out.println("The Actaual titile of webpage :"+ActualTitle);
		  
		  String CurrentUrl=driver.getCurrentUrl();
		  System.out.println("The Actual url of web page : "+CurrentUrl);
		 
		 
		 
		 
		 
		
	}

}
