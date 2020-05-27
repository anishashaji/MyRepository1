package com.automation.testcases;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Test002 {
	static
	{
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	}
	static WebDriver driver = new ChromeDriver();
	
    public static void main(String[] args) throws Exception {
    	
    	
       driver.get("https://esecure.tdbank.com/net/consumerloan/apply1.aspx?zip=20005&iradius=1&Action.x=53&Action.y=7"); 
        driver.manage().window().maximize(); 
        
        String actual= "Address: 901 7th Street Washington, DC 20001";
        
        String telephone="Telephone: 202-289-6175";    	
        	
        Test002 obj= new Test002();
        obj.validateAddress(actual, telephone);
   
    	
    }
        	public void validateAddress(String actual, String telephone)
        	
        	{
        	
		List<WebElement> address1 = driver.findElements(By.xpath("//span[@class='mainheadertext']//parent::p[contains(.,'Address:')]"));

		List<WebElement> telephonelist = driver.findElements(By.xpath("//span[@class='mainheadertext']//parent::p[contains(.,'Address:')]//following::p[1]"));
    
		int len=address1.size();
		String []addressline1 =new String[len];
    					String []telephonearray =new String[len];
    					int i=0, k=0;

    					//Storing List elements text into String array
    					for(WebElement a: address1)
    					{
    					   addressline1[i]=a.getText();
    					   i++;
    					}			
    					for(WebElement t: telephonelist)
    					{
    					   telephonearray[k]=t.getText();
    					   k++;
    					}			
    			  for(int j=0; j<addressline1.length;j++)
    			   {			  
    				  String expected= addressline1[j].replace('\n',' ');
    			   if(expected.equals(actual))
    			   { System.out.println("Address MATCHING!!!");
    					System.out.println(addressline1[j]);
    		//	 String xpathvariable= "//span[@class='mainheadertext']//following::img[@border='0']["+j+"]";
    			 //verify telephone
    			
    			String teldisplayed= telephonearray[j];
    			 System.out.println("input given: "+telephone+" displayed value "+teldisplayed);
    			 
    
 if(telephone.equals(teldisplayed))
 {
	
 System.out.println("Telephone MATCHES!! --> "+ teldisplayed);
 }
 else System.out.println("Telephone MISMATCH");
 
    				//  driver.findElement(By.xpath(xpathvariable)).click();
    				 break; 
    			   }
    			   else  System.out.println("TEST FAILED- ADDRESS NOT FOUND");
    			   
    			   }
    }
}
