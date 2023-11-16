package steps;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pages.BankCashPage;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

@RunWith(Cucumber.class)
public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	BankCashPage bankcashPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		innitDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankcashPage = PageFactory.initElements(driver, BankCashPage.class);
		// databasePage = new DatabasePage();
		
	}

	@Given("User is on the techfios login page")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		// driver.get("https://qa.codefios.com/");
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_LoginData(String LoginData, String field) {

		switch (field) {

		case "username":
			loginPage.enterUserName(LoginData);
			break;

		case "password":
			loginPage.enterPassword(LoginData);

		}
	}

	@And("User clicks on {string}")
	public void user_clicks_on_button(String click) {

		switch (click) {

		case "login":
			loginPage.clickSignInButton();
			System.out.println("clicking login button");
			break;

		case "bankCash":
			bankcashPage.clickOnBankCashButton();
			System.out.println("clicking Bank & Cash Button");
			break;

		case "newAccount":
			bankcashPage.clickOnNewAccountButton();
			System.out.println("clicking New Account Button");
			break;

		case "submit":
			bankcashPage.clickSubmitButton();
			break;

		}
	}

	@And("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {

		System.out.println("User is on Dashboard Page");
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		takeScreenshot(driver);

	}

	@And("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String inputValue, String field) {

		switch (field) {

		case "accountTitle":
			bankcashPage.addAccountTitle(inputValue);
			System.out.println("Adding Title");

			break;

		case "description":
			bankcashPage.addDescription(inputValue);
			System.out.println("Adding Description");
			break;

		case "initialBalance":
			bankcashPage.addBalance(inputValue);
			System.out.println("Adding Initial Balance");
			break;

		case "accountNumber":
			bankcashPage.addAccount(inputValue);
			System.out.println("Adding Account Number");
			break;

		case "contactPerson":
			bankcashPage.addContactPerson(inputValue);
			System.out.println("Adding Contact Person");
			break;

		case "Phone":
			bankcashPage.addPhoneNumber(inputValue);
			System.out.println("Adding Phone Number");
			break;

		case "internetBankingURL":
			bankcashPage.addBankURL(inputValue);
			System.out.println("Adding Inernet Banking URL");
			break;

		}
	}

	@Then("User should be able to validate account created successfully")
	public void accountCreatedValidation() {
		System.out.println("User is on Accounts Page after adding details");
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		ExtentReportGenerator();
		reporterClose();
	}

	@After
	public void ReportAndtearDown() {
		driver.close();
		driver.quit();
	}

}