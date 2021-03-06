package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGeneration {
	public static ExtentReports extent;

	public static ExtentReports extentReportGenerator() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reports = new ExtentSparkReporter(path);
		reports.config().setReportName("Automation Test Results");
		reports.config().setDocumentTitle("Test Reports");
		reports.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reports);
		extent.setSystemInfo("Tester", "Bharath");
		extent.setSystemInfo("Environment", "Test");
		return extent;
	}
}
