package testng_framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class App3 extends App1 {
	@Test
	public void app3() throws InterruptedException {
	Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("soumyareddy.671@gmail.com");
	}

}
