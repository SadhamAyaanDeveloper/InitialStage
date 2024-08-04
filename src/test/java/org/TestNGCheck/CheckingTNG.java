package org.TestNGCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CheckingTNG {
	
	@Test
	private void hey() {
		System.out.println("Hey");

	}
	@Test
	private void browser() {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
