package testng_framework;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
//propeties file called as object repo
public class Properties_Mapping {
	static Properties properties;
	public  void method() throws IOException {
		//propertie is java class with default constru
		properties = new Properties();
		//file and fileReader also clasees  with paramerized constru
		File create = new File(System.getProperty("my projects\\dir") + "\\src\\prop\\Test.properties");
		FileReader Readvalues = new FileReader(create); 
		properties.load(Readvalues);
		
	}
 public static String getobjects(String Data) throws IOException {
	 Properties_Mapping obj = new Properties_Mapping();
	 obj.method();
	 String data;
	  data = properties.getProperty(Data);
	  return data;
	 
 }
}
