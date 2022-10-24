package mrf.event.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import mrf.base.methods.GenericMethodsEFWD;
import mrf.base.methods.InstanceOfEventFiringWebDriver;
import mrf.base.methods.StringConstantsSelenium;

public class EventHandlingImplementation {

	public static void main(String[] args) {
	
		EventFiringWebDriver eDriver = InstanceOfEventFiringWebDriver.getInstance();
		GenericMethodsEFWD gm = new GenericMethodsEFWD(eDriver);
		
		gm.lauchWebPage(StringConstantsSelenium.urlGoogle);
		gm.findElementBy(By.name("q")).sendKeys("Muhammad Rana Farhan Saleem");
		gm.delayInSeconds(1);
		gm.findElementBy(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]")).click();
		gm.delayInSeconds(2);
		gm.quitBrowser();
	}
}
