package testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Report3 {
  @Test
  public void f() {
	  System.out.println("main method 1");
  }
  @Test
  public void f1() {
	  System.out.println("main method 2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test method");
  }

}
