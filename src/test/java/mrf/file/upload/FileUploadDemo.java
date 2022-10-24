package mrf.file.upload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import mrf.base.methods.InstanceOfWebDriver;
import mrf.base.methods.GenericMethodsWD;
import mrf.base.methods.StringConstantsSelenium;

public class FileUploadDemo {

	public static void main(String[] args) {
		WebDriver driver = InstanceOfWebDriver.getChromeDriver();
		GenericMethodsWD gm = new GenericMethodsWD(driver);
		driver.get(StringConstantsSelenium.urlAdobePdfToWord);
		gm.findElementBy(By.id("lifecycle-nativebutton")).click();
		gm.delayInSeconds(1);
		try {
			Runtime.getRuntime().exec(StringConstantsSelenium.autoItScriptPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		gm.waitElementToBeClickable(By.xpath("//button[@data-test-id=\"download\"]"), 20);
		gm.delayInSeconds(5);
		driver.quit();
	}
}
