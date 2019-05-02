package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterTest {
	
	WebDriver driver=null;
	String url="https://login.yahoo.com/";
	@Test
	@Parameters({"url","emailid"})
	public void YahooLoginTest(String url,String emailid) {
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	driver=new ChromeDriver(); 
	driver.get(url);
		
	
	////*[@id="login-username"]--property of user name element
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailid);//enter username
	
	////*[@id="login-signin"]
	driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();//click on next button
	
	
	
	} 

	
	
	
	
	
	
	
	
	
	}

