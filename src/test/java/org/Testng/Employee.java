package org.Testng;

import org.testng.annotations.Test;

public class Employee {
	@Test
	private void tc11() {
		long id=Thread.currentThread().getId();
		System.out.println("Test - 11"+id);
	}
	@Test
	private void tc22() {
		System.out.println("Test - 22"+Thread.currentThread().getId());
	}
	@Test
	private void tc33() {
		System.out.println("Test - 33"+Thread.currentThread().getId());
	}
	@Test
	private void tc44() {
		System.out.println("Test - 44"+Thread.currentThread().getId());
	}

}
