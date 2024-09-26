package com.test.grocery;

import org.openqa.selenium.WebElement;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.method();
	}
	public void method() {
		browserLaunch();
		maximizeWindow();
		enterApplnUrl("https://demo.automationtesting.in/Register.html");
		WebElement ms = findLocatorById("msdd");
		selectOptionByIndex(ms, 1);
//		selectOptionByIndex(ms, 3);
//		getFirstSelectedOption(ms);
	
	}
}
