package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		 WebDriver driver=null;
	     String url="http:facebook.com";
		
		 System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		 WebElement Facebook_login=driver.findElement(By.xpath("//*[@data-testid='royal_email']"));
		 Facebook_login.sendKeys("harikrishna");
		 
		 //<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		 WebElement Facebook_password=driver.findElement(By.xpath("//*[@data-testid='royal_pass']"));
		 Facebook_password.sendKeys("9849477970");
		 
		 
		 //<label class="uiButton uiButtonConfirm" id="loginbutton"
		 driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		 
		 
		 
		 
		 
		 
		  
		

	}

}
