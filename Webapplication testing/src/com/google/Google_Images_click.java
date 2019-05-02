package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Images_click {

	public static void main(String[] args) throws InterruptedException {
		
		
	WebDriver driver=null;
	String url="HTTP://google.com";
	
	System.setProperty("webdriver.gecko.driver", "./driverfiles/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get(url);
	
	
	
	driver.findElement(By.className("gb_d")).click();
	
	}
	
	

}
