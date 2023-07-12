package com.pages;

import org.mts.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage extends Baseclass {
	
	//default constructor
	public PomLoginPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id="email")
	private WebElement textuserName;
	
	@FindBy(id="pass")
	private WebElement textpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;

	
	//select getters

	public WebElement getTextuserName() {
		return textuserName;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	
	//write business logic
	public  void loginPage(String username, String password) {
		sendkeys(getTextuserName(),username );
		sendkeys(getTextpassword(), password);
		clickButton(getLoginbutton());
	}
		
		
}
