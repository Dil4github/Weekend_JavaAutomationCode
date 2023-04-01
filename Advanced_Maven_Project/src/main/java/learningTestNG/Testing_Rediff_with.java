package learningTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Rediff_with {

	public WebDriver driver;
	public ChromeOptions options;
	
@BeforeMethod
	public void setUp () {
	options=new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.EAGER);
	options.addArguments("--start-maximized");
	options.addArguments("--incognito");
	options.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver (options);
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");	
}

@Test
public void understandingWebElementsTutorialsninja() {

	driver.findElement(By.id("Login1")).sendKeys("seleniumpanda@rediffmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@123");
	driver.findElement(By.)
	
	
	
}
	
}
