package com.target.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitleAndUrl {
	
 @Test
public void titleAndUrl() {
 
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.amazon.com/");
	
	//title test
	String expectedTitle= "Amazon.com. Spend less. Smile more.";
	String actualTitle=driver.getTitle();
	System.out.println("This is Amazon title "+actualTitle);
	Assert.assertEquals(expectedTitle, actualTitle);
	
	//Url test
	String expectedUrl="https://www.amazon.com/";
	String actualyUrl= driver.getCurrentUrl();
	System.out.println(actualyUrl);
	Assert.assertEquals(expectedUrl, actualyUrl);
	driver.quit();
}
}