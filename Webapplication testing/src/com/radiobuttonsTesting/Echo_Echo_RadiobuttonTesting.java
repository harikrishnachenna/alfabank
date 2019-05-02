package com.radiobuttonsTesting;


import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.AbstractDocument.LeafElement;
import javax.swing.text.html.ListView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class Echo_Echo_RadiobuttonTesting {

	

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://www.echoecho.com/htmlforms10.htm";
		
		System.setProperty("Webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		 WebElement Radiobuttons_block=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
	  /*<input type="radio" name="group1" value="Milk"> Milk<br>
		 <input type="radio" name="group1" value="Butter" checked> Butter<br>
		 <input type="radio" name="group1" value="Cheese"> Cheese*/
		 
		 /*below we are not going to use driver elements be cause we only need the 
		  * specific block(Radio button block)of the elements  
		 */
		   
		 
		 
		  List<WebElement>Radiobutton_blockgroup1=Radiobuttons_block.findElements(By.name("group1"));
		  
		 
		 
		 

		   
		 
		 
		 
		 
		 
	}

}
