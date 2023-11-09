package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	@Given("User is on Techfios login page")
	public void user_is_on_Techfios_login_page() {
		innitDriver();
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String string) {
	    
	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String string) {
	  
	}

	@When("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
	
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
	
	}

	
}
