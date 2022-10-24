package mrf.base.methods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethodsWD {

	/* Global declarations */
	WebDriver driver;

	/* Constructors */
	public GenericMethodsWD(WebDriver driver) {
		this.driver = driver;
	}

	public GenericMethodsWD() {
	}

	public WebElement findElementBy(By locator) {
		/* Method FindElement */
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			System.out.println("Element found with findElement -  " + locator);
		} catch (Exception e) {
			System.out.println("Element not found with findElement - " + locator);
		}
		return element;
	}

	/* Method FindElements */
	public List<WebElement> findElementsBy(By locator) {
		List<WebElement> elementsList = new ArrayList<WebElement>();
		elementsList = driver.findElements(locator);
		if (elementsList.isEmpty()) {
			System.out.println("Elements not found with findElements - " + locator);
			elementsList = null;
			return elementsList;
		} else {
			System.out.println("Elements found with findElements - " + locator);
			return elementsList;
		}
	}

	/* Method WaitForElement */
	public WebElement waitForElement(By locator, int timeOutInSeconds) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println(
					"Element found with waitForElement - " + locator + " within " + timeOutInSeconds + " seconds");
		} catch (Exception e) {
			System.out.println(
					"Element not found with waitForElement - " + locator + " within " + timeOutInSeconds + " seconds");
		}
		return element;
	}

	/* Method WaitElementToBeClickable */
	public void waitElementToBeClickable(By locator, int timeOutInSeconds) {
		try {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			System.out
					.println("Element with locator - " + locator + " cliked within - " + timeOutInSeconds + " seconds");

		} catch (Exception e) {
			System.out.println(
					"Element with locator - " + locator + " not appeared in - " + timeOutInSeconds + " seconds");
		}
	}

	/* Method GenerateRandomString */
	public String generateRandomString() {
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			stringBuilder.append(string.charAt(random.nextInt(string.length())));
		}
		return stringBuilder.toString();
	}

	/* Method TakeScreenshot */
	public void takeScreenshot() {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File("C:\\Users\\eBricks\\eclipse-workspace\\SeleniumProject\\reports\\"
					+ generateRandomString() + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	/* Method TakeScreenshot with image path return */
	public String takeScreenshotWithImgPath() {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//		String imgPath = "C:\\Users\\eBricks\\eclipse-workspace\\SeleniumProject\\reports\\" + generateRandomString()+ ".png";

		String destImgPath = "Screenshots" + File.separator + dateTime() + File.separator + generateRandomString()
				+ ".png";
		try {
			FileUtils.copyFile(sourceFile, new File(destImgPath));
		} catch (IOException e) {

			e.printStackTrace();
		}
		return destImgPath;
	}

	/* Method Sleep */
	public void delayInSeconds(int timeInSeconds) {
		int timeInMilliSeconds = timeInSeconds * 1000;
		try {
			Thread.sleep(timeInMilliSeconds);
		} catch (Exception e) {
			System.out.println("Exception in ThreadDotSleep");
			e.printStackTrace();
		}
	}

	/* Method DragDrop */
	public void dragDrop(WebElement src, WebElement des) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, des).build().perform();
	}

	/* Method DragDropHold */
	public void dragDropHold(WebElement src, WebElement des) {
		Actions action = new Actions(driver);
		action.clickAndHold(src).moveToElement(des).build().perform();
		action.release();
	}

	/* Launch Web Browser */
	public void lauchWebPage(String webPage) {
		driver.get(webPage);
	}

	/* Quit Web Browser */
	public void closeBrowser() {
		driver.close();
	}

	/* Quit Web Browser */
	public void quitBrowser() {
		driver.quit();
	}

	/* Get Date and Time common Method */
	public String dateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
