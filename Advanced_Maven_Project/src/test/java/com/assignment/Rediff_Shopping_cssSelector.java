package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Shopping_cssSelector {

	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnShoppingLink1() {
		driver.findElement(By.cssSelector("//a[@class='shopicon relative']")).click();
	}
	public void clickOnShoppingLink2() {
		driver.findElement(By.cssSelector("//a[@class='vdicon']/following-sibling::a[1]")).click();
	}
	public void clickOnShoppingLink3() {
		driver.findElement(By.cssSelector("//a[@class='vdicon']/following-sibling::a['shopicon relative']")).click();
	}
	public void clickOnShoppingLink4() {
		driver.findElement(By.cssSelector("//a[@class='vdicon']/following-sibling::a['Online Shopping']")).click();
	}
	public void clickOnShoppingLink5() {
		driver.findElement(By.cssSelector("//a[@class='bmailicon relative']/following-sibling::a[2]")).click();
	}
	public void clickOnShoppingLink6() {
		driver.findElement(By.cssSelector("//a[@class='moneyicon relative']/following-sibling::a[3]")).click();
	}
	public void clickOnShoppingLink7() {
		driver.findElement(By.cssSelector("//a[@class='mailicon']/following-sibling::a[4]")).click();
	}
	public void clickOnShoppingLink8() {
		driver.findElement(By.cssSelector("//div[@class='table']/child::div[2]/child::a[5]")).click();
	}
	public void clickOnShoppingLink9() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnShoppingLink10() {
		driver.findElement(By.cssSelector("")).click();
	}
	
}
