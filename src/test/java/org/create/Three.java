package org.create;

import org.testng.annotations.Test;

public class Three {
	
	@Test (priority = 0)
	private void god() {
		System.out.println("God");

	}
	@Test (priority = 1)
	private void bless() {
		System.out.println("Bless");

	}
	@Test (priority = 2)
	private void you() {
		System.out.println("You");

	}

}
