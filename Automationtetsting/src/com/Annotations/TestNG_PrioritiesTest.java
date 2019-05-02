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

public class TestNG_PrioritiesTest {
	
	WebDriver driver=null;
	String url="http://google.com";
	
	@BeforeMethod
	public void Setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	@Test(priority=3,groups="Title related")
	public void GoogleTitle() {
		
		String Google_title=driver.getTitle();
		System.out.println("The Title of the Google web page :"+Google_title);
	}
	
	@Test(priority=2,groups="title related")
	public void GooglesTitle() {
		
		System.out.println("google title related test case1");
		
	} 
	
	@Test(priority=1,groups="title related")
	public void GooglesTitle1() {
		System.out.println("google title related test case2");
		
	} 
	
	@Test(priority=4, groups="Logo related")
	public void Googlelogo() {
		
		System.out.println("Logo related test case1");
	}
	
	@Test(priority=5, groups="Logo Related")
	public void Googlelogo1() {
		System.out.println("Logo related test case2");
	}
	
	@Test(priority=6,groups="Logo Related")
	public void Googlelogo2() {
		System.out.println("Logo related test case3");
	}
	
	@Test(priority=7,groups="UI_RELATED")
	public void GoogleUI() {
		System.out.println("UI related test case");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	
	}
}
	

