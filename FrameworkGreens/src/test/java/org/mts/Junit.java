package org.mts;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Junit extends Baseclass{

	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass() {
		chromeLaunch();
		getUrl("http://www.omrbranch.com/");
		maximizeWindow();
	}
	
	@Before
	public void beforeClass() throws IOException {		
	implicitWait();
	screenshot("11");	
	}
	
	@Test
	public void test() throws IOException {
	WebElement username = findLocatorById("email");
	sendkeys(username, readValueFromExcel("data", 1, 0));
	
	WebElement password = findLocatorById("pass");
	sendkeys(password, readValueFromExcel("data", 1, 1));	
	}

	@After
	public void afterClass() throws IOException {
		screenshot("22");	
	}
	
	@AfterClass
	public static void AfterClass() {
	System.out.println("done");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
