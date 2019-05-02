package com.facebook_loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver =null;
		String url= "https://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys("harikrishna");
		driver.findElement(By.id("pass")).sendKeys("dont ask my password");
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}

}
