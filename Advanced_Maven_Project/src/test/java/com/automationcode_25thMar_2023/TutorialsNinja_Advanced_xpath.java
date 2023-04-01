package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinja_Advanced_xpath {
	public WebDriver driver;
	public  ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser () {
		options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}
	
	

	@Test (priority = 1)
	public void clickOnMyAccount () {
		driver.findElement(By.xpath("/*[@id=\"top-links\"]/ul/li[2]/a/i")).click();		
	}
	
	@Test (priority = 2)
	public void clickOnLoginLink() {
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click(); //my account
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();// login
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	}
	}


