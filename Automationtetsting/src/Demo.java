import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.navigatetogoogle.Firefox;

public class Demo {

	public static void main(String[] args) { 
			WebDriver driver =null; 
			String url="http://facebook.com";
			
			
			System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			
			driver.findElement(By.id("email")).sendKeys("ILYAS");
			driver.findElement(By.id("pass")).sendKeys("password");
			}
		
	
	/*   1.basic prog to set system property and get the url .
	 * 
	 * System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	
	driver.get("http:google.com");   */
	
		/*2. prog to navigate to firefox browser and navigate to reed.co.uk
		 * 2. System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://reed.co.uk");
		
		*/
	
	 /*3. write a script to navigate to google chrome and open facebook browser and enter user credentials and 
	  click on login 
          
          WebDriver driver=null;
         String url ="http://facebook.com";
	
	     System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
         driver=new ChromeDriver();
	     driver.get(url);
	     
	     driver.findElement(By.id("email")).sendKeys("harikrishna.chenna");
	     
	     driver.findElement(By.id("pass")).sendKeys("dont dare to hack my account");
	     
	     driver.findElement(By.id("u_0_2")).click();
	     
	     
	   */  
//=============================================================================================
		
		/*WebDriver driver=null;
		String url="https://Google.com";
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		
		//locator Link text
		//selector Images
		
		driver.findElement(By.partialLinkText("Image")).click();
		*/
		
//============================================================================================================		
	     
	    // saving the element in variable  
		//WebDriver driver=null;
		//String url="https://Google.com";
		
	//	System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		//driver=new FirefoxDriver();
		//driver.get(url);
		
		//locator Link text
		//selector Images
		
		// saving the element in a variable
		 //WebElement Image=driver.findElement(By.partialLinkText("Image"));
		 //Image.click();
	      
	
	
	} 
	
	
	
	}
