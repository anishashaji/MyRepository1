package com.automation.rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	
	public static void main() throws IOException {
	
	Properties config=new Properties();
	Properties OR=new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
	config.load(fis);
	FileInputStream fis1=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
	OR.load(fis1);
	
	String browser= config.getProperty("browser");
}
}