package testng_framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Report2 {
  @Test
  public void f() {
	  System.out.println("@test in TESTng is like main() in JAVA");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("it will execute before @test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("it will execute after @test");
  }

}
