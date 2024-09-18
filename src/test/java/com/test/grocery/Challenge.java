package com.test.grocery;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challenge {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.omrbranch.com/");
		
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.sendKeys("kprasanna2406@gmail.com");
		WebElement passTxtBox = driver.findElement(By.id("pass"));
		passTxtBox.sendKeys("Lovely@0612");
		WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Login']"));
		loginBtn.click();
		
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CATEGORIES ']")));
		
		try {
			driver.findElement(By.xpath("//a[@class='cart_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()=' Go To Cart ']")).click();
			driver.findElement(By.xpath("//div[@class='scheduleClose']")).click();
		} catch (NoSuchElementException e) {
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
			goToCart.click();WebElement catageoryTab = driver.findElement(By.xpath("//a[text()='CATEGORIES ']"));

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
		}
		
	}
}
