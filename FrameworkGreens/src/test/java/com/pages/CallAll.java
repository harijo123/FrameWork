package com.pages;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mts.Baseclass;

public class CallAll extends Baseclass {
	
	@Before
	public void bf() {
		chromeLaunch();
		getUrl("https://omrbranch.com/my-cart");
		maximizeWindow();
	}
	
	@Test
	public void firstpage() throws IOException, InterruptedException {
		PomLoginPage p = new PomLoginPage();
		p.loginPage(readValueFromExcel("data", 2, 0), readValueFromExcel("data", 2, 1));
		Thread.sleep(2000);
		
		SearchProductPage s = new SearchProductPage();
		s.searchProduct(readValueFromExcel("data", 2, 2));   
	
		Thread.sleep(3000);
		CheckOutPage c = new CheckOutPage();
		c.CheckOut(readValueFromExcel("data", 2, 4), readValueFromExcel("data", 2, 5), readValueFromExcel("data", 2, 6), readValueFromExcel("data", 2, 7), readValueFromExcel("data", 2, 8), readValueFromExcel("data", 2, 9), readValueFromExcel("data", 2, 10), readValueFromExcel("data", 2, 11), readValueFromExcel("data", 2, 13), readValueFromExcel("data", 2, 14), readValueFromExcel("data", 2, 15), readValueFromExcel("data", 2, 16));
	
		Thread.sleep(10000);
		OrderConfirmPage o = new OrderConfirmPage();
		o.order();
	}
}
