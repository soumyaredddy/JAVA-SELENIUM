package Selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        //swith to frame
        driver.switchTo().frame("iframeResult");
             //or
        //driver.switchTo().frame(driver.findElement(By.id("")));
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
      //button[text()='Try it']
        Thread.sleep(2000);
        //alert handling
        driver.switchTo().alert().accept();
        //come out of the frame
        driver.switchTo().defaultContent();
        driver.findElement(By.id("tryhome")).click();
        // alerts with 2 buttons ok & cancel
        //driver.switchTo().alert().accept() or dissmis();
	}
}
