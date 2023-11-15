package com.target.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToCloseApplication {

	@Test
public void openAndClose(){
		//open application
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		//close application
		
		
		driver.quit();
	
}

	
}
