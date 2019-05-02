package com.Annotations;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GoogleTest {
	
	WebDriver  driver=null;
	String url="http://google.com";
	
	
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	
	
	} 
		
	@Test
	public void GoogleTitleTest() {
		String Title=driver.getTitle();
		System.out.println("The title of the Google Webpage"+Title);
		
	
		
	}
	
	@Test
	public void googleLogoTest() {
		//id -logo-default- property of the logo element
		
    driver.findElement(By.id("hplogo"));	
		
	}
	
	
   @AfterMethod
   public void tearDown() {
			driver.quit();
			
		}
		
		
	}
	
	


