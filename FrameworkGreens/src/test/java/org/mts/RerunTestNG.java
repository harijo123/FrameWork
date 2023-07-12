package org.mts;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RerunTestNG {

	@Test
	private void m1() {
		System.out.println("hi 1");
	}
	
	
	@Test
	private void m2() {
		Assert.assertTrue(false);
		System.out.println("hi 2");
	}
	
	
	@Test
	private void m3() {
		System.out.println("hi 3");
	}
	
	
}
