package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Vacation_BacktoHome {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null; 
		String url="http:NewTours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		//To maximise the window
		driver.manage().window().maximize();
		
		driver.get(url);
		
	    driver.findElement(By.linkText("Vacations")).click();
	    
	    
	    //<img src="/images/forms/home.gif" width="118" height="23" border="0">--x path for back to home web element
	    driver.findElement(By.xpath("//img[@src='/images/forms/home.gif'] "));
	    
	    Thread.sleep(6000);
	    driver.navigate().back();
	    
	}
}
