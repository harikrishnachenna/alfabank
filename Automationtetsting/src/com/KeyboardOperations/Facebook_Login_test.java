package com.KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Login_test {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http:facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		//id-"email"
		driver.findElement(By.id("email")).sendKeys("harikrishna.chenna");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("hello").perform();
		
		act.sendKeys(Keys.ENTER).perform();
	
		
		
		
		
	}

}
