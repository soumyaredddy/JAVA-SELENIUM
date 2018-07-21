package Selenium_Web;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.w3schools.com/js/js_popup.asp");
//        JavascriptExecutor jse= (JavascriptExecutor).driver;
//        jse.executeScript("document.getElementById("main").click()");

	}

}
