package mrf.base.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanceOfWebDriver {

	public static WebDriver getChromeDriver() {
		System.setProperty(StringConstantsSelenium.chromeProp, StringConstantsSelenium.chromePath);
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		return new ChromeDriver();
	}
}
