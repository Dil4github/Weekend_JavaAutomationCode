package learningautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Learning_How_to_Identify_WevElement {

	public WebDriver driver;
public ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options=new ChromeOptions();
		options.setPageLoadStrategy (PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void understandingWebElementsRediffLogin() {
	driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.className("signinbtn")).click();
	driver.findElement(By.className("rd_logout")).click();
	}
	
	
	
	
}
  