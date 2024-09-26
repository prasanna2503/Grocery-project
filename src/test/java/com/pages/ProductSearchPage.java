package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.grocery.BaseClass;

public class ProductSearchPage extends BaseClass{
	
	@FindBy(id="search")
	private WebElement searchBox;

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	public void productSearch(String productName) {
		elementSendKeysEnter(searchBox, productName);
	}
}
