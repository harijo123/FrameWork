package com.pages;

import org.mts.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Baseclass {
	
	//default constructor
		public CheckOutPage() {
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[@class='hover1']")
	private WebElement goToCart;
	
	@FindBy(xpath="//h5[text()='My Cart']")
	private WebElement checkMyCartSuccess;
	
	@FindBy(xpath="//div[@data-toggle='modal']")
	private WebElement selectAddress;
	
	@FindBy(id="address_type")
	private WebElement addressType;
	
	@FindBy(xpath="//input[@placeholder='First name*']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@placeholder='Last name*']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@placeholder='Contact No*']")
	private WebElement contact;
	
	@FindBy(xpath="//input[@placeholder='House No*']")
	private WebElement houseNo;
	
	@FindBy(xpath="//input[@placeholder='Address*']")
	private WebElement address;
	
	@FindBy(xpath="//select[@name='state']")
	private WebElement selectState;
	
	@FindBy(xpath="//select[@name='city']")
	private WebElement selectCity;
	
	@FindBy(xpath="//input[@placeholder='Zip Code*']")
	private WebElement pinCode;
	
	@FindBy(xpath="(//button[@type='submit'])[3]")
	private WebElement saveButton;
	
	@FindBy(id="payment_type")
	private WebElement paymentType;
	
	@FindBy(xpath="//label[@for='visa_card']")
	private WebElement cardType;
	
	@FindBy(xpath="//input[@placeholder='Card Number']")
	private WebElement cardNumber;
	
	@FindBy(id="month")
	private WebElement selectMonth;
	
	@FindBy(id="year")
	private WebElement selectYear;
	
	@FindBy(name="cvv")
	private WebElement cvv;
	
	@FindBy(id="placeOrder")
	private WebElement placeorder;

	
	//getters
	
	public WebElement getGoToCart() {
		return goToCart;
	}

	public WebElement getCheckMyCartSuccess() {
		return checkMyCartSuccess;
	}

	public WebElement getSelectAddress() {
		return selectAddress;
	}

	public WebElement getAddressType() {
		return addressType;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getHouseNo() {
		return houseNo;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getSelectState() {
		return selectState;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}
	
//Business logic
	
	public void CheckOut(String firstName, String lastName, String phonenum, String housenum, String address, String state, String city, String pincode, String cardnumber, String month, String year, String cvv ) throws InterruptedException {
		clickButton(getGoToCart());
//		String text = getText(getCheckMyCartSuccess());
//		System.out.println(text);
		clickButton(getSelectAddress());
		selectOptionByIndex(getAddressType(), 3);
		sendkeys(getFirstName(), firstName);
		sendkeys(getLastName(), lastName);
		sendkeys(getContact(), phonenum);
		sendkeys(getHouseNo(), housenum);
		sendkeys(getAddress(), address);
		selectOptionByText(getSelectState(), state);
		Thread.sleep(5000);
		selectOptionByText(getSelectCity(), city);
		sendkeys(getPinCode(), pincode);
		clickButton(getSaveButton());
//		clickButton(getPaymentType());
		Thread.sleep(3000);
		selectOptionByIndex(getPaymentType(), 1);
		Thread.sleep(2000);
		clickButton(getCardType());
		Thread.sleep(2000);
		sendkeys(getCardNumber(), cardnumber);
		selectOptionByAttribute(getSelectMonth(), month);
		selectOptionByAttribute(getSelectYear(), year);
		sendkeys(getCvv(), cvv);
		clickButton(getPlaceorder());
		
	}
	
	
}
