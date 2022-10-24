package mrf.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	@Test
	public void f1() {
		System.out.println("f1 strat");
		int actualResult = 2 + 8;
		int expectedResult = 10;
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("f1 end");
	}

	@Test
	public void f2() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("f2 strat");
		softAssert.assertEquals(true, false);
		System.out.println("f2 end");
		softAssert.assertAll();
	}
}
