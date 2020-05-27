package com.automation.base;

import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class TestBase {
	
	
	/*
	 * webdriver
	 * extentreports
	 * properties
	 * logs
	 * db
	 * excel
	 * mail
	 */

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties OR=new Properties();
	public static Properties config=new Properties();
	
	@BeforeSuite
	public void setup() throws IOException
	{
		if(driver==null)
		{
			 fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
			 fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis);
		
		
		}
		
		if(config.getProperty("browser").equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver=new ChromeDriver();	
		}
		else if(config.getProperty("browser").equals("opera"))
		{
			
			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\operadriver.exe");
			driver=new OperaDriver();
			}
		
		
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{}
}
