package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Loginpage {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
		
		
		
		/*
		WebDriver driver=null;
		String url="http:/facebook.com";
		
	
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(url);?*
		
		//LOCATOR ==id
		//selector=="email"
		
		driver.findElement(By.id("email" )).sendKeys("harikrishna");
		
		//wrirng the automated script to navigate to password text of facebook
		
	//locator =    id 
	//selector= "pass"
		
		driver.findElement(By.id("pass")).sendKeys("automationwebdriver");
		
		
		/*driver.findElement(By.id("royal_login_button")).click(); why it is showing the error  
		and how to identify the 
		locator
		and 
		selector
		in these this case 
		
		
		
		
		
		
		*/
		
		
		
		
	}

}
