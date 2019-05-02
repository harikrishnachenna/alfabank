package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_register_country_dropdown_count {

	public static void main(String[] args) {
		
		
		WebDriver driver= null;
		String url="http:newtours.demoaut.com";
	    
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
	   
		//<a href="mercuryregister.php?osCsid=60f7ddc70c1b95ea278c0a3da7eb7c58">REGISTER</a>
		  
		 WebElement REGISTER=driver.findElement(By.linkText("REGISTER"));
		  REGISTER.click();
		  
		   List<WebElement> country=driver.findElements(By.name("country"));
		   List <WebElement>countries=driver.findElements(By.tagName("option"));
		   int coutriescount =countries.size();
		   System.out.println("The total number of countries in country drop down :"+coutriescount);
		   
		   for(int i = 0;i<coutriescount;i++)
		   {
		    String countriesname=countries.get(i).getText();
		    System.out.println(i+ " " +coutriescount);
		   }
		   
		  
	
	
	
	
	}

}
