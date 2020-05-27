package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base{

private static WebDriver driver;
	
public static WebDriver getDriver()
{

if(driver==null)
{
System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
driver=new ChromeDriver();
}
return driver;
}



public static void tearDown() {
    if (driver != null) {
        driver.close();
        driver.quit();
    }
    driver = null;
}



/*public static void openPage(String url)
{
	driver.get(url);
	
	}*/
	
}
	
