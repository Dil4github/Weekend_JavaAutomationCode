package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fifth {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://amazon.com");
		driver.quit();
	}

}
