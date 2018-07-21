package testng_framework;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups = {"more","fun"})
	public void group1(){
		System.out.println("pring group1 block");
	}
	@Test(groups = {"more","fun"})
	public void group2(){
		System.out.println("pring group2 block");
	}


}

