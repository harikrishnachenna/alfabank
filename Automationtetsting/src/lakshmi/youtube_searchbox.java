package lakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_searchbox {

	public static void main(String[] args){

	WebDriver driver=null;
	String url="https://youtube.com";
	
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get(url);
	
	
	driver.findElement(By.id("search")).sendKeys("who is venkatalakshmi kandhula");
	driver.findElement(By.id("search-icon-legacy")).click();
		
	
	
	//style-scope ytd-searchbox
	/*
	 * 
	 * <input id="search" autocapitalize="none" autocomplete="off" autocorrect="off" name="search_query" tabindex="0" type="text" spellcheck="false" aria
	 * -haspopup="false" role="combobox" aria-autocomplete="list" dir="ltr" class="ytd-searchbox" style="outline: none;" placeholder="Search" aria-label="Search">
	 */
	
	
	/*<div id="container" class="style-scope ytd-searchbox">
        
        <div id="search-container" class="ytd-searchbox-spt " slot="search-container"></div>
        <yt-icon-button id="search-icon" class="search-icon style-scope ytd-searchbox" hidden=""><button id="button" class="style-scope yt-icon-button" aria-label="Search">
          <yt-icon class="style-scope ytd-searchbox" disable-upgrade="">
          </yt-icon>
        </button></yt-icon-button>
        <paper-tooltip for="search-icon" prefix="" class="style-scope ytd-searchbox" role="tooltip" tabindex="-1">
    

    <div id="tooltip" class="hidden style-scope paper-tooltip">
      Search
    </div>
  </paper-tooltip>
      </div>
	 * 
	 */
//id="container

	//id="search-icon-legacy"
	
	
	//driver.findElement(By.id("container")).sendKeys("venkata lakshmi kandula");
	//driver.findElement(By.id("search-icon-legacy")).click();
	
	//Thread.sleep(10000);
	
	//driver.close();
	
	
	}

}
