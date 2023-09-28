package org.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Client {
@Test
private void tc1() {
	System.out.println("Test - 1");
	Assert.assertTrue(false,"Check tc-1");
}
@Test
private void tc2() {
	System.out.println("Test - 2");
}
@Test
private void tc3() {
	System.out.println("Test - 3");
}
@Test
private void tc4() {
	System.out.println("Test - 4");
}

}
