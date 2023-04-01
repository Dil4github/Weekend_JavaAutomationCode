package com.learning.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_Multi_Browsers {

	public static void main(String[] args) {

		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://google.com");
		driver1.quit();
		
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://amazon.com");
		driver2.quit();
				 
	}

}
