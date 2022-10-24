package mrf.testng.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGCommonStuff {

	@BeforeClass
	public void beforeClass() {
		System.out.println("TestNGCommonStuff - Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TestNGCommonStuff - After Class");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("TestNGCommonStuff - Before Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("TestNGCommonStuff - After Suite");
	}
@BeforeTest
public void beforeTest() {
	System.out.println("TestNGCommonStuff - Before Test");
}
@AfterTest
public void afterTest() {
	System.out.println("TestNGCommonStuff - After Test");
}
}
