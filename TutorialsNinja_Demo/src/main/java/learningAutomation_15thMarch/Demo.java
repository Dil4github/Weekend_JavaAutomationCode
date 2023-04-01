package learningAutomation_15thMarch;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static WebDriver driver; //it's an instance variable declared under class.
	
	
	public static void main(String[] args) {
		driver = new ChromeDriver(); // under WebDriver driver, this will show
														// error. because it's static here. to change 
														//that, put static before WebDriver driver. 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.quit();
	}

}
