package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends TestBase{
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element Library

		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement UserName;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement Password;
		@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
		WebElement SignInButton;
		@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Account_Validation_Page_Eliment;

		public void enterUserName(String userName) {
			UserName.sendKeys(userName);
		}

		public void enterPassword(String password) {
			Password.sendKeys(password);

		}

		public void clickSignInButton() {
			SignInButton.click();

		}

		public String getPageTitle() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return driver.getTitle();
		}
}
