package mrf.excel.read;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import mrf.base.methods.InstanceOfExtentReport;
import mrf.base.methods.GenericMethodsWD;
import mrf.base.methods.StringConstantsSelenium;

public class LoginTestWithExcel {
	ExtentTest test;
	WebDriver driver;
	GenericMethodsWD gm;
	ExtentReports report;
	HerokuHomePageFactory herokuHomePage;
	
	@DataProvider(name = "invalidLoginData")
	public Object[][] dataProvider() {
		Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}

	@Test(dataProvider="invalidLoginData")
	public void loginTestCase(String username, String password) {
		herokuHomePage.launchWebPage();
		herokuHomePage.enterUserName(username);
		herokuHomePage.enterPassword(password);
		herokuHomePage.clickLoginButton();
		herokuHomePage.validateLogin();
	}
	@BeforeClass
	public void setUp() {
		report = InstanceOfExtentReport.getInstance();
		test = report.createTest("Login Test Class Started");
		System.setProperty(StringConstantsSelenium.chromeProp, StringConstantsSelenium.chromePath);
		driver = new ChromeDriver();
		gm = new GenericMethodsWD(driver);
		herokuHomePage = new HerokuHomePageFactory(driver,gm,test);
		// Tell the code about the location of Excel file
				try {
					ExcelUtility.setExcelFile(StringConstantsSelenium.excelLoginBookPath, StringConstantsSelenium.excelSheetName);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	@AfterClass
	public void cleanUp() {
		driver.close();
		report.flush();
	}
}
