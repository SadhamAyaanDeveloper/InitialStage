package org.create;

import org.openqa.selenium.WebElement;

public class FilipkartSample extends BaseInfo2{
	
   public static void main(String[] args) {
	  
	   browserLaunch();
	   pageUrl("https://www.flipkart.com/");
	  
	   
	   FlipkartPojo f=new FlipkartPojo();
	   
	   WebElement search = f.getSearch();
	   filltext(search, "mobile");
	   
	   WebElement button = f.getButton();
	   click(button);
}

}
