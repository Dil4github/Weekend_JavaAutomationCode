package learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Mistakes_WhileUsing_TestNG {
		public WebDriver driver; 

	public static void main(String[] args) {
		System.out.println("This is main method.");
	}

	@Test
	public void understandingWevElementsRediffLogin() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		driver.findElement(By.className("rd_logout")).click();
		
	}
	
	
}
