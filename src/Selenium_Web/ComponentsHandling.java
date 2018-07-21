package Selenium_Web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ComponentsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
         List<WebElement> links=driver.findElements(By.xpath("//a"));
         System.out.println(links.size());
         for(int i=0;i<links.size();i++) {
//         System.out.println("links " +links.get(i).getText());
        	 String actual = links.get(i).getText();
        	 String exp = "links About";
        	 if(actual.equals(exp)) {
        		 System.out.println("valid component");
        	 }
        	 else {
        		 System.out.println("invalid component");
        		 break;
        	 }
       }
	}

}
