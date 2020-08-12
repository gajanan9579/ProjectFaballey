package com.alsis.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base {
	public static Properties prop;
	public static String currDir;
	public static Logger log;

	@BeforeSuite
	public void loadProperties() {


		try {
			
			currDir = System.getProperty("user.dir");
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\hp\\git\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\propertiesfile\\config.properties");
			prop.load(fis);

			// log4j
			log = Logger.getLogger(Base.class);
			PropertyConfigurator.configure("C:\\Users\\hp\\git\\ProjectFaballey\\src\\resources\\java\\com\\alsis\\propertiesfile\\log4j.properties");

			log.info("currDir is : " + currDir);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
