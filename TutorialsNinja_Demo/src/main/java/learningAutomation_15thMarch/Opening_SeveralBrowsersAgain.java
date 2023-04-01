package learningAutomation_15thMarch;

import java.awt.Window;
import java.time.Duration;

import org.apache.velocity.runtime.parser.node.ASTElseIfStatement;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Opening_SeveralBrowsersAgain {

	public static String browserName="safari";
	public static WebDriver driver;
	
public static void main(String[] args) {
		
		if (browserName.equals("chrome"));{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.com");
		driver.quit();
	} 
		if (browserName.equals("safari")) {
		driver =new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
		driver.quit();
	}

}
}
