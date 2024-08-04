package org.create;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AllAnnotation extends BaseInfo{
	
	@Test(priority=3)
	private void tc2() {
		pageurl();
	}
	@Test(priority=2)
	private void tc3() {
		launUrl("https://www.flipkart.com/");
	}
	@Test (priority=1)
	private void tc1() {
		BrowserLaunch();
	}
	
	@Test(priority=4)
	private void tc4() {
		pagetitle();

	}
	
	@Test
	private void tc5() {
		FlipkartPojo f=new FlipkartPojo();
		
		WebElement search = f.getSearch();
		search.sendKeys("Mobile");
		
//		WebElement press = f.getButton();
//		press.clear();

	}

}
