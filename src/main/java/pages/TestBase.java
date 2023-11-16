package pages;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class TestBase {

	public static WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	

	public static void innitDriver() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	}

	public void takeScreenshot(WebDriver driver) {

		TakesScreenshot screenshot = (TakesScreenshot) driver; // type casting
		File file = screenshot.getScreenshotAs(OutputType.FILE); //capturing and storing into File class ref var file
		try {
			FileUtils.copyFile(file,
					new File(System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png"));
			//process new File to machine ind user dir, creating srcreenshot folder and save using png format

		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public int generateRandomNum(int randomNum) {
			Random ran= new Random();
			int generatedNum=ran.nextInt(randomNum);
			return generatedNum;
		}
	
	public void ExtentReportGenerator() {
		ExtentHtmlReporter htmlReporter= new ExtentHtmlReporter("extentReport.html");
		extent= new ExtentReports(); //creating object of ExtentReports class
		extent.attachReporter(htmlReporter); //allowing it to access all started tests, nodes and logs
		test= extent.createTest("Report:User should be able to validate account created successfully"); //for the purpose of keeping log
		test.log(Status.INFO, "execution started"); //not mandatory-for the purpose of keeping log
	}
	
	public void reporterClose() {
		extent.flush(); //flash the previously generated report
	}
	


}
