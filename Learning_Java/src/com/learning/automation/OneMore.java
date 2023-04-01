package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMore {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://cnn.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://cnn.com");
		
		driver.quit();
	}

}
