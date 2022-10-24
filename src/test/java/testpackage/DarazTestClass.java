package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import mrf.base.methods.GenericMethodsWD;

public class DarazTestClass {

	public static void main(String[] args) {
		String chromeProp = "webdriver.chrome.driver";
		String chromePath = "C:\\Users\\eBricks\\eclipseExtFiles\\ChromeDriver98\\chromedriver.exe";
		System.setProperty(chromeProp, chromePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demostore.x-cart.com");
		GenericMethodsWD gm = new GenericMethodsWD(driver);

		WebElement loginBtn = gm
				.findElementBy(By.xpath("//div[@class=\"header_bar-sign_in\"]//span[text()=\"Sign in / sign up\"]"));
		loginBtn.click();

		gm.delayInSeconds(3);
		WebElement un = gm.findElementBy(By.id("login-email"));
		un.sendKeys("mrf.testdevice@gmail.com");
		WebElement pw = gm.findElementBy(By.id("login-password"));
		pw.sendKeys("Test@123");
		WebElement signIn = gm
				.findElementBy(By.xpath("//button[@class=\"btn  regular-button  submit\"]/span[text()='Sign in']"));
		signIn.click();
		gm.delayInSeconds(3);

		WebElement hotDealsMain = gm.findElementBy(By.xpath(
				"//ul[@class=\"nav navbar-nav top-main-menu\"]/li[@class=\"leaf first active\"]/following-sibling::li[@class=\"leaf has-sub\"]/span[text()='Hot deals']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(hotDealsMain).perform();
//		gm.delayInSeconds(2);

		WebElement saleBtn = gm
				.findElementBy(By.xpath("//ul[@class=\"nav navbar-nav top-main-menu\"]//a[@href=\"sale-products/\"]"));
		saleBtn.click();
		gm.delayInSeconds(4);
		driver.quit();
	}

}
