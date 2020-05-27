package com.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test003 {
	
	static
	{
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	}
	static WebDriver dr = new ChromeDriver();
	
	@Test(dataProvider="Data")
	public void example(String username,String pwd) throws InterruptedException {	
		dr.get("https://facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("email")).sendKeys(username);
		dr.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);
	}
	
	@DataProvider(name="Data")
	public Object[][] getData()
	{
		return new Object[][]
				{	{"id","pwd"},{"id1","pwd2"} };
	}
	
}