package com.target.webDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	String browser="Chrome";
	
	@Test
	
	
	public void openApplication() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			 
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
	    driver= new EdgeDriver();
			
		}
		
		else if (browser.equalsIgnoreCase("firefox")) {
			
				WebDriverManager.firefoxdriver().setup();
			    driver= new FirefoxDriver();
				
	}		
		else {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		   
		}
		driver.get("https://www.target.com/");
		    driver.quit();	
	}
}



