package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_NumberofLinks_Names {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url  ="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		 
		List<WebElement>links =driver.findElements(By.tagName("a"));   
		 int linkscount =links.size();
	    System.out.println("The number of links on New Tours  Web application :"+linkscount);
		/*we need  below statements to be iterated number of times for this we usually go with for loop for
		 loop   
		 */
	    
	    for(int i=0;i<linkscount;i++) {
	    	
	    String LinkName=links.get(i).getText();
		System.out.println("The Text of "  +   i   +"  "+ "link of the webpage  :" +LinkName);
		
	       }
		}
	}


