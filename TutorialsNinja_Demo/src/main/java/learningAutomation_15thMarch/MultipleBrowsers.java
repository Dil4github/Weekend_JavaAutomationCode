package learningAutomation_15thMarch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsers {

	public static void main(String[ ] args) {
		String browserName ="safari";
		
		if (browserName.equals("chrome")) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo");
			driver.quit();
		} else if (browserName.equals("firefox")) {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://flipkart.com");
			driver.quit();
		} else if (browserName.equals("safari")) {
			WebDriver driver=new SafariDriver();
			driver.manage().window().maximize();
			driver.get("http://amazon.com");
			driver.quit();
		} else {
			System.out.println("Nothing opened.");
		}

	}

}
