package org.create;

import org.testng.annotations.Test;

public class One {
	
	
	@Test (priority = 0)
	private void Hello() {
		System.out.println("Hello");

	}
	@Test(priority = 0)
	private void Guys() {
		System.out.println("Guys");

	}
	@Test (priority = 0)
	private void GoodMorning() {
		System.out.println("GoodMorning");

	}

}
