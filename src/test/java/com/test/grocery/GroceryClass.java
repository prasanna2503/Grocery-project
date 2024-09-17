package com.test.grocery;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GroceryClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.omrbranch.com/");
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.sendKeys("kprasanna2406@gmail.com");
		WebElement passTxtBox = driver.findElement(By.id("pass"));
		passTxtBox.sendKeys("Lovely@0612");
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CATEGORIES ']")));
		
		WebElement catageoryTab = driver.findElement(By.xpath("//a[text()='CATEGORIES ']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(catageoryTab).perform();
		
		WebElement groceryTab = driver.findElement(By.xpath("//a[text()='Grocery']"));
		
		action.moveToElement(groceryTab).perform();
		
		WebElement fruitsNutsTab = driver.findElement(By.xpath("//a[text()='Fruit & Nuts']"));
		fruitsNutsTab.click();
		
		WebElement scrollDown = driver.findElement(By.xpath("//h5[text()='Fruit & Nuts']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		
		WebElement AddBtn = driver.findElement(By.xpath("//a[text()='Add'][1]"));
		AddBtn.click();
		
		WebElement addToCart = driver.findElement(By.id("cart-53"));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart-53")));
		addToCart.click();
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_popup")));
		WebElement goToCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		goToCart.click();
		
		WebElement address = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
		js.executeScript("arguments[0].scrollIntoView(true)", address);
		
		WebElement addAddressIcon = driver.findElement(By.className("addAddress"));
		addAddressIcon.click();
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("addaddressTitle")));
		
		WebElement addressType = driver.findElement(By.id("address_type"));
		
		Select select = new Select(addressType);
		
		select.selectByIndex(3);
		
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Prasanna");
		
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("Kumar");
		
		WebElement contactNum = driver.findElement(By.name("mobile"));
		contactNum.sendKeys("9441146596");
		
		WebElement houseNum = driver.findElement(By.name("apartment"));
		houseNum.sendKeys("5/25");
		
		WebElement addressTxtBox = driver.findElement(By.name("address"));
		addressTxtBox.sendKeys("Nethaji Street, Okiyam Thuraipakkam");
		
		WebElement state = driver.findElement(By.name("state"));
		Select stateSelect = new Select(state);
		stateSelect.selectByValue("35");
		
		WebElement city = driver.findElement(By.name("city"));
		city.click();
		city.sendKeys("Chennai");

		
		WebElement zipCode = driver.findElement(By.name("zipcode"));
		zipCode.sendKeys("600097");
		
		WebElement saveBtn = driver.findElement(By.className("saveAddress"));
		saveBtn.click();
		

		WebElement placeOrder = driver.findElement(By.id("placeOrder"));
		placeOrder.click();
	}
}
