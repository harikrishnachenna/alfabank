package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Vations_BackyToHome_click {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=null; 
	String url="http:NewTours.demoaut.com";
	
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	//To maximise the window
	driver.manage().window().maximize();
	
	driver.get(url);
	
   WebElement vacations=driver.findElement(By.linkText("Vacations"));
   vacations.click();
    
    /*
      <img src="/images/forms/home.gif" width="118" height="23" border="0">
     
     /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
     */
   //img[@src'/images/forms/home.gif']--the property of the xpath 
    
    Thread.sleep(5000);
    
    //driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
    
                                     //or
	
	driver.findElement(By.xpath("//*[@src='/images/forms/home.gif']")).click();

	}

}
