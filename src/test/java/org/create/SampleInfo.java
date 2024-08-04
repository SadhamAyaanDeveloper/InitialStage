package org.create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SampleInfo extends BaseInfo {
	
	public static void main(String[] args) {
		
		BrowserLaunch();
		launUrl("https://www.amazon.in/");
		pagetitle();
		pageurl();
		
		AmazonPojo A=new AmazonPojo();
		
		WebElement type = A.getText();
		filltext(type, "Hard Disk");
		
		driver.navigate().refresh();
		
		filltext(type, "Samsung s24");
		
	}

}
