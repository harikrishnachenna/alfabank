package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login_check {

	public static void main(String[] args) {
		WebDriver driver =null;
		String url="http://facebook.com";
		
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("ILYAS");
		driver.findElement(By.id("pass")).sendKeys("password");
		}
 }
//WebDriver driver=null;
 //String url="https://Google.com";

//System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
//driver=new FirefoxDriver();
//driver.get(url);

//locator Link text
//selector Images