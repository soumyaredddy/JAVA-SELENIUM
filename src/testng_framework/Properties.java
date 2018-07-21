package testng_framework;

import java.io.IOException;

import org.testng.annotations.Test;

public class Properties extends Properties_Mapping {
	@Test
	public void testproperties() throws IOException {
		String name ;
		name = getobjects("name");
		System.out.println(name);
	}

}
