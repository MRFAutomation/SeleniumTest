package testpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import mrf.base.methods.GenericMethodsWD;

public class TestClass {

	public static void main(String[] args) {
		String chromeProp = "webdriver.chrome.driver";
		String chromePath = "C:\\Users\\eBricks\\eclipseExtFiles\\ChromeDriver105\\chromedriver.exe";
		System.setProperty(chromeProp, chromePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		GenericMethodsWD gm = new GenericMethodsWD(driver);
		
		String parentWinHandle = driver.getWindowHandle();
		
		gm.findElementBy(By.id("openwindow")).click();
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String handle : allHandles) {
			if (!handle.equals(parentWinHandle)) {
				driver.switchTo().window(handle);
				WebElement searchEleSubWin = gm.findElementBy(By.xpath("//input[@name=\"course\"]"));
				searchEleSubWin.sendKeys("Python");
				searchEleSubWin.sendKeys(Keys.ENTER);
				gm.delayInSeconds(3);
				driver.close();
				break;
			}
		}

		driver.switchTo().window(parentWinHandle);
		
		gm.findElementBy(By.name("enter-name")).sendKeys("MRF");

		driver.switchTo().frame("courses-iframe");
		WebElement searchEleIFrame = gm.findElementBy(By.xpath("//input[@id=\"search\"]"));
		searchEleIFrame.sendKeys("Python");
		searchEleIFrame.sendKeys(Keys.ENTER);
		gm.delayInSeconds(3);
		driver.switchTo().defaultContent();

		gm.findElementBy(By.id("enabled-example-input")).sendKeys("Rumman");

		WebElement mainEle = gm.findElementBy(By.id("mousehover"));

		Actions action = new Actions(driver);
		action.moveToElement(mainEle).perform();

		WebElement SubEle = gm.findElementBy(By.xpath("//a[@href=\"#top\"]"));
		action.moveToElement(SubEle).click().perform();

		gm.delayInSeconds(3);

		driver.quit();
	}

}
