package com.Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String Url="http://facebook.com";
		
		
		System.setProperty("webdriver.gecko.driver", "./driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(Url);
		
		
		
	driver.findElement(By.id("email")).sendKeys("harikrishnachenna");
	driver.findElement(By.id("pass")).sendKeys("password");
	driver.findElement(By.id("loginbutton")).click();
	
		
		
	}

}
