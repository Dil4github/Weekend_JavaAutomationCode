package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("http://amazon.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		driver.quit();
	}

}
