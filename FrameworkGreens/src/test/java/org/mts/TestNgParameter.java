package org.mts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter extends Baseclass {
	
	
	
	@Parameters({"username11","password111"})
	@Test
	public void loginpage(@Optional("admin")String username, String password) {
		chromeLaunch();
		getUrl("https://www.facebook.com/");
		maximizeWindow();
		findLocatorById("email").sendKeys(username);
		findLocatorById("pass").sendKeys(password);
		
	}
//	@Parameters({"username222","password222"})
//	@Test
//	public void loginpage1(String username, String password) {
//		chromeLaunch();
//		getUrl("https://www.facebook.com/");
//		maximizeWindow();
//		findLocatorById("email").sendKeys(username);
//		findLocatorById("pass").sendKeys(password);
//		
//	}
	
	
	

}
