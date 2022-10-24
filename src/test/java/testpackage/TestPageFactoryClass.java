package testpackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import mrf.base.methods.InstanceOfWebDriver;
import mrf.base.methods.GenericMethodsWD;
import mrf.pagefactory.PracticePageFactory;

public class TestPageFactoryClass {
	private static final Logger log = LogManager.getLogger(TestPageFactoryClass.class.getName());

	public static void main(String[] args) {

		WebDriver driver = InstanceOfWebDriver.getChromeDriver();
		GenericMethodsWD genericMethods = new GenericMethodsWD(driver);
		PracticePageFactory practicePageFactory = new PracticePageFactory(driver);

		practicePageFactory.enterName();
		practicePageFactory.enterDispText();

		genericMethods.delayInSeconds(3);
		log.trace("Trace log message");
		log.debug("Debug log message");
		log.info("Info log message");
		log.warn("Warning log message");
		log.error("Error log message");
		log.fatal("Fatal log message");

		driver.quit();
	}
}
