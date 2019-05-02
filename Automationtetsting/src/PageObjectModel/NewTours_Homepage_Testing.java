package PageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_Homepage_Testing extends BaseTest{
	
	@Test
	public void homerpage() throws InterruptedException {
	Welcome_Mercury_Tours wmt=PageFactory.initElements(driver, Welcome_Mercury_Tours.class);
	wmt.signon();
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println();
	
	driver.navigate().back();
	
	Thread.sleep(5000);
	
	wmt.contact();
	//wmt.support();
	
	driver.navigate().back();
	
	
	} 

}
