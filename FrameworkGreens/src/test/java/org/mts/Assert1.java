package org.mts;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assert1 extends Baseclass{
	 WebDriver driver;
	@Test
	public void test() throws IOException {
		
	chromeLaunch();
	getUrl("http://www.omrbranch.com/");
	maximizeWindow();
	WebElement username = findLocatorById("email");
	sendkeys(username, readValueFromExcel("data", 1, 0));
	String user = username.getAttribute("value");
	Assert.assertEquals("value","hariijack.97@gmail.com",user);
	
	WebElement password = findLocatorById("pass");
	sendkeys(password, readValueFromExcel("data", 1, 1));	
	
	
	WebElement loginbutton = findLocatorByXpath("//button[@value='login']");
	loginbutton.click();
	
//	WebElement text = findLocatorByXpath("//span[text()='Enable Location']");
//	String text2 = text.getText();
//	boolean b = text2.contains("Enable Location");
//	Assert.assertTrue("verify login ", b);
	
	
	}

	

}
