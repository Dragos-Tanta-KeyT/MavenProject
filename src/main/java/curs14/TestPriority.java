package curs14;

import org.testng.annotations.Test;

public class TestPriority {

	@Test(priority = 1)
	public void one() {
		System.out.println("One");
	}
	
	@Test(priority = 2)
	public void two() {
		System.out.println("Two");
	}
	
	@Test(priority = 3)
	public void three() {
		System.out.println("Three");
	}
	@Test
	public void four() {
		System.out.println("Four");

	}
	@Test
	public void five() {
		System.out.println("Five");

	}
	
}
