package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_images_click {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="https://google.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		
		
		/*<a with attribute href as a element of type called Link and the locator can be "linktext"*
		   and the selector will be the end of the web application url 
		   in above url example 
		   locator=linktext(bcoz it has anchor tag anchor tag with href so is of type link 
		   and 
		   Locator = linktext) 
		   Selector= Gmail*/
		driver.findElement(By.linkText("Images")).click();
		

//<a class="gb_d" data-pid="23" href="https://mail.google.com/mail/?tab=wm&amp;authuser=0">Gmail</a>		
//<a class="gb_d" data-pid="2" href="https://www.google.co.uk/imghp?hl=en&amp;tab=wi&amp;authuser=0">Images</a>
		
		
		

	}

}
