package Selenium_Web;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        Set<String>  windows = driver.getWindowHandles();
        Iterator <String> winIT = windows.iterator();
        String firstwindow =winIT.next();
        String secondwindow = winIT.next();
        driver.switchTo().window("secondwindow");
        //driver.findElement(By.xpath("//a[text()='Try it Yourself']")).click();
        driver.findElement(By.xpath("html/body/button")).click();
        driver.close();

	}

}
