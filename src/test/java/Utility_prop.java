

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_prop {

	
	
	public static String FetDataFromPropertyFile(String key) throws IOException
	{
		Properties obj=new Properties();
		FileInputStream Myfile=new FileInputStream("E:\\May projects\\Selenium1\\Kite.properties");
		
		obj.load(Myfile);
		String value = obj.getProperty(key);
		return value;
		
	}
}
