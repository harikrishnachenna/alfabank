package com.Selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_Dropdown_Select {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http://Newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		
     //<a href="mercuryregister.php">REGISTER</a>
	
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		WebElement country=driver.findElement(By.name("country"));
         /* in order to perform the selection of optional values
		in webdriver we got a class called select */ 
		
		Select selection=new Select(country);
		
		
		selection.selectByIndex(1);
		selection.selectByVisibleText("INDIA");
		selection.selectByValue("7");
		
		
	    
	
	}

}
