package mrf.base.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class InstanceOfEventFiringWebDriver {
	public static EventFiringWebDriver getInstance() {
		WebDriver driver = InstanceOfWebDriver.getChromeDriver();
		EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
		WebDriverEventListeners el = new WebDriverEventListeners();
		eDriver.register(el);
		return eDriver;
	}
}
