package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_BusinessEmail_cssSelector {
	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnBusinessEmailLink1() {
		driver.findElement(By.xpath("//a[@class='mailicon']/following-sibling::a[2]")).click();
	}
	
	public void clickOnBusinessEmailLink2() {
		driver.findElement(By.cssSelector("//a[@class='mailicon']/following-sibling::a['bmailicon relative']")).click();
	}
	public void clickOnBusinessEmailLink3() {
		driver.findElement(By.cssSelector("//div[@class='cell topicons']/child::a[3]")).click();
	}
	public void clickOnBusinessEmailLink4() {
		driver.findElement(By.cssSelector("//a[@class='bmailicon relative']")).click();
	}
	public void clickOnBusinessEmailLink5() {
		driver.findElement(By.cssSelector("//a[@class='moneyicon relative']/following-sibling::a[1]")).click();
	}
	public void clickOnBusinessEmailLink6() {
		driver.findElement(By.cssSelector("//div[@class = 'cell']/following::a[3]")).click();
	}
	public void clickOnBusinessEmailLink7() {
		driver.findElement(By.cssSelector("//div[@class = 'logobar']/descendant::a[3]")).click();
	}
	public void clickOnBusinessEmailLink8() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnBusinessEmailLink9() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnBusinessEmailLink10() {
		driver.findElement(By.cssSelector("")).click();
	}
}
