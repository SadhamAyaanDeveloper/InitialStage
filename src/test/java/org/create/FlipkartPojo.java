package org.create;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseInfo2{
	
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy (xpath = "//input[@class='Pke_EE']")
	private WebElement search;
	
	@FindBy(xpath = "//button[@class='_2iLD__']")
	private WebElement button;
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getButton() {
		return button;
	}


	
}
