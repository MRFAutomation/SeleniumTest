package mrf.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageFactory {
	
	WebDriver driver;

	@FindBy(name="enter-name")
	WebElement nameText;
	
	@FindBy(id="displayed-text")
	WebElement showHideText;
	
	public void enterName() {
		nameText.sendKeys("Rumman");
	}
	
	public void enterDispText() {
		showHideText.sendKeys("Rabail");
	}
	
	public PracticePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
