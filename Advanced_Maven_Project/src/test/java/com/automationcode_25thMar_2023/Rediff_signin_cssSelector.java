package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_signin_cssSelector {

	public static WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openBrowser() {
		
		
		driver.get("https://rediff.com");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test1
	public void clickOnSignInLink() {
		driver.findElement(By.cssSelector("a.signin")).click();

	}
	
	@Test2
	public static WebDriver getDriver() {
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input.login")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input.password")).sendKeys("Selenium@123");
		
	}
}
