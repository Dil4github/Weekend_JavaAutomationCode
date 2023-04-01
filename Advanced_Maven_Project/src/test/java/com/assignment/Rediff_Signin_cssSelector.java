package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Signin_cssSelector {

	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnSigninLink1() {
		driver.findElement(By.cssSelector("//p[@id='signin_info']/child::a[1]")).click();
	}
	public void clickOnSigninLink2() {
		driver.findElement(By.cssSelector("//span[@id='username']/following-sibling::p/child::a[1]")).click();
	}
	public void clickOnSigninLink3() {
		driver.findElement(By.cssSelector("//div[@class='logobar']/descendant::a[text() = 'Sign in']")).click();
	}
	public void clickOnSigninLink4() {
		driver.findElement(By.cssSelector("'//div[@class='table']/descendant::a[text() = 'Sign in']")).click();
	}
	public void clickOnSigninLink5() {
		driver.findElement(By.cssSelector("//div[@class='cell']/following-sibling::div/child::p[1]/child::a[1]")).click();
	}
	public void clickOnSigninLink6() {
		driver.findElement(By.cssSelector("//div[@class='table']/descendant::a[6]")).click();
	}
	public void clickOnSigninLink7() {
		driver.findElement(By.cssSelector("'//div[@class='logobar']/descendant::a[6]")).click();
	}
	public void clickOnSigninLink8() {
		driver.findElement(By.cssSelector("'")).click();
	}
	
	public void clickOnSigninLink9() {
		driver.findElement(By.cssSelector("'")).click();
	}
	public void clickOnSigninLink10() {
		driver.findElement(By.cssSelector("'")).click();
	}
}
