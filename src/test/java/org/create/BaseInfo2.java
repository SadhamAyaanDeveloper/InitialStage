package org.create;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class BaseInfo2 {
	
	static WebDriver driver;  //interface
	static Action a ;   //interface
	static Robot r;    //Class
	
	public static void browserLaunch() {
		driver=new ChromeDriver();
	}
	public static void pageUrl(String url) {
		driver.get(url);
	}
	public static void getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	//               (dataype Referance)    
	public static void click(WebElement ele) {  // we need Datatype and Referance is need that why we are using Webelement ele.
	  ele.click();
	}
	//                   (dataype ref, string to enter the value)
	public static void filltext(WebElement ele, String value) {
		ele.sendKeys(value);
	}
	public  static void pageTitle() {
	     String title = driver.getTitle(); 
	     System.out.println(title);
	}
	
    	
	
}
