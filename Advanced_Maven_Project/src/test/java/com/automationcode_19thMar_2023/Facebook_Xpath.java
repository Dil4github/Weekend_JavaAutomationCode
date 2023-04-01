package com.automationcode_19thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Xpath {

	public WebDriver driver;
	public  ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser () {
		options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(options);
		driver.get("https://facebook.com");
	}
	

	@Test (priority = 1)
	public void clickOnCreateNewAccount () {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')")).click();		
	}
	
	@Test (priority = 2, dependsOnMethods = "clickOnCreateNewAccount")
	public void clickOnLoginLink() {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')")).click(); //create new account
		driver.findElement(By.xpath("//input[@name='firstname']")).click();// login
		driver.findElement(By.xpath("//*[@id=\"input-email\']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	
}