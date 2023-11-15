package com.target.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToOpenApplication {

  @Test
  
	public void openChrome() {
	 //How to open chrome browser
	  //bonigarcia is responsible to set up driver.exe 
	  WebDriverManager.chromedriver().setup();
	  // ChromeDriver== is responsible to find browser in your machine and open it.
	  WebDriver driver= new ChromeDriver ();
	  
	  //how to open an application
	  
	// WebDriverManager.chromedriver().setup();
			//
			driver.get("https://www.amazon.com/");
	 
		}	
	
@Test
  public void openEdge() {
	  //this is driver exe
	WebDriverManager.edgedriver().setup();
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.amazon.com/");
}
@Test
public void openFirefox() {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");

}
}