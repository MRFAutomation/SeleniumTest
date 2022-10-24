package mrf.base.methods;

import java.util.Random;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class InstanceOfExtentReport {
	public static ExtentReports getInstance() {

		/* Generate Random String Start */
		String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 7; i++) {
			stringBuilder.append(string.charAt(random.nextInt(string.length())));
		}
		/* Generate Random String End */

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(
				StringConstantsSelenium.reportPath + stringBuilder.toString() + ".html");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("My First Automation Extent Report");
		spark.config().setReportName("Extent Report Demo");
				extent.attachReporter(spark);
		return extent;
	}

}
