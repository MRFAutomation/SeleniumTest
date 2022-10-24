package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import mrf.base.methods.InstanceOfEventFiringWebDriver;
import mrf.base.methods.StringConstantsSelenium;

public class SimpleClass {

	public static void main(String[] args) {
		EventFiringWebDriver eventFiringWebDriverriver = InstanceOfEventFiringWebDriver.getInstance();
		eventFiringWebDriverriver.manage().window().maximize();
		eventFiringWebDriverriver.get(StringConstantsSelenium.urlLetskodeitPractice);
		WebElement el = eventFiringWebDriverriver.findElement(By.id("displayed-text"));
		System.out.println("Class: " + el.getAttribute("class"));
		System.out.println("Name: " + el.getAttribute("name"));
		System.out.println("Type: " + el.getAttribute("type"));
		System.out.println("Placeholder: " + el.getAttribute("placeholder"));
		eventFiringWebDriverriver.quit();
	}
}
