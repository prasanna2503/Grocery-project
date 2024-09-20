package com.test.grocery;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class OrderId extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		OrderId order = new OrderId();
		order.orderIdCreation();
		
	}
	
	public void orderIdCreation() throws IOException, InterruptedException {
		
		browserLaunch();
		enterApplnUrl("https://www.omrbranch.com/");
		maximizeWindow();
		implicitWait();
		
		WebElement txtEmail = findLocatorById("email");
		elementSendKeys(txtEmail, getCellData("Sheet1", 1, 0));
		
		WebElement txtPass = findLocatorById("pass");
		elementSendKeys(txtPass, getCellData("Sheet1", 1, 1));
		
		WebElement loginBtn = findLocatorByXpath("//button[@value='login']");
		elementClick(loginBtn);
		
		//Thread.sleep(2000);
		
		WebElement navBar = findLocatorById("navbarResponsive");
		visbilityOfElement(navBar);
		
		WebElement catageory = findLocatorByXpath("//a[text()='CATEGORIES ']");
		mouseOverAction(catageory);
		
		WebElement grocery = findLocatorByXpath("//a[text()='Grocery']");
		mouseOverAction(grocery);
		
		WebElement nuts = findLocatorByXpath("//a[text()='Fruit & Nuts']");
		elementClick(nuts);
		
		Thread.sleep(2000);
		
		
		WebElement addItem = findLocatorByXpath("(//a[text()='Add'])[1]");
		elementClick(addItem);
		
		Thread.sleep(2000);
		
		WebElement addToCart = findLocatorById("cart-53");
		elementClick(addToCart);
		
		Thread.sleep(2000);
		
		WebElement goToCart = findLocatorByXpath("//a[text()=' Go To Cart ']");
		elementClick(goToCart);
		
		Thread.sleep(2000);
		
		WebElement addAddress = findLocatorByClassName("addAddress");
		elementClick(addAddress);
		
		WebElement addressTitle = findLocatorById("addaddressTitle");
		visbilityOfElement(addressTitle);
		
		WebElement addressType = findLocatorById("address_type");
		selectOptionByIndex(addressType, 3);
		
		WebElement firstName = findLocatorByName("first_name");
		elementSendKeys(firstName, getCellData("Sheet1", 1, 2));
		
		WebElement lastName = findLocatorByName("last_name");
		elementSendKeys(lastName, getCellData("Sheet1", 1, 3));
		
		WebElement mobile = findLocatorByName("mobile");
		elementSendKeys(mobile, getCellData("Sheet1", 1, 4));
		
		WebElement apartment = findLocatorByName("apartment");
		elementSendKeys(apartment, getCellData("Sheet1", 1, 5));
		
		WebElement address = findLocatorByName("address");
		elementSendKeys(address, getCellData("Sheet1", 1, 6));
		
		WebElement state = findLocatorByName("state");
		selectOptionByValue(state, "35");
		
		Thread.sleep(1000);
		WebElement city = findLocatorByName("city");
		selectOptionByValue(city, "3659");
		
		WebElement code = findLocatorByName("zipcode");
		elementSendKeys(code, getCellData("Sheet1", 1, 7));
		
		WebElement saveAddress = findLocatorByClassName("saveAddress");
		elementClick(saveAddress);
		
		Thread.sleep(2000);
		
		WebElement paymentType = findLocatorById("payment_type");
		selectOptionByIndex(paymentType, 1);
		
		Thread.sleep(1000);
		
		WebElement cardType = findLocatorByXpath("//label[text()=' Visa ']");
		elementClick(cardType);
		
		WebElement cardNum = findLocatorByName("card_no");
		elementSendKeys(cardNum, getCellData("Sheet1", 1, 8));
		
		WebElement month = findLocatorById("month");
		selectOptionByIndex(month, 5);
		
		WebElement year = findLocatorById("year");
		selectOptionByIndex(year, 5);
		
		WebElement cvv = findLocatorByName("cvv");
		elementSendKeys(cvv, "477");
		
		WebElement placeOrder = findLocatorById("placeOrder");
		elementClick(placeOrder);
		
		Thread.sleep(5000);
		
		WebElement txtEmail1 = findLocatorById("email");
		elementSendKeys(txtEmail1, getCellData("Sheet1", 1, 0));
		
		WebElement txtPass1 = findLocatorById("pass");
		elementSendKeys(txtPass1, getCellData("Sheet1", 1, 1));
		
		WebElement loginBtn1 = findLocatorByXpath("//button[@value='login']");
		elementClick(loginBtn1); 
		
		WebElement profile = findLocatorByXpath("//a[contains(text(),'Welcome')]");
		elementClick(profile);
		
		WebElement myAccount = findLocatorByXpath("//a[text()='My Account']");
		elementClick(myAccount);
		
		Thread.sleep(2000);
		
		WebElement orderTab = findLocatorById("v-pills-orders-tab");
		elementClick(orderTab);
		
		Thread.sleep(2000);
		
		WebElement moreDetails = findLocatorByXpath("//a[text()='More Details'][1]");
		elementClick(moreDetails);
		
		WebElement orderNo = findLocatorByXpath("//p[text()='Order No: ']");
		String orderNumber = elementGetText(orderNo);
		
		createCellAndSetCellData("Sheet1", 1, 9, orderNumber);
		
		WebElement product = findLocatorByXpath("//p[contains(text(),'YUM YUM')]");
		String productName = elementGetText(product);
		
		createCellAndSetCellData("Sheet1", 1, 10, productName);
	}
}
