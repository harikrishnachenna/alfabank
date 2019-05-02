package com.Validating_Facebook_Url_containsmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_validatimg_contains_Method {

	public static void main(String[] args) {
		
		
		WebDriver driver =null;
		 String url="http:facebook.com";
		 
		 
		 System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 String ActualUrl=driver.getCurrentUrl();
		 System.out.println("The Actual url of the page :" +ActualUrl);
		 
		 String expectedUrlcontains="facebook";
		 System.out.println("The Actual Url of the page contains expected url data :"+expectedUrlcontains);
		 
		 if(ActualUrl.contains("facebook")){
			 
			 System.out.println("Url data matched :Pass");
		 }
			 else{
				 
				 System.out.println("Url data mis matched :Fail");;
			      }
	         }
		 }


