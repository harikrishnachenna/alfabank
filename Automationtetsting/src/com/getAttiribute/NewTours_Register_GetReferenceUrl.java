package com.getAttiribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_GetReferenceUrl {

	public static void main(String[] args) {


	WebDriver driver=null;
	String url="http:Newtours.demoaut.com";
	
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(url);
	
	WebElement register =driver.findElement(By.linkText("REGISTER"));
	
	// The expected url---http://newtours.demoaut.com/mercuryregister.php?osCsid=925ecf36b53e90ead26083eaa52b426d
    String Expectedurl=register.getAttribute("href");
	System.out.println("The Expected Url :"+Expectedurl);
	register.click();
	
	String ActualURL=driver.getCurrentUrl();
	 System.out.println("The Actual Url   :"+ActualURL);
	 
	 //to validate the result of the Test case
	 if(Expectedurl.equals(ActualURL)){
		 
		 System.out.println("Successfully Navigated to the Expected webpage--- Pass");

	 } 
		 
		else{
		 
		 System.out.println("Failed to navigate to the Expected webpage------ Fail");
	 }
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	}

}
