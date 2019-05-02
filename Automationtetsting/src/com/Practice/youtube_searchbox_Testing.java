package com.Practice;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_searchbox_Testing {

	public static void main(String[] args) {


		WebDriver driver=null;
		String url="https://www.youtube.com/?gl=GB&hl=en-GB";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		
		
		
		 /*
		  * <yt-icon class="style-scope ytd-searchbox"><svg viewBox="0
		  *  0 24 24" preserveAspectRatio="xMidYMid meet" focusable="false" class="style-scope yt-icon" style="pointer-events: none; display: block; width: 100%; height: 100%;"><g class="style-scope yt-icon">
        <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z" class="style-scope yt-icon"></path>
      </g></svg>
    
    
  </yt-icon>
		  */
		
		 driver.findElement(By.id("search")).sendKeys("todays bexit issue");
		 driver.findElement(By.id("search-icon-legacy")).click();
		 
		 //2.NO OF LINKS IN YOUTUBE
		 
	java.util.List<WebElement>link=driver.findElements(By.tagName("a"));
		 
		  int linkscount=link.size();
		  System.out.println(linkscount);
		 
		 
		 
		
		

	}

}
