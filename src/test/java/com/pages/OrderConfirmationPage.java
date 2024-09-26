package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.grocery.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	
	@FindBy(xpath = "//a[contains(text(),'Welcome')]")
	private WebElement welcome;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(id = "v-pills-orders-tab")
	private WebElement orderTab;
	
	@FindBy(xpath = "(//a[text()='More Details'])[1]")
	private WebElement moreDetails;
	
	@FindBy(xpath = "//p[text()='Order No: ']")
	private WebElement orderNo;

	public WebElement getWelcome() {
		return welcome;
	}

	public WebElement getMyAccount() {
		return myAccount;
	}

	public WebElement getOrderTab() {
		return orderTab;
	}

	public WebElement getMoreDetails() {
		return moreDetails;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	public void orderConfirm() {
		elementClick(welcome);
		elementClick(myAccount);
		elementClick(orderTab);
		elementClick(moreDetails);
		elementGetText(orderNo);
	}
	
}
