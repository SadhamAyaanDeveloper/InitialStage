package org.create;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Check {
	
	@Test
	private void helllo() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.federalbank.co.in/");
	}
}
