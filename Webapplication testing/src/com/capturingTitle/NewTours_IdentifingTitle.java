package com.capturingTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_IdentifingTitle {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		
		String url="http://Newtours.demoaut.com";
		System.setProperty("webdriver.gecko.driver", "./driverfiles/geckodriver.exe");
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		String actualtitle=driver.getTitle();
		System.out.println("The Actaul title of the page :" +actualtitle);

		
		
		
	}

}
