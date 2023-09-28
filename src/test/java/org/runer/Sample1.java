package org.runer;

import org.junit.Assert;
import org.junit.Test;

public class Sample1 {
@Test
public void tc2() {
	System.out.println("Testcase -----2");
	Assert.assertTrue(1066>200);
	System.out.println("Testcase -----22");
}
@Test
public void tc3() {
	System.out.println("Testcase -----3");
	System.out.println("Testcase -----33");
}
@Test
public void tc1() {
	System.out.println("Testcase -----1");
	Assert.assertTrue("check tc2",100< 200);
	System.out.println("Testcase -----11");
}
}
