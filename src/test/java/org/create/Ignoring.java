package org.create;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class Ignoring {
	
	@Test(priority = 2)
	private void Tc9() {
		System.out.println("TC 9");
	}
	@Test(priority = 3)
	private void Tc8() {
		System.out.println("TC 8");
	}
	@Test(priority = 6, enabled = false)
	private void Tc6() {
		System.out.println("TC 6");
	}

	@Test(priority = 1)
	private void Tc5() {
		System.out.println("TC 5");
	}

	@Test(priority = 5,enabled = false)
	private void Tc7() {
		System.out.println("TC 7");
	}

	@Test(priority = 7)
	private void Tc1() {
		System.out.println("TC 1");
	}

	@Test(priority = 8,enabled = false)
	private void Tc4() {
		System.out.println("TC 4");
	}


}
