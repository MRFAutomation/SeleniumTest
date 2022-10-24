package mrf.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGPriority {
  @Test (priority = 2)
  public void test1() {
	  System.out.println("TestNGPriority - test1");
  }
  @Test (priority = 3)
  public void test2() {
	  System.out.println("TestNGPriority - test2");
  }
  @Test (priority = 1)
  public void test3() {
	  System.out.println("TestNGPriority - test3");
  }
  @Test (priority = 0)
  public void test4() {
	  System.out.println("TestNGPriority - test4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("TestNGPriority - beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("TestNGPriority - afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("TestNGPriority - beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("TestNGPriority - afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("TestNGPriority - beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("TestNGPriority - afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("TestNGPriority - beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("TestNGPriority - afterSuite");
  }

}
