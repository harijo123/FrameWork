package org.mts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Grocery extends Baseclass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.omrbranch.com/");
		dr.manage().window().maximize();
		
		//login
		WebElement username = dr.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("hariijack.97@gmail.com");
		
		//password
		WebElement password = dr.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("Niralyaraja@735");
		
		//login button
		WebElement loginbutton = dr.findElement(By.xpath("//button[@value='login']"));
		loginbutton.click();
		
		Thread.sleep(2000);
		
		
//		//click cart
		WebElement clickcart = dr.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
		clickcart.click();
		
//			//go to cart
//			WebElement gotocart = dr.findElement(By.xpath("//a[@class='hover1']"));
//			gotocart.click();
			try {
				List<WebElement> findElements = dr.findElements(By.xpath("//a[@class='allinone close']"));
				int size = findElements.size();
				System.out.println(size);
					for (int i = 1; i <= size; i++) {
					WebElement findElement = dr.findElement(By.xpath("(//a[@class='allinone close'])[1]"));
					findElement.click();
					Thread.sleep(2000);
					WebElement clickcart1 = dr.findElement(By.xpath("//i[@class='fa fa-shopping-cart']"));
					clickcart1.click();
				}
			

			} catch (Exception e) {
				System.out.println("no product");
			}
			finally {

				Thread.sleep(3000);	
				//search
				WebElement search = dr.findElement(By.xpath("(//input[@type='text'])[1]"));
				search.sendKeys("nuts",Keys.ENTER);
			}
	

		
		Thread.sleep(2000);
		
		//select product
		WebElement selectproduct = dr.findElement(By.xpath("(//a[text()='Add'])[1]"));
		selectproduct.click();
		
		Thread.sleep(2000);
		
		//add to cart
		WebElement add = dr.findElement(By.xpath("//button[@id='cart-21']"));
		add.click();
		
		Thread.sleep(2000);
		
		//go to cart
		WebElement goToCart = dr.findElement(By.xpath("//a[@class='hover1']"));
		goToCart.click();
		
		Thread.sleep(2000);
		
		//page down
		Robot robot = new Robot();
		for (int i = 0; i < 10; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		
		Thread.sleep(2000);
		
		//click address
		WebElement address = dr.findElement(By.xpath("//div[@data-toggle='modal']"));
		address.click();
		
		Thread.sleep(2000);
		
		//add address
			//click type
		WebElement selectaddressType = dr.findElement(By.xpath("//select[@id='address_type']"));
		selectaddressType.click();
		
		Thread.sleep(2000);
		
			//select type
		Select selectType = new Select(selectaddressType);
		selectType.selectByIndex(3);
		
		Thread.sleep(2000);
		
			//first name
		WebElement firstname = dr.findElement(By.xpath("(//input[@name='first_name'])[1]"));
		firstname.sendKeys("HARIHARAN");
		
		Thread.sleep(2000);
		
			//last name
		WebElement lastname = dr.findElement(By.xpath("(//input[@name='last_name'])[1]"));
		lastname.sendKeys("N");
		
			//phone number
		WebElement phone = dr.findElement(By.xpath("//input[@name='mobile']"));
		phone.sendKeys("7200288063");
		
			//house number
		WebElement housenumber = dr.findElement(By.xpath("//input[@name='apartment']"));
		housenumber.sendKeys("No.2");
		
			//address
		WebElement houseaddress = dr.findElement(By.xpath("//input[@name='address']"));
		houseaddress.sendKeys("Indhra gandhi street, Ponni nagar, Srinivasapuram, Mayiladuthurai");
		
		//state
		WebElement state = dr.findElement(By.xpath("//select[@name='state']"));
		state.click();
		Select selectState = new Select(state);
		selectState.selectByVisibleText("Tamil Nadu");
		
		Thread.sleep(5000);
		//city
		WebElement city = dr.findElement(By.xpath("//select[@name='city']"));
		city.click();
		Select selectcity = new Select(city);
		selectcity.selectByVisibleText("Mayiladuthurai");
		
		//pincode
		WebElement pincode = dr.findElement(By.xpath("//input[@name='zipcode']"));
		pincode.sendKeys("609001");
		
		//save button
		WebElement savebutton = dr.findElement(By.xpath("(//button[@type='submit'])[3]"));
		savebutton.click();
		
		
		for (int i = 0; i < 10; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);			
		}
		
		
		//payment
		Thread.sleep(3000);
		WebElement payment = dr.findElement(By.id("payment_type"));
		payment.click();
		Select selectPayment = new Select(payment);
		selectPayment.selectByIndex(1);
		
		//card type
		WebElement cardtype = dr.findElement(By.xpath("//label[@for='visa_card']"));
		cardtype.click();
		
		//card number
		WebElement cardnumber = dr.findElement(By.xpath("//input[@name='card_no']"));
		cardnumber.sendKeys("5555555555552222");
		
		//month
		WebElement cardmonth = dr.findElement(By.xpath("//select[@id='month']"));
		Select selectcardmonth = new Select(cardmonth);
		selectcardmonth.selectByValue("December");
		
		//years
		WebElement cardyear = dr.findElement(By.xpath("//select[@id='year']"));
		Select selectcardyear = new Select(cardyear);
		selectcardyear.selectByValue("2030");	
		
		//cvv
		WebElement cardcvv = dr.findElement(By.xpath("//input[@name='cvv']"));
		cardcvv.sendKeys("730");
		
		//placeorder
		WebElement placeorder = dr.findElement(By.xpath("//button[@id='placeOrder']"));
		placeorder.click();
		
		Thread.sleep(10000);
		//again login
		WebElement username1 = dr.findElement(By.xpath("//input[@id='email']"));
		username1.sendKeys("hariijack.97@gmail.com");
		
		Thread.sleep(5000);

		//password
		WebElement password1 = dr.findElement(By.xpath("//input[@id='pass']"));
		password1.sendKeys("Niralyaraja@735");
		
		Thread.sleep(5000);

		//againlogin button
		WebElement loginbutton1 = dr.findElement(By.xpath("//button[@value='login']"));
		loginbutton1.click();
		
		Thread.sleep(2000);

		//click welcome button
		WebElement welcomebutton = dr.findElement(By.xpath("//a[@data-testid='username']"));
		welcomebutton.click();
		
		Thread.sleep(2000);

		//click my account
		WebElement clickmyaccount = dr.findElement(By.xpath("//a[text()='My Account']"));
		clickmyaccount.click();
		

		Thread.sleep(2000);

		//click order
		WebElement clickorder = dr.findElement(By.xpath("(//a[@data-toggle='pill'])[2]"));
		clickorder.click();
		
		Thread.sleep(2000);  

		//print order id
		WebElement printorderid = dr.findElement(By.xpath("(//p[@class='mb-0'])[1]"));
		String text = printorderid.getText();
		System.out.println(text);
		

		//browser close
		dr.close();
		
		
	}

}
   