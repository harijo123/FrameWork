package com.pages;

import java.io.IOException;

import org.mts.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPage extends Baseclass{
	public OrderConfirmPage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(id="(//span[@class='font16 fontNormal color36'])[1]")
	private WebElement orderId;

	
	//getters
	public WebElement getOrderId() {
		return orderId;
	}

	//business logic	
	public void order() throws IOException {
		
		String text = getText(getOrderId());
		System.out.println(text);
	//	writeValueFromExcel("data", 2, 17, text);
		
	}
	
}
