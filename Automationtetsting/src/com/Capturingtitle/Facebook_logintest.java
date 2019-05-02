package com.Capturingtitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebook_logintest {

	public static void main(String[] args) {
		
		 WebDriver driver=null;
		String url="http:/facebook.com";
		
	
		driver =new ChromeDriver();
	    driver.get(url);
		
	    driver.findElement(By.id("email" )).sendKeys("harikrishna");
		
		
		
		
		
	}

}
