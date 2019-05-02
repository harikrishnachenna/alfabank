package com.Navigatetogoogle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser_Nvaigate_google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./driverfiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		
		
	}

}
