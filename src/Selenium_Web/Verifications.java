package Selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
         String actual=driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getText();
        String exp = "google search";
        if(actual.equals(exp)) {
        	System.out.println("valid verification");
        	
        }
        else {
        	System.out.println(" NOT valid verification");
        }
      System.out.println(driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getAttribute("type"));
      System.out.println(driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).getCssValue("border"));
        System.out.println(driver.findElement(By.xpath(".//*[ @name='btnK']")).getAttribute("value"));
	}

}
