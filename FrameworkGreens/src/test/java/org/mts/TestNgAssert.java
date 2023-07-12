package org.mts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestNgAssert {

	@Test
	private void m1() {
		System.out.println("111");
	}

	@Test
	private void m2() {	
		System.out.println("222");
	
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		
		System.out.println("333");
		//s.assertAll();
		System.out.println("444");
	}
	
	@Test
	private void m3() {
		System.out.println("555");
	}
}
