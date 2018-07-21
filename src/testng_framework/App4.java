package testng_framework;

import org.testng.annotations.AfterSuite;

public class App4  extends App1{
	@AfterSuite
	public void app4(){
		driver.close();
	}

}
