package org.mts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AutomationGrocery extends Baseclass {

	public static void main(String[] args) throws IOException {
		AutomationGrocery a = new AutomationGrocery();
			a.grocery();
	}
	public void grocery() throws IOException{
		chromeLaunch();
		getUrl("http://www.omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
		WebElement username = findLocatorByXpath("//input[@id='email']");
		sendkeys(username, readValueFromExcel("data", 1, 0));
		
		
		WebElement password = findLocatorByXpath("//input[@id='pass']");
		sendkeys(password, readValueFromExcel("data", 1, 1));
		
		WebElement login = findLocatorByXpath("//button[@value='login']");
		clickButton(login);
				
		implicitWait();
		
		WebElement search = findLocatorByXpath("(//input[@type='text'])[1]");
		sendkeys(search, readValueFromExcel("data", 1, 2));
		
		implicitWait();
		
		WebElement searchbutton = findLocatorByXpath("(//button[@type='submit'])[1]");
		clickButton(searchbutton);
		
		implicitWait();
		
		WebElement selectproduct = findLocatorByXpath("(//a[text()='Add'])[1]");
		clickButton(selectproduct);
		
		implicitWait();
		
		WebElement addtocart = findLocatorByXpath("//button[@id='cart-21']");
		clickButton(addtocart);
		
		
		WebElement gotocart = findLocatorByXpath("//a[@class='hover1']");
		clickButton(gotocart);
		
		
		closeAllWindow();
		
		
	}
	
	
}
