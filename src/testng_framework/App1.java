package testng_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class App1 {
	static WebDriver  driver;

	
		 @BeforeSuite
		  public void setup() {
			 System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
				
			  driver = new ChromeDriver();
			
			
				
				/*WebDriver driver = new ChromeDriver();
		        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");*/
	}
}

