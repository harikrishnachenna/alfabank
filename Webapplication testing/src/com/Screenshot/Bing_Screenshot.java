package com.Screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class Bing_Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=null;
		String url="http://manabadi.com";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		File manabadi_screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		FileUtils.copyFile(manabadi_screenshot, new File("./Screenshots/manabadi2.png"));
		driver.close();
				
		
	}

}
