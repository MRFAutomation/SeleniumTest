package mrf.excel.read;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import mrf.base.methods.GenericMethodsWD;
import mrf.base.methods.StringConstantsSelenium;

public class HerokuHomePageFactory {
	ExtentTest test;
	WebDriver driver;
	GenericMethodsWD gm;

	public HerokuHomePageFactory(WebDriver driver, GenericMethodsWD gm, ExtentTest test) {
		this.driver = driver;
		this.gm = gm;
		this.test = test;
	}

	public void launchWebPage() {
		driver.manage().window().maximize();
		driver.get(StringConstantsSelenium.urlHerokuapp);
		String ssPath = gm.takeScreenshotWithImgPath();
		try {
			test.log(Status.INFO, "herokuapp webpage launched",
					MediaEntityBuilder.createScreenCaptureFromPath(ssPath).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enterUserName(String un) {
		gm.findElementBy(By.id("username")).sendKeys(un);
		String ssPath = gm.takeScreenshotWithImgPath();
		try {
			test.log(Status.INFO, "Username entered", MediaEntityBuilder.createScreenCaptureFromPath(ssPath).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String pw) {
		gm.findElementBy(By.id("password")).sendKeys(pw);
		String ssPath = gm.takeScreenshotWithImgPath();
		try {
			test.log(Status.INFO, "Password entered", MediaEntityBuilder.createScreenCaptureFromPath(ssPath).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void clickLoginButton() {
				gm.findElementBy(By.xpath("//button[@type=\"submit\"]")).click();
		test.log(Status.INFO, "Login button clicked");
	}

	public void validateLogin() {
			WebElement msg = gm.findElementBy(
				By.xpath("//div[@class=\"flash error\"]"));
		Assert.assertTrue(msg != null);
		String ssPath = gm.takeScreenshotWithImgPath();
		try {
			test.log(Status.PASS, "Test Case validated with invalid credentials",
					MediaEntityBuilder.createScreenCaptureFromPath(ssPath).build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void clickLogoutButton() {
		gm.findElementBy(By.xpath("//a[@href=\"/logout\"]")).click();
	}
}
