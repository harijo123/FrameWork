package org.mts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends Baseclass{
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	private void login(String browsername) throws IOException {
		if (browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browsername.equals("edge")) {
			driver = new EdgeDriver();	
		}
		
		driver.get("https://www.omrbranch.com/");
		
		driver.findElement(By.id("email")).sendKeys(readValueFromExcel("data", 2, 0));
		driver.findElement(By.id("pass")).sendKeys(readValueFromExcel("data", 2, 1));
		
	}

}
