package com.automationcode_19thMar_2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroductionToXpaths {

	
	public static WebDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void setup () {
		options = new ChromeOptions ();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments();
		options.addArguments()
		options.
		
	}
	
	@Test
	public void clickOnSignInLink () {
		driver.findElement(By.xpath(''//a[@class='signin']")).click();
	}
		
	@Test
	public void enterLoginCredentials() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement("//input[@id='login1' and @name='login']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id='password' or @name='passwd']")).sendKeys(Selenium@123);
		

		
	}
		
		

	}

