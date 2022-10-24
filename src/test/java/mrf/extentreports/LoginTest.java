package mrf.extentreports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import mrf.base.methods.InstanceOfExtentReport;
import mrf.base.methods.GenericMethodsWD;
import mrf.base.methods.StringConstantsSelenium;

public class LoginTest {
	ExtentTest test;
	WebDriver driver;
	GenericMethodsWD gm;
	ExtentReports report;
	HerokuHomePage herokuHomePage;

	@Test
	public void loginTestCase() {
		herokuHomePage.launchWebPage();
		herokuHomePage.enterUserName();
		herokuHomePage.enterPassword();
		herokuHomePage.clickLoginButton();
		herokuHomePage.validateLogin();
		herokuHomePage.clickLogoutButton();
	}
	@BeforeClass
	public void setUp() {
		report = InstanceOfExtentReport.getInstance();
		test = report.createTest("Login Test Class Started");
		System.setProperty(StringConstantsSelenium.chromeProp, StringConstantsSelenium.chromePath);
		driver = new ChromeDriver();
		gm = new GenericMethodsWD(driver);
		herokuHomePage = new HerokuHomePage(driver,gm,test);
	}
	@AfterClass
	public void cleanUp() {
		driver.close();
		report.flush();
	}
}
