package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hellosignin_MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=null;
		String url="http:amazon.in";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//Thread.sleep(5000);          //explicit wait
		
		//id=nav-link-accountList---property of hello,sign in
		WebElement hellosignin=driver.findElement(By.id("nav-link-accountList"));
		
		//To perform mouse or keyboard operation we need to use Actions class 
		Actions act=new Actions(driver);
		act.moveToElement(hellosignin).perform();
		
		//Link text-"Your Orders"----property of your orders
		Thread.sleep(3000);
	    WebElement yourorders=driver.findElement(By.linkText("Your Orders"));
	    yourorders.click();
		
		
		
		
	

	}

}
