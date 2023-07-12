package org.mts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA{
	
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		WebElement search = dr.findElement(By.cssSelector("#twotabsearchtextbox"));
		search.sendKeys("apple 14",Keys.ENTER);
	
		
	
	}

	

	
}