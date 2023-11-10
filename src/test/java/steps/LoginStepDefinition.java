package steps;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;

	@Before
	public void beforeRun() {
		innitDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("User is on Techfios login page")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");

	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {

		loginPage.enterUserName(username);

	}

	@When("User enters the password as {string}")
	public void user_enters_the_password_as(String password) {
		loginPage.enterUserName(password);

	}

	@When("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		loginPage.clickSignInButton();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard -iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "page not found!");
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
