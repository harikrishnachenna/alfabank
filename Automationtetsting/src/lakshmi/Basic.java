package lakshmi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="http:google.com";
		
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);

	}

}
