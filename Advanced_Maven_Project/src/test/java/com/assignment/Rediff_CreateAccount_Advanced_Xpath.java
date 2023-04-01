package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_CreateAccount_Advanced_Xpath {

	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnCreateAccountLink1() {
		driver.findElement(By.xpath("//a[@class='signin']/following-sibling::a[1]")).click();
	}
	
	public  void clickOnCreateAccountLink2 () {
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")). click();
	}
	public void clickOnCreateAccountLink3() {
		driver.findElement(By.xpath("//span[@id='username']/following-sibling::p/child::a[2]")). click();
	}
	public  void clickOnCreateAccountLink4 () {
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[text() = 'Create Account']")). click();
	}
	public  void clickOnCreateAccountLink5 () {
		driver.findElement(By.xpath("//div[@class='table']/descendant::a[text()='Create Account']")). click();
	}
	public  void clickOnCreateAccountLink6 () {
		driver.findElement(By.xpath("//span[@id='username']/following::a[2]")). click();
	}
	public  void clickOnCreateAccountLink7 () {
		driver.findElement(By.xpath("//")). click();
	}
	public  void clickOnCreateAccountLink8 () {
		driver.findElement(By.xpath("//")). click();
	}
	public  void clickOnCreateAccountLink9 () {
		driver.findElement(By.xpath("//")). click();
	}
	public  void clickOnCreateAccountLink10 () {
		driver.findElement(By.xpath("//")). click();
	}

}
