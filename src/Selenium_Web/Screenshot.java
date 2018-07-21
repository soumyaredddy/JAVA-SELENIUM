package Selenium_Web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		try {
        driver.get("https://www.w3schools.com/js/js_popup.asp");
        driver.findElement(By.xpath("//a[text()='Try it Yourself ']")).click();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//src is temp location to store screenshots in local machine
			String str=String.valueOf(System.currentTimeMillis());
			//String.valueof will convert int to srting
			FileUtils.copyFile(src,new File("C:\\Users\\srgad\\Desktop\\SELENIUM@notes\\Error_screenshots\\error2-"+str+".png"));
			//fleUtils copies the files from src put it our desired location
//		 driver.findElement(By.xpath("//a[text()='Try it Yourself ']")).click();
		}
//		finally{
//       driver.close();
//	}
	}

}
