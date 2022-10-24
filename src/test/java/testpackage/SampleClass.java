package testpackage;

import org.testng.annotations.DataProvider;

public class SampleClass {
	@DataProvider(name = "dp")
	public Object[][] getData() {
		return new Object[][]{
				{"Rana", "Rumman"},
				{"Rana", "Farhan"}
		
		};
	}
}
