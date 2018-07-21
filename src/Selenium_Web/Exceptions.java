package Selenium_Web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		try {
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        driver.findElement(By.xpath("//a[text()='Try it Yourself ']")).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			 driver.findElement(By.xpath("//a[text()='Try it Yourself ']")).click();
		}
//		finally{
//       driver.close();
//	}
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		//driver.navigate().to();
	}
}
