package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import mrf.base.methods.GenericMethodsWD;

public class DragDropTest {

	public static void main(String[] args) {
		String chromeProp = "webdriver.chrome.driver";
		String chromePath = "C:\\Users\\eBricks\\eclipseExtFiles\\ChromeDriver95\\chromedriver.exe";
		System.setProperty(chromeProp, chromePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/droppable/");
		driver.get("https://jqueryui.com/slider/");
		GenericMethodsWD gm = new GenericMethodsWD(driver);

		driver.switchTo().frame(0);

//		WebElement src = gm.findElementBy(By.id("draggable"));
//		WebElement des = gm.findElementBy(By.id("droppable"));

		WebElement slider = gm
				.findElementBy(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"]"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, 270, 0).perform();
//		gm.dragDrop(src, des);
//		gm.dragDropHold(src, des);

		gm.delayInSeconds(3);

		driver.quit();

		
	}

}
