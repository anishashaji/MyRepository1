package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
	//static{System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");}
	private static SeleniumDriver seleniumDriver;
private static WebDriver driver;
	
	private  SeleniumDriver()
	{
	driver=new ChromeDriver();
	}
	
public static WebDriver getDriver()
{
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	return driver;
}



public static void tearDown() {
    if (driver != null) {
        driver.close();
        driver.quit();
    }
    seleniumDriver = null;
}
/*public static void openPage(String url)
{
	driver.get(url);
	
	}*/

public static void setupDriver()
{
	if(seleniumDriver==null)
	{
		seleniumDriver=new SeleniumDriver();
	}
	
}
	
}
