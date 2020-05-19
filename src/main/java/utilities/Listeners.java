package utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends ScreenshotPath implements ITestListener {

	ExtentReports extent = ExtentReportGeneration.extentReportGenerator();
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Pased");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		test.fail(result.getThrowable());
		Object testObject = result.getInstance();
		Class resultClass = result.getTestClass().getRealClass();
		try {
			driver =(WebDriver)resultClass.getField("driver").get(testObject);
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1 ) {
			e1.printStackTrace();
		} 
		
		try {
			test.addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}
}