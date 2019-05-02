package com.Selection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_currentloation_industry_select {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url= "http://my.monsterindia.com/sponsered_popup.html";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		
	  //class="border_grey1"--property of the border location
		
	  WebElement currentlocation=driver.findElement(By.className("border_grey1"));
		 
	  Select selection=new Select(currentlocation);
	   
	  selection.selectByIndex(25);
		 
	 //id="id_industry"=is the property of industry
	  WebElement industry=driver.findElement(By.id("id_industry"));
		   
		 
	  Select sele=new Select(industry);
      sele.selectByIndex(1);
      sele.selectByValue("4");
      sele.selectByVisibleText("Banking/ Financial Services");
		   
	 //we can delect the values by uding the de-select method
	  sele.deselectByIndex(1);   
		 
		
	}

}
