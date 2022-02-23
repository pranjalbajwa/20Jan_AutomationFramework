package propertyutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Propertyutiltiy 
{

	
static String path = "C:\\Users\\pranj\\eclipse2\\20Jan_AutomationFramework\\testdata\\config.properties";
public static String getReaddata(String key)
{

	
	String value="";
 try {
	FileInputStream fis = new FileInputStream(path);
	Properties prop = new Properties();
	prop.load(fis);
	value=prop.getProperty(key);
 } 
 
 catch (Exception e) 
  
 {
	System.out.println("Issue in getReaddata"+ e);
}
	
 return value;
	
}


}
