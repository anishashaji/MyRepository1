package steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {


@Given("^Login page is displayed$")
public void login_page_is_displayed() {
   System.out.println("login page is displayed");
}

@When("^user enters \"([^\"]*)\" username$")
public void user_enters_username(String username) {
	System.out.println("enter uname---"+username);
}

@And("^user enters \"([^\"]*)\" password$")
public void user_enters_password(String pwd) {
	System.out.println("enter pwd----"+pwd);
}


@And("^user enters age and location$")
public void user_select_the_age_category(DataTable table) throws Throwable {
  
	List<Map<String,String>> data = table.asMaps(String.class, String.class);
	System.out.println(" select the age category : "+data.get(1).get("Age")+" ---Selected location as : "+data.get(1).get("Location"));
}

@And("^user clicks on login button$")
public void user_clicks_on_login_button() {
	System.out.println("click login button");
}

@Then("^user \"([^\"]*)\" successfully log in$")
public void user_must_be_successfully_logged_in(String validateLogin) {
	System.out.println("login successful---"+validateLogin);
}

@And("^homepage \"([^\"]*)\" be displayed$")
public void homepage_must_be_displayed(String homepage) {
	System.out.println("home page is displayed---"+homepage);
}


}
