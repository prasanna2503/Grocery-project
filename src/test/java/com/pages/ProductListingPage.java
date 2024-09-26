package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.grocery.BaseClass;

public class ProductListingPage extends BaseClass {
	
	@FindBy(xpath="(//a[text()='Add'])[1]")
	private WebElement addProduct;
	
	@FindBy(id="cart-22")
	private WebElement addProductToCart;
	
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement goToCartBtn;

	public WebElement getAddProduct() {
		return addProduct;
	}

	public WebElement getAddProductToCart() {
		return addProductToCart;
	}

	public WebElement getGoToCartBtn() {
		return goToCartBtn;
	}
	
	public void productList() {
		elementClick(addProduct);
		elementClick(addProductToCart);
		elementClick(goToCartBtn);
	}
}
