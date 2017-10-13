package com.amdocs.nlt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	private Properties properties;
	private static PropertiesReader propertiesReader = new PropertiesReader();

	private PropertiesReader() {
		File src = new File("./Configuration/Config.property");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String fullTestUrl = (System.getProperty("testURL") == null) ? properties.getProperty("URL")
				: System.getProperty("testURL");
		System.out.println(fullTestUrl);
		properties.put("URL", fullTestUrl);
	}
	
	public static PropertiesReader getInstance(){
		return propertiesReader;
	}

	public String getChromeDriverPath() {
		if (System.getenv("OS") != null && System.getenv("OS").contains("Windows")) {
			return properties.getProperty("ChromeDriver") + ".exe";
		}
		return properties.getProperty("ChromeDriver");
	}

	public String getAppUrl() {
		return properties.getProperty("URL");
	}

	public String getPostalCode() {
		return properties.getProperty("postalCode");
	}

	public String getPostalCode_wrong() {
		return properties.getProperty("postalcode_wrong");
	}

	public String getUnitNumber() {
		return properties.getProperty("unitNumber");
	}
	
	public String getNodeURL() {
		return properties.getProperty("nodeUrl");
	}
	
	public long waitForSecondsHigh() {
		return Long.parseLong(properties.getProperty("waitForSecondsHigh"));
	}
	public long waitForSecondsMedium() {
		return Long.parseLong(properties.getProperty("waitForSecondsMedium"));
	}
	public long waitForSecondsLow() {
		return Long.parseLong(properties.getProperty("waitForSecondsLow"));
	}
	
	public String  getDriver() {
		return properties.getProperty("driver");
	}

	public String getUserName() {
		return properties.getProperty("username");
	}
	public String getPassword() {
		return properties.getProperty("password");
	}

	public String  getHostName() {
		return properties.getProperty("hostName");
	}
}