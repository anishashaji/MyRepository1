package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccCreationPageLocator {
	
	
	@FindBy(how=How.NAME,using="firstname")
	public WebElement firstname;
	
	@FindBy(how=How.NAME,using="lastname")
	public WebElement surname;
	
	@FindBy(how=How.NAME,using="reg_email__")
	public WebElement emailormobile;
	@FindBy(how=How.NAME,using="reg_email_confirmation__")
	public WebElement emailverify;
	@FindBy(how=How.NAME,using="reg_passwd__")
	public WebElement password;
	@FindBy(how=How.NAME,using="birthday_day")
	public WebElement date;
	@FindBy(how=How.NAME,using="birthday_month")
	public WebElement month;
	@FindBy(how=How.NAME,using="birthday_year")
	public WebElement year;
	@FindBy(how=How.NAME,using="sex")
	public List<WebElement> genderlist;
	@FindBy(how=How.NAME,using="websubmit")
	public WebElement submitbutton;
	@FindBy(how=How.NAME,using="reset_action")
	public WebElement securitybutton;
	

}
