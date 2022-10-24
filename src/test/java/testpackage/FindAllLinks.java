package testpackage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindAllLinks {
	WebDriver driver;

	@Test
	public void f() {
		List<WebElement> linksList = clickableLinks();
		for (WebElement link : linksList) {
			String href = link.getAttribute("href");
			try {
				System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
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

	public List<WebElement> clickableLinks() {
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for (WebElement e : elements) {
			if (e.getAttribute("href") != null) {
				linksToClick.add(e);
			}
		}
		return linksToClick;
	}

	public String linkStatus(URL url) {
		try {
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			String responseMessage = http.getResponseMessage();
			http.disconnect();
			return responseMessage;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
}
