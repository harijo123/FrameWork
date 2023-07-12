package org.mts;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProvider extends Baseclass {
	
//	public TestNgDataProvider() {
//		
//	PageFactory.initElements(driver, this);
//	}
//	
//	@FindBy(id="email")
//	private WebElement textuserName;
//	
//	@FindBy(id="pass")
//	private WebElement textpassword;
	 
	@Test (dataProvider = "logindata")
	public void loginpage(String username, String password) {
		chromeLaunch();
		getUrl("https://omrbranch.com/");
		maximizeWindow();
		findLocatorById("email").sendKeys(username);
		findLocatorById("pass").sendKeys(password);
	
		
	}

	@DataProvider(name="logindata", indices= {0,3})
	public Object[][] datapro() throws IOException{
		Object[][] data = new Object[5][2];
		
		//0th row
		data[0][0]="hari";
		data[0][1]="12345";
		
		//1st row
		data[1][0]="priya";
		data[1][1]="54321";
		
		//2nd row
		data[2][0]="agni";
		data[2][1]="67890";
		
		//3rd row
		data[3][0]=readValueFromExcel("data", 2,0);
		data[3][1]=readValueFromExcel("data",2,1);
		
		//4th row
		data[4][0]="yaazhan";
		data[4][1]="1029384756";
		
		return data;
		
	}
	
	
	
}
