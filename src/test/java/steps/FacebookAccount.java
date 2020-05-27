package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.AccCreationPageActions;
import utils.Base;

public class FacebookAccount extends Base {
	
	AccCreationPageActions act= new AccCreationPageActions();
	

@Given("^user has opened the url facebook.com$")
public void user_has_opened_the_url_facebook_com() {
	Base.getDriver().get("https://facebook.com");
	Base.getDriver().manage().window().maximize();
	
}

@When("^user enters firstname \"([^\"]*)\" and surname \"([^\"]*)\" for account creation$")
public void user_enters_firstname_and_surname_for_account_creation(String firstname, String surname) {
	act.getfirstname(firstname);
	act.getsurname(surname);
}

@And("^user enters email \"([^\"]*)\",email_verify \"([^\"]*)\" and password \"([^\"]*)\" for account creation$")
public void user_enters_email_email_verify_and_password_for_account_creation(String email, String emailverify, String password) {
	   act.getemail(email);
	   if(email.contains("@"))
	   act.getemailverify(emailverify);
	   act.getpassword(password);
}

@And("^user enters dob_date \"([^\"]*)\", dob_month \"([^\"]*)\", dob_year \"([^\"]*)\" and gender \"([^\"]*)\" for account creation$")
public void user_enters_dob_date_dob_month_dob_year_and_gender_for_account_creation(String date, String month, String year, String gender) throws InterruptedException {
	  act.selectdate(date);
	   act.selectmonth(month);
		act.selectyear(year);
		Thread.sleep(2000);
		act.getgender(gender);
}

@And("^user clicks on Sign Up$")
public void user_clicks_on_Sign_Up() {
	act.clicksubmit();
	System.out.println("clicked submit");
}

@And("^user enters security code$")
public void user_enters_securitycode()  {
act.getsecuritycodeandclick();
System.out.println("entered security code");
}

@Then("^Facebook account must be created with success message$")
public void facebook_account_must_be_created_with_success_message() {
	System.out.println("SUCCESSFUL TESTCASE!!! YAYYY!!");
	
}


}
	