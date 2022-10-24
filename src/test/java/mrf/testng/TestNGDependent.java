package mrf.testng;

import org.testng.annotations.Test;

public class TestNGDependent {
	@Test(dependsOnMethods = "test3")
	public void test1() {
		System.out.println("Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test(dependsOnMethods = "test4")
	public void test3() {
		System.out.println("Test 3");
	}

	@Test
	public void test4() {
		System.out.println("Test 4");
	}
}
