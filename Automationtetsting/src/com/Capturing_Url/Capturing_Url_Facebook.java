package com.Capturing_Url;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_Url_Facebook {

	public static void main(String[] args) {
		
		
				
		 WebDriver driver =null;
		 String url="http:facebook.com";
		 
		 
		 System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 String currentUrl=driver.getCurrentUrl();
		 System.out.println("The Actual url of the page :" +currentUrl);
		 
		 String expectedUrl="www.facebook.com";
		 System.out.println("The expected Url of the page :"+expectedUrl);
		 
		 if (currentUrl.equals(expectedUrl)) {
			 System.out.println("current Url equals expected Url : True");
		 }
		 else
		 {
			 System.out.println("currentUrl is not equals to expected url: False");
		 }
		 
		driver.getCurrentUrl().contains("facebbo0k");
		 

	}

}
