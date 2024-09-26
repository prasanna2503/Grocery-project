package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.grocery.BaseClass;

public class MyCartPage extends BaseClass {
	
	@FindBy(className = "addAddress")
	private WebElement addAddressBtn;
	
	@FindBy(id="address_type")
	private WebElement addressType;
	
	@FindBy(name = "first_name")
	private WebElement firstName;
	
	@FindBy(name = "last_name")
	private WebElement lastName;
	
	@FindBy(name = "mobile")
	private WebElement mobileNo;
	
	@FindBy(name = "apartment")
	private WebElement houseNo;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "state")
	private WebElement state;
	
	@FindBy(name = "city")
	private WebElement city;
	
	@FindBy(name = "zipcode")
	private WebElement zipcode;
	
	@FindBy(className = "saveAddress")
	private WebElement saveAddressBtn;
	
	@FindBy(id = "payment_type")
	private WebElement paymentType;
	
	@FindBy(id = "visa_card")
	private WebElement cardType;
	
	@FindBy(name = "card_no")
	private WebElement cardNo;
	
	@FindBy(id = "month")
	private WebElement month;
	
	@FindBy(id = "year")
	private WebElement year;
	
	@FindBy(name = "cvv")
	private WebElement cvv;
	
	@FindBy(id = "placeOrder")
	private WebElement placeOrder;

	public WebElement getAddAddressBtn() {
		return addAddressBtn;
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

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getHouseNo() {
		return houseNo;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getSaveAddressBtn() {
		return saveAddressBtn;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	
	public void myCart(String fname,String lname,String mobNum,String doorNum,String deliveryAddress,String pincode,String cardNum,String enterCvv) {
		elementClick(addAddressBtn);
		selectOptionByIndex(addressType, 1);
		elementSendKeys(firstName, fname);
		elementSendKeys(lastName, lname);
		elementSendKeys(mobileNo, mobNum);
		elementSendKeys(houseNo, doorNum);
		elementSendKeys(address,deliveryAddress);
		selectOptionByValue(state, "35");
		selectOptionByValue(city, "3659");
		elementSendKeys(zipcode, pincode);
		elementClick(saveAddressBtn);
		selectOptionByIndex(paymentType, 1);
		elementClick(cardType);
		elementSendKeys(cardNo, cardNum);
		selectOptionByIndex(month, 5);
		selectOptionByIndex(year, 9);
		elementSendKeys(cvv, enterCvv);
		elementClick(placeOrder);
		
	}
}
