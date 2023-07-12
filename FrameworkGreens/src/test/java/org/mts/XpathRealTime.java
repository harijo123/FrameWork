package org.mts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRealTime extends Baseclass{
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.seleniumeasy.com/table-data-download-demo.html");
		dr.manage().window().maximize();
		
		//TASK 1
		//heading
		WebElement head = dr.findElement(By.xpath("//th[text()='Name']"));
		System.out.println(head.getText()+"\n");
		
		List<WebElement> rows = dr.findElements(By.xpath("//th[text()='Age']//ancestor::thead//following::tr"));
		for (int i = 2; i <= rows.size(); i++) {
			
			WebElement name = dr.findElement(By.xpath("//th[text()='Age']//ancestor::thead//following::tr["+i+"]//td[1]"));
			System.out.print(name.getText()+"-->");
			
			WebElement age = dr.findElement(By.xpath("//th[text()='Age']//ancestor::thead//following::tr["+i+"]//td[4]"));
			System.out.println(age.getText());
			
		}
		
	
		Thread.sleep(5000);
		dr.close();
	}
	
}


