package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFileReader {
			
	static String url;
	static String driverPath;
	
	static	{
		try {
			Properties  prop = new Properties();
			String dir = System.getProperty("user.dir");
			InputStream input = new FileInputStream(dir+"/src/test/resources/config/Configuration.properties");
			prop.load(input);
			prop.getProperty("driverPath");
			prop.getProperty("browser");
			prop.getProperty("implicitlywait");
			url = prop.getProperty("url");
	    }catch (Exception ex) {
	    						ex.printStackTrace();
	      }
	}
	
	public static String getUrl() {
        return url;
    }
	
	public static String getDriverPath(){
		return driverPath;
	}
}
