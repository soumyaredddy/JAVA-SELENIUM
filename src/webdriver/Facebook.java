package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.server.handler.interactions.MouseMoveToLocation;
import org.openqa.selenium.support.ui.Select;


public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ff.driver","C:\\mysystem\\SE drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//[@id='day']/option[6]")).click();
        
        WebElement year =driver.findElement(By.xpath("//[@id='year']"));
        Select obj = new Select(year);
        		obj.selectByVisibleText("1993");
        		driver.findElement(By.id("u_0_9")).click();
	}
//		driver.get("https://www.naukri.com/");
//		WebElement link = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
//		Action mousemove = new Action (driver);
//		mousemove.moveToElement(link).build().perform();
//		
//		
//		
//	}
	
}
