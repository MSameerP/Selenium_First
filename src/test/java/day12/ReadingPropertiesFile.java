package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
	public static void main(String[] args) throws Exception {
		
		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//Testdata//config.properties");
		
		//loading properties file
		Properties pro = new Properties();
		pro.load(file);
		//Reading data from properties file
		
		String url = pro.getProperty("appurl");
		String email = pro.getProperty("email");
		String pwd = pro.getProperty("password");
		String ordid = pro.getProperty("orderid");
		String custid = pro.getProperty("customerid");
		
		System.out.println(url+" "+email+" "+pwd+" "+ordid+" "+custid);
		
		//reading all the keys
		
		Set<String> keys =  pro.stringPropertyNames();
		System.out.println(keys);
		
		Set<Object> key = pro.keySet();
		System.out.println(key);
		
		//reading all the values
		Collection<Object> values = pro.values();
		System.out.println(values);
	}

}
