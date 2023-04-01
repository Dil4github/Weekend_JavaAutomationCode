package learningautomation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo1_12March {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
		options =new ChromeOptions();
		options.setPageLoadStrategy (PageLoadStrategy.NORMAL);
		options.addArguments("--start-maximize");
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(options);
		driver.get("https://rediff.com");
		
		
		
		
	}
	{
		
	}{
		
	}
	

	}

