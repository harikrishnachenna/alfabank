package com.DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=null;
		String url="http://Jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		//Classname="demo-frame"- property of iframe block
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//id="draggable"-property of dragable Element
		WebElement Draggable_Element=driver.findElement(By.id("draggable"));
		
		//id="droppable"-property of droppable Element
		WebElement Droppable_Element=driver.findElement(By.id("droppable"));
		
		//to perform mouse_hover related Drag and drop operations done by Actions classs
		Actions act=new Actions(driver);
		act.dragAndDrop(Draggable_Element, Droppable_Element).perform();
		/* We need to use 
		.perform to perform the operations on Actions class(look above line(31) of the script)		
		*/
		
		

	}

}
