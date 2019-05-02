package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_PartialLinkText_click {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	
		/*
		 <a href="mercuryregister.php?osCsid=6f43a35d95a72ada3e6a4c68f57d7838">REGISTER</a>
		 
		 locator=PartialLinkText
		 
		 selector=REGI
	*/
		driver.findElement(By.partialLinkText("REGI")).click();
	
	
	}
	
}
