package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apsrt_HeaderBlock_LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		String url="http://apsrtconline.in";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
//Aim is to Automate  apsrtc web page_ header block of element type link
		
		WebElement headerblock=driver.findElement(By.className("menu-wrap"));
		 List<WebElement>headerblocklinks=headerblock.findElements(By.tagName("a"));
		  int headerblocklinkscount=headerblocklinks.size();
		 
		  System.out.println("The Number of links in headerblock :"+headerblocklinkscount);
		 
		  for (int i=0;i<headerblocklinkscount;i++) {
			  
			   String headerblocklinkname=headerblocklinks.get(i).getText();
			   
			   System.out.println("The Name of the " +i+ "  headerblock link   :"+headerblocklinkname);
			   
			   headerblocklinks.get(i).click();
			   
			   System.out.println("The Title of the current web page :"+driver.getTitle());
			   System.out.println("The Current url of web page  :"+driver.getCurrentUrl());
			   System.out.println("  ");
			   driver.navigate().back();
			   
			   //re creating the Arraylist again
			   //syncronization---- webdribver script with the Application Under Test
			   
			   Thread.sleep(5000);//EXPLICIT WAIT
			   headerblock=driver.findElement(By.className("menu-wrap"));
			   headerblocklinks=headerblock.findElements(By.tagName("a"));
			 }
	      driver.quit();	
	}
}
