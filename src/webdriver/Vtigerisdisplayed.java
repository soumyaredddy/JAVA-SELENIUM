package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtigerisdisplayed {
	static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\mysystem\\SE drivers\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://localhost:8888/index.php?action=index&module=Home");
        driver.findElement(By.name("user_name")).sendKeys("admin");
        driver.findElement(By.name("user_password")).sendKeys("password");
       // driver.findElement(By.name("login_theme")).select("softed");
        driver.findElement(By.name("Login")).click();
        //driver.findElement(By.xpath("//a[text()='Sign Out']")).isSelected();
        boolean signout = verifyisDisplayed ("//a[text()='Sign Out']");
        if(signout=true) {
//        	boolean test=driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed();
        	System.out.println("element is present and displayed " +driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed());
            }	
	}
//        boolean signout = verifyElementprecent ("//a[text()='Sign Out']");
//        if (signout = true) {
//        	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
        
//        boolean check = driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed();
//        if(check == true)
//        {
//        	System.out.println("vtiger logout successfully");
//        	
//        }else {
//        	System.out.println(" vtiger not successfully logout ");
//        }
        	
//        int numberoflinks = driver.findElements(By.xpath("//a")).size();
//        System.out.println("number of linkks are"  + numberoflinks);
//        int  textboxCnt= driver.findElements(By.xpath("//input[@type='text']")).size();
//        System.out.println("number of textboxes are"  + textboxCnt);
//        int radiobuttonCnt = driver.findElements(By.xpath("//input[@type='radio']")).size();
//        System.out.println("number of radiobuttons are"  + radiobuttonCnt);
//        int checkboxCnt = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
//        System.out.println("number of checkboxes are"  + checkboxCnt);
//        int textareaCnt = driver.findElements(By.xpath("//input[@type='textarea']")).size();
//        System.out.println("number of textareas are"  + textareaCnt);
//        int dropdownsCnt = driver.findElements(By.tagName("select")).size();
//        System.out.println("number of dropdowns are"  +  dropdownsCnt);
//        int imagesCnt = driver.findElements(By.tagName("img")).size();
//        System.out.println("number of images are "  + imagesCnt);
        
        
        
        
        
        
//	}
       public static boolean verifyElementprecent(String xpath) {
    	   boolean flag = false;
    	   int Cnt = driver.findElements(By.xpath(xpath)).size();
    	   if(Cnt==1) {
    		   flag = true;
    	   System.out.println("element is present with 1 match " +Cnt);
    	   }
    	   else if(Cnt>1) {
    		   flag = false;
    	   System.out.println("element is present with more than (>)1 match " +Cnt);
    	   }
    	   else{
    		   flag = false;
    		   System.out.println("element is not present so match found " +Cnt);
    	   }
    	   return flag;
    	   
       }
       public static boolean verifyisDisplayed(String xpath){
    	   boolean status = false;
    	   boolean elementstatus = verifyElementprecent(xpath);
    	   if(elementstatus==true) {
    		   boolean displaystatus = driver.findElement(By.xpath("")).isDisplayed();
    		   
    		   if(displaystatus == true) {
    			   System.out.println("element will display"+ xpath);
    			   status = true;
    		   }
    		   else {
    			   System.out.println("element will not display"+ xpath);
    			   status = false;
    		   }
    		   
    	   }
    	   return status;
       }

}
