package mrf.extentreports;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mrf.base.methods.InstanceOfExtentReport;

public class TestNGNewTest {
	ExtentTest test;
	ExtentReports report;
  @Test
  public void test2() {
	  test.log(Status.INFO, "TestNGNewTest => test2");
  }
  @BeforeClass
  public void beforeClass() {
	  report = InstanceOfExtentReport.getInstance();
	  test = report.createTest("Test from TestNGNewTest started");
	  test.log(Status.INFO, "TestNGNewTest => beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  test.log(Status.INFO, "TestNGNewTest => afterClass");
	  report.flush();
  }

}
