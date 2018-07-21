package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.get("https://accounts.google.com/");
          System.out.println(driver.getTitle());
          driver.findElement(By.id("identifierId")).sendKeys("soumyareddy.671");
          driver.findElement(By.xpath("//span[@name='RveJvd snByac']")).click();
          driver.findElement (By.xpath("//div[@class='aCsJod oJeWuf']")).sendKeys("123456");
//          driver.findElement(By.name("identifier")).sendKeys("123456");
	}

}
