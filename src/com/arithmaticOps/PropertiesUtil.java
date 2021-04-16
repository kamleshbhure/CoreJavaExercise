package com.arithmaticOps;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	
	public static Properties readPropFile() {
		Properties prop = new Properties();
		String propFileName = "config.properties";

		try (InputStream inputStream = new FileInputStream(propFileName);){
			prop.load(inputStream);
		} catch (PropertyFileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("property file '" + propFileName + "' cannot be readable");
		}
		return prop;
	}
}
