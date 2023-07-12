package com.pages;

import org.mts.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage extends Baseclass{
	
	//default constructor
	public SearchProductPage() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement successLogin;
	
	@FindBy(id="search")
	private WebElement search;
	
	@FindBy(xpath="//button[@data-testid='searchbtn']")
	private WebElement searchclick;
	
	@FindBy(xpath="(//a[text()='Add'])[1]")
	private WebElement buttonadd;
	
	@FindBy(xpath="//button[@id='cart-21']")
	private WebElement addQuantity;
	
	//getters
	public WebElement getSuccessLogin() {
		return successLogin;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchclick() {
		return searchclick;
	}

	public WebElement getButtonadd() {
		return buttonadd;
	}

	public WebElement getAddQuantity() {
		return addQuantity;
	}

	

//business logic
	
	public void searchProduct(String productName) throws InterruptedException {
		String text = getText(getSuccessLogin());
		System.out.println(text);
		sendkeys(getSearch(), productName);
		Thread.sleep(2000);
//		sendkeysEnter(getSearch(), productName);
		clickButton(getSearchclick());
		Thread.sleep(2000);
		clickButton(getButtonadd());
		clickButton(getAddQuantity());
		
	}

	




}
