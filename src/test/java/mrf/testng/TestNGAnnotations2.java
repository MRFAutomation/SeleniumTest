package mrf.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mrf.testng.base.TestNGCommonStuff;

public class TestNGAnnotations2 extends TestNGCommonStuff {
	@Test
	public void test1() {
		System.out.println("TestNGAnnotations2 - Test-1");
	}

	@Test
	public void test2() {
		System.out.println("TestNGAnnotations2 - Test-2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestNGAnnotations2 - Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("TestNGAnnotations2 - After Method");
	}

	@BeforeClass
	public void setUp() {
		System.out.println("TestNGAnnotations2 - Before Class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNGAnnotations2 - After Class");
	}
}
