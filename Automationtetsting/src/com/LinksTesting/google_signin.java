package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_signin {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http:google.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		
		
		/*<a class="gb_5d gb_1 gb_kb" id="gb_70" href="https://accounts.google.com
		 
		 /ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/search
		  
		  %3Fq%3Dgoogle%26oq%3Dgoogl%26aqs%3Dchrome.0.69i59j69i60l3j0l2.1203j0j7%26sourceid%3Dchrome%26ie%3DUTF-8
		  
		  " target="_top">Sign in</a>
	
	locator=LinkText
	selector=Sign in
	
	*/
	
	 WebElement signin=driver.findElement(By.linkText("Sign in"));
	                     signin.click();
	
	
	}
	

}
