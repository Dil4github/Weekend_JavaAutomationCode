package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Money_cssSelector {

	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnMoneyLink1() {
		driver.findElement(By.cssSelector("//a[@class='mailicon']/following-sibling::a[1]")).click();
	}
	public void clickOnMoneyLink2() {
		driver.findElement(By.cssSelector("//div[@class='table']/descendant::a[2]")).click();
	}
	
	public void clickOnMoneyLink3() {
		driver.findElement(By.cssSelector("//div[@class='logobar']/descendant::a[2]")).click();
	}
	public void clickOnMoneyLink4() {
		driver.findElement(By.cssSelector("")).click();
}
	public void clickOnMoneyLink5() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnMoneyLink6() {
		driver.findElement(By.cssSelector("")).click();
	}
	
	public void clickOnMoneyLink7() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnMoneyLink8() {
		driver.findElement(By.cssSelector("")).click();
}
	public void clickOnMoneyLink9() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnMoneyLink10() {
		driver.findElement(By.cssSelector("")).click();
}
}