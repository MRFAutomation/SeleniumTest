package mrf.testng;

import org.testng.annotations.Test;

import testpackage.SampleClass;

public class TestNGDataProviders {

//	@DataProvider(name = "dp")
//	public Object[][] getData() {
//		return new Object[][]{
//				{"Rana", "Rumman"},
//				{"Rana", "Farhan"}
//		
//		};
//	}
	
	@Test(dataProvider = "dp", dataProviderClass = SampleClass.class)
	public void f(String data1, String data2) {
		System.out.println(data1 + " " + data2);
	}
}
