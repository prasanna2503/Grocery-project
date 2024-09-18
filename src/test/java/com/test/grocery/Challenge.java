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
		
		try {
			driver.findElement(By.xpath("//a[@class='cart_btn']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()=' Go To Cart ']")).click();
			driver.findElement(By.xpath("//img[@src='https://www.omrbranch.com/front/images/close-icon.png'][1]")).click();
		} catch (Exception e) {
			System.out.println("Your Cart is Empty");
		}
		
	}
}
