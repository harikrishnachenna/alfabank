package com.BrowserAutomation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomatingFirefoxBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./driverfiles/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();

	}

}
