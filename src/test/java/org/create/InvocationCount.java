package org.create;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test (priority = 1, invocationCount = 5)
	private void Tc4() {
		System.out.println("TC 4");

	}
	@Test (priority = 2)
	private void Tc3() {
		System.out.println("TC 3");

	}
	@Test (priority = 1)
	private void Tc2() {
		System.out.println("TC 2");

	}
	@Test (priority = 1)
	private void Tc1() {
		System.out.println("TC 1");

	}
	

}
