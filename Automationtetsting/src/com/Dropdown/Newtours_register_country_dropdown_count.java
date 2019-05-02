package com.Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_register_country_dropdown_count {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http://Newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get(url);
		
	//<a href="mercuryregister.php">REGISTER</a>
		 WebElement register=driver.findElement(By.linkText("REGISTER"));
		 register.click();
		 
		 //SELECTOR-"country"
		  WebElement country=driver.findElement(By.name("country"));
		  List<WebElement> countries=country.findElements(By.tagName("option"));
		  int countrycount=countries.size();
		  System.out.println("The total number of countries in country dropdown"+countrycount);
		 
		  for(int i=0;i<countrycount;i++) {
		  
			   String nameofthecountries=countries.get(i).getText();
			   System.out.println(i+"name of country dropdown"+nameofthecountries);
		  
		  }
		driver.quit();
	}

}
