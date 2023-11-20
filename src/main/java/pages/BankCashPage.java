package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.aventstack.extentreports.Status;

public class BankCashPage extends TestBase {
	
	WebDriver driver;
	
	public BankCashPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") WebElement BankCashLink;
@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a") WebElement NewAccountLink;
@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement AccountTitle;
@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]") WebElement Description_Element;
@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]") WebElement Balance_Element;
@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]") WebElement AccountNumber_Element;	
@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]") WebElement ContactPerson_Element;	
@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]") WebElement PhoneNumber_Element;
@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]") WebElement BankingURL_Element;
@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") WebElement SubmitButton_Element;

//tbody/tr[680]/td[1]
//String before_xpath= "//tbody/tr[";
//String afterx_path= "680]/td[1]";

public void clickOnBankCashButton()  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				BankCashLink.click();
	}
	
	public void clickOnNewAccountButton()  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		NewAccountLink.click();
	}
	
	public void addAccountTitle(String title)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AccountTitle.sendKeys(title+generateRandomNum(300));
			}
	
	public void addDescription(String description)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Description_Element.sendKeys(description);
		
	}
	
	public void addBalance(String balance)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Balance_Element.sendKeys(balance);
		
	}

	public void addAccount(String accnum)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		AccountNumber_Element.sendKeys(accnum+generateRandomNum(300));	
	}
	
	public void addContactPerson(String contact)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ContactPerson_Element.sendKeys(contact);	
	}
	
	public void addPhoneNumber(String phn)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		PhoneNumber_Element.sendKeys(phn+generateRandomNum(300));	
	}
	
	public void addBankURL(String URL)  {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BankingURL_Element.sendKeys(URL+"/"+generateRandomNum(300));	
	}
	
	public void clickSubmitButton()  {
		
		SubmitButton_Element.click();	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		takeScreenshot(driver);

	}
	
    
}
