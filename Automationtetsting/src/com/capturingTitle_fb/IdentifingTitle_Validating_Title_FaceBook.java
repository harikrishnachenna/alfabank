package com.capturingTitle_fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifingTitle_Validating_Title_FaceBook {

	public static void main(String[] args) {
		 WebDriver driver =null;
		 String url="http:facebook.com";
		 
		 
		 System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get(url);
		 
		 
		 String expectedtitle= "Facebook – log in or sign up";
		
		 //1.CAPTURING THE TITLE
		String actualtitle=driver.getTitle();
		 
		//2.VALIDATING THE TITLE BY COMAPRING THE ACTUAL TITLE AND EXPECTED TITLE
 		   if(actualtitle.equals(expectedtitle)){
			 
			 System.out.println("Test Case Passed=TRUE ");
		    }
		 
		 else {
			 
			 System.out.println("Test case un successful=FALSE");
			 
		 }
		 
	}

}
