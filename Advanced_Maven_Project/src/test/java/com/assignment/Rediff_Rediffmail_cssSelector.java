package com.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Rediffmail_cssSelector {

	public WebDriver driver;
	public static ChromeOptions options;
 
	@BeforeMethod
		public void openUrl() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
			}

	@Test
	public void clickOnRediffmailLink1() {
		driver.findElement(By.cssSelector("//a[@class='mailicon']")).click();
	}	
	public void clickOnRediffmailLink2() {
		driver.findElement(By.cssSelector("//div[@class='cell']/following-sibling::div/child::a[1]")).click();
	}	
	public void clickOnRediffmailLink3() {
		driver.findElement(By.cssSelector("//div[@class='table']/descendant::a[1]")).click();
	}

	public void clickOnRediffmailLink4() {
		driver.findElement(By.cssSelector("//div[@class='logobar']/child::div[1]/descendant::a[1]")).click();
	}	
	public void clickOnRediffmailLink5() {
		driver.findElement(By.cssSelector("//div[@class='fnt0']/following-sibling::div[1]/child::div[1]/descendant::a[1]")).click();
	}	
	
	public void clickOnRediffmailLink6() {
		driver.findElement(By.cssSelector("")).click();
	}	
	
	public void clickOnRediffmailLink7() {
		driver.findElement(By.cssSelector("")).click();
	}
	
	public void clickOnRediffmailLink8() {
		driver.findElement(By.cssSelector("//")).click();
	}	
	public void clickOnRediffmailLink9() {
		driver.findElement(By.cssSelector("//")).click();
	}	
	public void clickOnRediffmailLink10() {
		driver.findElement(By.cssSelector("//")).click();
	}	
	
	}

