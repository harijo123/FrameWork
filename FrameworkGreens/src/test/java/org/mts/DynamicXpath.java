package org.mts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath{

	public static void main(String[] args) throws InterruptedException {
	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/s?k=appple+iphone+14&crid=2EME1VPV2N3GV&sprefix=appple+iphone+15%2Caps%2C506&ref=nb_sb_noss_2");
	dr.manage().window().maximize();
	
	List<WebElement> product = dr.findElements(By.xpath("//div[@class='sg-col-inner']//h2//a//span[contains(text(),'Apple iPhone 14')]"));
	List<WebElement> price = dr.findElements(By.xpath("//span[contains(text(),'Apple iPhone 14 ')]//following::div[7]//a//span//span//child::span[2]"));
	
	System.out.println("product = "+product.size());
	System.out.println("price = "+price.size()+"\n");
	
	for (int i = 0; i < product.size(); i++) {
		System.out.print(+i+"). "+product.get(i).getText()+" ---> ");
		System.out.println(price.get(i).getText());
		}
	Thread.sleep(2000);
	dr.close();
	}

}
