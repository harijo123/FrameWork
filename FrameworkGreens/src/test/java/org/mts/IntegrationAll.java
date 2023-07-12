package org.mts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IntegrationAll extends Baseclass{

		public static void main(String[] args) throws AWTException, InterruptedException, IOException {
			
			
				chromeLaunch();
				getUrl("https://omrbranch.com/");
				maximizeWindow();
				implicitWait();
				
				//username
				WebElement username = findLocatorByXpath("//input[@id='email']");
				sendkeys(username, readValueFromExcel("data", 1, 0));
				String attribute1 = username.getAttribute("value");
				Assert.assertEquals("verify user", "hariijack.97@gmail.com",attribute1 );
				
				//password
				WebElement password = findLocatorByXpath("//input[@id='pass']");
				sendkeys(password, readValueFromExcel("data", 1, 1));
				String attribute2 = password.getAttribute("value");
				Assert.assertEquals("verify password", "Niralyaraja@735", attribute2);
				
				//check login page
				WebElement checklogin = findLocatorByXpath("//a[@data-target='#opensignup']");
				String text1 = checklogin.getText();
				boolean b = text1.contains("Signup here");
				Assert.assertTrue("verify login page", b);
				
				//login
				WebElement login = findLocatorByXpath("//button[@value='login']");
				clickButton(login);		
				
				implicitWait();
				
	//===================================================================================================
				
//				//check home page
//				WebElement checkhomepage = findLocatorByXpath("//a[@class='nav-link']");
//				String attribute3 = checkhomepage.getText();
//				boolean c = attribute3.contains("HOME");
//				System.out.println(c);
//				Assert.assertTrue("verify home page", c);
//				
				//check cart
					//click cart
				WebElement clickcart = findLocatorByXpath("//i[@class='fa fa-shopping-cart']");
				clickcart.click();
				
				Thread.sleep(1000);
				
					//click go to cart
				WebElement gotocart = findLocatorByXpath("//div[@class='check_out_btn pb-4']");
				gotocart.click();
				
				Thread.sleep(1000);

					//get all product
				List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='allinone close']"));
				int size = findElements.size();
				System.out.println(size);
				
					//cancel product
				try {
					for (int i = 3; i < size; i++) {
						WebElement cancelproduct = findLocatorByXpath("(//a[@class='allinone close'])["+i+"]");
						clickButton(cancelproduct);
					}	
				} 
					catch (Exception e) {
					
					}
				}
				
			
		
		
		


		
			
		}
		