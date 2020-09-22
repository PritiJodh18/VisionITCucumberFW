package context;

import java.io.InputStream;
import java.util.Properties;

public class TestBase {

	protected  String Urlamazon = LoadProperties().getProperty("url");
    
	public Properties LoadProperties() {
		
		//int convert=Integer.parseInt(Name);
		try {
			InputStream inStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			Properties prop = new Properties();
			prop.load(inStream);
			return prop;
		}catch(Exception e) {
			System.out.println("File not found exception thrown for config.properties file.");
			return null;
		}

	}
	
	
	
}
