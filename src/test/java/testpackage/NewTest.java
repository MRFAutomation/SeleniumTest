package testpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {
		List<WebElement> elementsList = driver.findElements(By.tagName("a"));
		for (WebElement element : elementsList) {
			
				System.out.println(element.getText());
			
		}
	}

	@BeforeClass
	public void beforeClass() {
		String chromeProp = "webdriver.chrome.driver";
		String chromePath = "C:\\Users\\eBricks\\eclipseExtFiles\\ChromeDriver105\\chromedriver.exe";
		System.setProperty(chromeProp, chromePath);

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
		driver.close();
	}
}
