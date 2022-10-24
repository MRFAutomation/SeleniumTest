package mrf.testng;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNGITestResult {
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if (testResult.isSuccess()) {
			System.out.println("Test case: " + testResult.getName() + " is pass");
		} else {
			System.out.println("Test case: " + testResult.getName() + " is fail");
		}
	}
}

