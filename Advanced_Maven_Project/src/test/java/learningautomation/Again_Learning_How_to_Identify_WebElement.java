package learningautomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class Again_Learning_How_to_Identify_WebElement {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	
	public void setUps() {
		options = new ChromeOptions ();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--incognita");
		options.addArguments("--remote-allow-origin=*");
		driver= new ChromeDriver();
		driver.get("https://google.com");
		
	}
		
}
	



