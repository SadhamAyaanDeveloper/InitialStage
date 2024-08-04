package org.create;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority= -1)
	private void tc5() {
		System.out.println("TC 5");

	}
	
	@Test (priority= 1)
	private void tc4() {
		System.out.println("TC 4");

	}
	@Test (priority= 2)
	private void tc1() {
		System.out.println("TC 1");

	}
	@Test (priority= 5)
	private void tc3() {
		System.out.println("TC 3");

	}
	@Test (priority= 3)
	private void tc6() {
		System.out.println("TC 6");

	}
	@Test (priority= 4)
	private void tc2() {
		System.out.println("TC 2");

	}

}
