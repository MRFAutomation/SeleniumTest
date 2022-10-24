package testpackage;

import org.openqa.selenium.WebDriver;

import mrf.base.methods.InstanceOfWebDriver;
import mrf.base.methods.StringConstantsSelenium;

public class Tesla {

	public static void main(String[] args) {
		WebDriver driver = InstanceOfWebDriver.getChromeDriver();
		driver.manage().window().maximize();
		driver.get(StringConstantsSelenium.URL_TESLA);
	}

}
