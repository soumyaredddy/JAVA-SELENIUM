package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Interaction;
import org.openqa.selenium.support.ui.Select;

public class VtigerLogin {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:8888/index.php?action=index&module=Home");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("password");
       // driver.findElement(By.name("login_theme")).select("softed");
        WebElement Fordropdown = (WebElement) driver.findElement(By.xpath("//select[@name = 'login_theme']"));
        Select se = new Select(Fordropdown);
        se.selectByIndex(0);
        Thread.sleep(3000);
        se.selectByValue("bluelagoon");
        se.selectByVisibleText("woodspice");
        //verifying the how many options avilable&particular element is avilable or not
        int Totalsize =se.getOptions().size();
        for(int i=0;i<=Totalsize-1;i++) {
        	String looping = se.getOptions().get(i).getText();
        	if(looping.equals("bluelagoon")) {
        		System.out.println("given looping text available");
        		break;
        	}
        	else {
        		System.out.println("given looping text is NOT available");
        	}
        }
        		
        driver.findElement(By.name("Login")).click();
        //driver.findElement(By.xpath("//a[text()='Sign Out']")).isSelected();
        driver.findElement(By.linkText("Inventory")).click();
        driver.findElement(By.linkText("Products")).click();
        driver.findElement(By.xpath("//img[contains(@title,'Create Products')]"));
        boolean selected =driver.findElement(By.id("53")).isSelected();
        if(selected=true) {
        	driver.findElement(By.id("53")).click();
        	System.out.println("checked correct one");
        }
        else {
        	System.out.println("checked INcorrect one");
        }
        
	
        
        boolean check = driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed();
        if(check == true)
        {
        	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        	System.out.println("vtiger logout successfully");
        	
        }else {
        	System.out.println(" vtiger not successfully logout ");
        }
        	
        int numberoflinks = driver.findElements(By.xpath("//a")).size();
        System.out.println("number of linkks are"  + numberoflinks);
        int  textboxCnt= driver.findElements(By.xpath("//input[@type='text']")).size();
        System.out.println("number of textboxes are"  + textboxCnt);
        int radiobuttonCnt = driver.findElements(By.xpath("//input[@type='radio']")).size();
        System.out.println("number of radiobuttons are"  + radiobuttonCnt);
        int checkboxCnt = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
        System.out.println("number of checkboxes are"  + checkboxCnt);
        int textareaCnt = driver.findElements(By.xpath("//input[@type='textarea']")).size();
        System.out.println("number of textareas are"  + textareaCnt);
        int dropdownsCnt = driver.findElements(By.tagName("select")).size();
        System.out.println("number of dropdowns are"  +  dropdownsCnt);
        int imagesCnt = driver.findElements(By.tagName("img")).size();
        System.out.println("number of images are "  + imagesCnt);
        
        
        
        
        
        
	}
       
       
}

