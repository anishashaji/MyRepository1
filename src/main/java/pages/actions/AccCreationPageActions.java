package pages.actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.AccCreationPageLocator;
import utils.Base;
import utils.SeleniumDriver;

public class AccCreationPageActions extends Base {
	
	//WebDriver driver=null;
	
	AccCreationPageLocator pl=null;
	public  AccCreationPageActions()
	{
		//this.driver=driver;
		this.pl= new AccCreationPageLocator();
		PageFactory.initElements(Base.getDriver(), pl);
	}

	public void getfirstname(String fname)
	{	
		pl.firstname.sendKeys(fname);
	}
	public void getsurname(String surname)
	{	
		pl.surname.sendKeys(surname);
	}
	public void getemail(String email)
	{	
		pl.emailormobile.sendKeys(email);
	}
	public void getemailverify(String email_verify)
	{	
		pl.emailverify.sendKeys(email_verify);
	}
	public void getpassword(String pwd)
	{	
		pl.password.sendKeys(pwd);
	}
	public void selectdate(String dob_date)
	{
		Select birthdate=new Select(pl.date);
		birthdate.selectByVisibleText(dob_date);
	}
	public void selectmonth(String dob_month)
	{
		Select birthmonth=new Select(pl.month);
		birthmonth.selectByVisibleText(dob_month);
	}
	public void selectyear(String dob_year)
	{
		Select birthyear=new Select(pl.year);
		birthyear.selectByVisibleText(dob_year);
	}
	public void getgender(String gender)
	{
		for(WebElement w:pl.genderlist)
		{ 
			//System.out.println(w.getAttribute("value"));
		if(w.getAttribute("value").equals(gender))
			w.click();}
	}
	public void clicksubmit()
	{
		pl.submitbutton.click();
	}

	public void getsecuritycodeandclick() {
	pl.securitybutton.click();
		
	}
	
}
