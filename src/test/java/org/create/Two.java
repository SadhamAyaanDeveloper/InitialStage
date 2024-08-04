package org.create;

import org.testng.annotations.Test;

public class Two {
	
	@Test (priority = 0)
	private void Have() {
		System.out.println("Have");

	}

	@Test (priority = 1)
	private void Great() {
		System.out.println("Great");

	}
	@Test (priority = 2)
	private void Day() {
		System.out.println("Day");

	}
}
