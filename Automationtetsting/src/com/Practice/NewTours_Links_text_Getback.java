package com.Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.navigatetogoogle.Firefox;

public class NewTours_Links_text_Getback {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(url);
        
       List<WebElement>links=driver.findElements(By.tagName("a")); 
       //identify total number of links 
       int linkscount=links.size();
        System.out.println("The number of links in new tours web page :  "+linkscount);
	for(int i=0;i<linkscount;i++) {
		//identify the text of the each link
		String linkname=links.get(i).getText();
		System.out.println("The Name of the Link :"+linkname);
		links.get(i).click();
		
		System.out.println("The title of cueerent webpage :"+driver.getTitle());
	    System.out.println("The current URL of webpage    :"+driver.getCurrentUrl());
	    System.out.println();
	    
	    driver.navigate().back();
	    
	    links=driver.findElements(By.tagName("a"));
		
	             }
	
	}
}
