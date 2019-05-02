package com.Dropdown_selection;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http:/newtours.demoaut.com";
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		
		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		Register.click();
		
		 WebElement country=driver.findElement(By.name("country"));
		 
       Select selection =new Select(country);
        //selection.selectByIndex(5);
       selection.selectByValue("26");
        
       
		 
		
		
		
	}

}
