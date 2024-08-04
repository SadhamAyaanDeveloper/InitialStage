package org.create;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends SampleInfo {
	
	public AmazonPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
		
	
	public WebElement getText() {
		return text;
	}

	public WebElement getAll() {
		return all;
	}

	public WebElement getSell() {
		return sell;
	}

	@FindBy(xpath = "//input[@type='text']")
	private WebElement text;
	
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	private WebElement all;
	
	@FindBy(xpath = "(//a[@class='nav-a  '])[3]")
	private WebElement sell;
			
	

}
