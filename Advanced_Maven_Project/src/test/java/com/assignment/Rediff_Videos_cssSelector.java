package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Videos_cssSelector {
	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnVideosLink1() {
		driver.findElement(By.cssSelector("//a[@class='vdicon']")).click();
	}
	public void clickOnVideosLink2() {
		driver.findElement(By.cssSelector("//a[@class='bmailicon relative']/following-sibling::a[1]")).click();
	}
	public void clickOnVideosLink3() {
		driver.findElement(By.cssSelector("//a[@class='bmailicon relative']/following-sibling::a['vdicon']")).click();
	}
	public void clickOnVideosLink4() {
		driver.findElement(By.cssSelector("//a[@class='moneyicon relative']/following-sibling::a['vdicon']")).click();
	}
	public void clickOnVideosLink5() {
		driver.findElement(By.cssSelector("//a[@class='moneyicon relative']/following-sibling::a[2]")).click();
	}
	public void clickOnVideosLink6() {
		driver.findElement(By.cssSelector("//a[@class='mailicon']/following-sibling::a[3]")).click();
	}
	public void clickOnVideosLink7() {
		driver.findElement(By.cssSelector("//div[@class='logobar']/descendant::a[4]")).click();
	}
	public void clickOnVideosLink8() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnVideosLink9() {
		driver.findElement(By.cssSelector("")).click();
	}
	public void clickOnVideosLink10() {
		driver.findElement(By.cssSelector("")).click();
	}
	
	
}
