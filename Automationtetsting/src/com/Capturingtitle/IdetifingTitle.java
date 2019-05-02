package com.Capturingtitle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdetifingTitle {

	public static void main(String[] args) {
		/*WebDriver driver=null;
		
		String url="http://makemytrip.com";
		
		driver=new FirefoxDriver();
		
		driver.get(url);
		
		String Actual_Title=driver.getTitle();
		
		System.out.println("The title of make my trip home page is :"+Actual_Title);
		
		driver.close();
*/		
		
		/*WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		
		String actual_Title=driver.getTitle();
		
		System.out.println("The the Title of NewTours Home Page is : "+ actual_Title);
		
		driver.quit();
		
		
		*/
		
		System.setProperty("WebDriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");

driver.findElement(By.id("email")).sendKeys("chenna");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
