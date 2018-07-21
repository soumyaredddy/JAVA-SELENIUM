package testng_framework;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Providers  extends App1{
	/*@Test(dataProvider = "mydata")
	public void navigate(String str) {
		driver.get(str);
	}
	@DataProvider(name = "mydata")
	public Object[][] db(){
		Object[][] obj = {{ "https://www.facebook.com"}};
return obj;
}*/
	@Test (dataProvider = "mydata")
	public void navigate(Hashtable<String ,String> h) {
		driver.get(h.get("url"));
	}
	
	   
	
	@DataProvider(name = "mydata")
	public Object[][] db1(){
		Hashtable<String ,String > h = new Hashtable<String ,String>();
		h.put("url","https://www.facebook.com");
		Object[][] obj = {{h}};
		return obj;
	
		}
}
