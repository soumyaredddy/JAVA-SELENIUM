package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerisEnabled {
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
        boolean signout = verifyisDisplayed("//a[text()='Sign Out']");
        if(signout=true) {
//        	boolean test=driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed();
        	System.out.println("element is present and displayed " +driver.findElement(By.xpath("//a[text()='Sign Out']")).isDisplayed());
            }	
	}
//        
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
       public static boolean verifyisEnabled(String xpath) {
    	   boolean Enableflg = false;
    	   boolean isdisplayed = verifyisDisplayed(xpath);
    	   if(isdisplayed=true) {
    		   boolean isEnabled = driver.findElement(By.xpath("//a[text()='Sign Out']")).isEnabled();
    		   if(isEnabled = true) {
    			   System.out.println("elenement enabled " +isEnabled);
    			   Enableflg = true;
    			   
    		   }
    		   else {
    			   System.out.println("elenement DO NOT enabled " +isEnabled);
    			   Enableflg = false;
    		   }
    		   
    	   }
    	   return Enableflg;
       }


}
