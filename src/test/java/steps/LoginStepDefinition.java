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
import pages.LoginPage;
import pages.TestBase;

@RunWith(Cucumber.class)
public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	BankCashPage bankcashPage;

	@Before
	public void beforeRun() {
		innitDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		bankcashPage = PageFactory.initElements(driver, BankCashPage.class);
		//ExtentReportGenerator();
	}

	@Given("User is on the techfios login page")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=login/");
		//ExtentReportGenerator();
	}

	@When("User enters the username as {string} in the \"username\" field")
	public void user_enters_the_username_as(String username) {
		loginPage.enterUserName(username);
		//ExtentReportGenerator();
	}
	

	@When("User enters the password as {string} in the \"password\" field")
	public void user_enters_the_password_as(String password) {
		loginPage.enterPassword(password);
		//ExtentReportGenerator();

	}

	@When("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("clicking login button");
		loginPage.clickSignInButton();
		//ExtentReportGenerator();
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		System.out.println("User is on Dashboard Page");
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
        ExtentReportGenerator();
		takeScreenshot(driver);

	}

	@And("User clicks on \"bankCash\"")
	public void user_clicks_on_the_bank_cash() {

		System.out.println("clicking Bank & Cash Button");
		bankcashPage.clickOnBankCashButton();
       // ExtentReportGenerator();

	}

	@And("User clicks on \"newAccount\"")
	public void user_clicks_on_the_new_account() {
		System.out.println("clicking New Account Button");
		bankcashPage.clickOnNewAccountButton();
        //ExtentReportGenerator();

	}

	@And("User enters {string} in the \"accountTitle\" field in accounts page")
	public void add_account_title(String title) {
		System.out.println("Adding Title");
		bankcashPage.addAccountTitle(title);
        //ExtentReportGenerator();
	}
	
	@And ("User enters {string} in the \"description\" field in accounts page")
	public void add_description(String description) {
		System.out.println("Adding Description");
		bankcashPage.addDescription(description);
        //ExtentReportGenerator();
	}

	@And ("User enters {string} in the \"initialBalance\" field in accounts page")
	public void add_initialBalance(String balance) {
		System.out.println("Adding Initial Balance");
		bankcashPage.addBalance(balance);
        //ExtentReportGenerator();
	}
	
	@And ("User enters {string} in the \"accountNumber\" field in accounts page")
	public void add_accountNumber(String accNum) {
		System.out.println("Adding Account Number");
		bankcashPage.addAccount(accNum);
        //ExtentReportGenerator();
	}

	@And ("User enters {string} in the \"contactPerson\" field in accounts page")
	public void add_contactPerson(String conPerson) {
		System.out.println("Adding Contact Person");
		bankcashPage.addContactPerson(conPerson);
        //ExtentReportGenerator();
	}
	
	@And ("User enters {string} in the \"Phone\" field in accounts page")
	public void add_Phone(String phone) {
		System.out.println("Adding Phone Number");
		bankcashPage.addPhoneNumber(phone);
        //ExtentReportGenerator();
	}
	
	@And ("User enters {string} in the \"internetBankingURL\" field in accounts page")
	public void add_IntertBankingURL(String bankUrl) {
		System.out.println("Adding Inernet Banking URL");
		bankcashPage.addBankURL(bankUrl);
        //ExtentReportGenerator();
	}
	
	@And("User clicks on \"submit\"")
	public void user_clicks_on_submit_button() {
		System.out.println("clicking Submit button");
		bankcashPage.clickSubmitButton();
        //ExtentReportGenerator();
		
	}
	
	@Then("User should be able to validate account created successfully")
	public void accountCreatedValidation() {
		System.out.println("User is on Accounts Page after adding details");
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
        ExtentReportGenerator();
	}
	
	@After
	public void tearDown() {
		//ExtentReportGenerator();
		driver.close();
		driver.quit();
	}
}
