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
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		Thread.sleep(3000);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_popup")));
		WebElement goToCart = driver.findElement(By.xpath("//a[text()=' Go To Cart ']"));
		goToCart.click();
		Thread.sleep(3000);
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
		Thread.sleep(2000);
		WebElement selectCity = driver.findElement(By.name("city"));
		Select city = new Select(selectCity);
		city.selectByValue("3659");
				
		WebElement zipCode = driver.findElement(By.name("zipcode"));
		zipCode.sendKeys("600097");
		
		WebElement saveBtn = driver.findElement(By.className("saveAddress"));
		saveBtn.click();
		
		Thread.sleep(2000);
		
		WebElement payment = driver.findElement(By.id("payment_type"));
		Select paymentSelect = new Select(payment);
		paymentSelect.selectByIndex(1);
		
		Thread.sleep(2000);
		WebElement cardType = driver.findElement(By.xpath("//label[text()=' Visa ']"));
		cardType.click();
		
		WebElement cardNum = driver.findElement(By.name("card_no"));
		cardNum.sendKeys("5555555555552222");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select cardMonth = new Select(month);
		cardMonth.selectByValue("December");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select cardYear = new Select(year);
		cardYear.selectByIndex(6);
		
		WebElement cvv = driver.findElement(By.name("cvv"));
		cvv.sendKeys("789");
		
		
		WebElement placeOrder = driver.findElement(By.id("placeOrder"));
		placeOrder.click();
		
		Thread.sleep(15000);
		
		WebElement emailTxtBox1 = driver.findElement(By.id("email"));
		emailTxtBox1.sendKeys("kprasanna2406@gmail.com");
		WebElement passTxtBox1 = driver.findElement(By.id("pass"));
		passTxtBox1.sendKeys("Lovely@0612");
		WebElement loginBtn1 = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("v-pills-orders-tab")).click();
		
		driver.findElement(By.xpath("//a[text()='More Details'][1]")).click();
		
		WebElement order = driver.findElement(By.xpath("//p[text()='Order No: ']"));
		String text = order.getText();
		System.out.println(text);
		
		WebElement product = driver.findElement(By.xpath("//p[contains(text(),'YUM YUM')]"));
		String productName = product.getText();
		System.out.println("Product Name : " +productName);
		
	}
}
