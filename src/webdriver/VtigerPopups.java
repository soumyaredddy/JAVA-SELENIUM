package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class VtigerPopups {
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
        driver.findElement(By.xpath("//img[contains(@title,'Create Products')]")).click();
        driver.findElement(By.xpath("//input[@name='productname']")).sendKeys("laptop");
//        driver.findElement(By.xpath("//input[@name='sales_start_date']"));
        driver.findElement(By.xpath("//img[contains(@onclick,'?module=Vendors&action')]")).click();
        swithtowindowxpath("//input[@id='search_txt']");
        String srchstr ="Elizibeth";
        driver.findElement(By.id("search_txt")).sendKeys("Elizabeth");
        WebElement ven_search= driver.findElement(By.name("search_field"));
        Select Ven_search =new Select(ven_search);
        Ven_search.selectByVisibleText("Vendor Name");
        driver.findElement(By.xpath("//input [name='search'][type='button']")).click();
        if(verifyelementisdisplated=("//a[text()='+srchstr+']")) {
        	driver.findElement(By.xpath("//a[text()='+srchstr+']")).click();
        }
//        boolean selected =driver.findElement(By.id("53")).isSelected();
//        if(selected=true) {
//        	driver.findElement(By.id("53")).click();
//        	System.out.println("checked correct one");
//        }
//        else {
//        	System.out.println("checked INcorrect one");
//        }
//        
	
        
        	
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

       public static void swithtowindowxpath(String xpath) {
    	   WebDriver popup=null;
    	   boolean elementstatus = false;
    	   Iterator<String>  windowiterator= driver.getWindowHandles().iterator();
    	   while(windowiterator.hasNext()) {
    		   String WindowsHandle = windowiterator.next();
    		   
    		   popup = driver.switchTo().window(WindowsHandle);
    		   
    		   if(popup= driver.findElements(By.xpath(xpath)).size()>=1 ) {
    			   
    			   System.out.println("switched to expected window");
    			   break;
    		   }
    		   
    	   }
    	   if(elementstatus = false) {
    		   System.out.println("can not match xpath");
    	   }
       }
       
       public void swithtowindowurl(String xpath,String expurl) {
    	   WebDriver popup=null;
    	   Iterator<String>  windowiterator= driver.getWindowHandles().iterator();
    	   while(windowiterator.hasNext()) {
    		   String WindowsHandle = windowiterator.next();
    		   
    		   popup = driver.switchTo().window(WindowsHandle);
    		   String url = popup.getCurrentUrl();
    		   
    		   if(url.contains(expurl)) {
    			   
    			   System.out.println("switched to expected window by URL");
    			   break;
    		   }
    		   
    	   }
       }
       public void swithtowindowtitle(String xpath,String exptitle) {
    	   WebDriver popup=null;
    	   Iterator<String>  windowiterator= driver.getWindowHandles().iterator();
    	   while(windowiterator.hasNext()) {
    		   String WindowsHandle = windowiterator.next();
    		   
    		   popup = driver.switchTo().window(WindowsHandle);
    		   String title = popup.getTitle();
    		   
    		   if(title.contains(exptitle)) {
    			   
    			   System.out.println("switched to expected window by URL");
    			   break;
    		   }
    		   
    	   }
       }
}
