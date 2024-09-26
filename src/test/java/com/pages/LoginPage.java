package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.test.grocery.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(id="email")
	private WebElement txtEmailBox;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;

	public WebElement getTxtEmailBox() {
		return txtEmailBox;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public void login(String emailId,String password) {
		elementSendKeys(txtEmailBox, emailId);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
	}
}
