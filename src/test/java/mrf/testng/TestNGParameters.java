package mrf.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mrf.base.methods.GenericMethodsWD;

public class TestNGParameters {
	WebDriver driver;
	GenericMethodsWD gm;

	@Test
	@Parameters({ "mrf", "rumi", "siteURL" })
	public void TestCase1(String mrf, String rumi, String siteURL) {
		System.out.println(mrf);
		gm = new GenericMethodsWD(driver);
		driver.manage().window().maximize();
		driver.get(siteURL);
		System.out.println(rumi);
	}

	@BeforeClass
	@Parameters({ "browser", "chromeProp", "chromePath" })
	public void setUp(String browser, String chroProp, String chroPath) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(chroProp, chroPath);
			driver = new ChromeDriver();
		}
	}

	@AfterClass
	public void cleanUp() {
		gm.delayInSeconds(2);
		driver.close();
	}
}
