package org.TestNGCheck;

import org.testng.annotations.Test;

public class prioirtyClass {
	
	@Test(priority = 1)
	private void login() {
		System.out.println("Great you have logged in");

	}
	@Test (priority = 2)
	private void searchProduct() {
		System.out.println("You can search a product");

	}
	@Test(priority = 3)
	private void selectPro() {
		System.out.println("Select a product which you need");

	}
	@Test(priority = 4)
	private void addtoCart() {
		System.out.println("You can keep your selected item in cark");

	}
	@Test (priority = 5)
	private void payBill() {
		System.out.println("You can make payment for the select product");

	}
	@Test(priority = 6)
	private void logOut() {
		System.out.println("Finally purchase done Thank you");

	}

}
