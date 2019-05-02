package com.NewToursLinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Homepage_Links_count {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		
		
		
	 List<WebElement>links=driver.findElements(By.tagName("a"));
		int linkscount=links.size();
		System.out.println("The number of links in Newtours Home page :"+linkscount);
		
		

	}

}
