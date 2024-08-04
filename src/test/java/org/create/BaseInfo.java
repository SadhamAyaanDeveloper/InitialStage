package org.create;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseInfo {
	
	static WebDriver driver;
	static Actions a;
	static Robot r;
	
	public static void BrowserLaunch() {		
		driver = new ChromeDriver();
			}
	
	public static void exitbrowser() {
				driver.close();
	}
	public static void pagetitle() {
		String title = driver.getTitle();
		System.out.println(title);	
	}
	public static void pageurl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void launUrl(String url) {
		driver.get(url);
	}
//	
////    public void slowness() {
////	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
////
////    }
	
	public static void filltext(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	public static void clickbutton(WebElement ele) {
		ele.click();
	}
	public static void mousehover(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();
			}
	public static void copy(WebElement point) throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static void paste() {
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
	}
}
