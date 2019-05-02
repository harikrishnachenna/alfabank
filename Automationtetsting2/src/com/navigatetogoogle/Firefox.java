package com.navigatetogoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Driverfiles/geckodriver.exe" );
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http:google.com");
		driver.navigate().to("http://facebook.com");
		
	
	
		

		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:google.com");
		
		
		/*System.setProperty("webdriver.chrome.driver","/Driverfiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com")*/

	/*System.setProperty("webdriver.edge.driver", "./library/MicrosoftWebDriver.exe");
	EdgeDriver driver=new EdgeDriver();
	driver.get("http://reeds.com");

	*/
	}

}
