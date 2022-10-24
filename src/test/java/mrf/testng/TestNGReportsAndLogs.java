package mrf.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReportsAndLogs {
	@Test
	public void test1() {
		Reporter.log("TestNGReportsAndLogs => test1",true);
		
	}

	@Test
	public void test2() {
		Reporter.log("TestNGReportsAndLogs => test2",true);
	}

	@Test
	public void test3() {
		Reporter.log("TestNGReportsAndLogs => test3",true);
	}
}
