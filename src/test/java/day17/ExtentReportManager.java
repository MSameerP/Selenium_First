package day17;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	
	@Override
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name","localhost");
		extent.setSystemInfo("Enviroment","QA");
		extent.setSystemInfo("Tester Name","Sameer");
		extent.setSystemInfo("OS","Windows10");
		extent.setSystemInfo("Browser name","Chrome");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); //create a new entry in the report\
		test.log(Status.PASS, "test case passed is: "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed is: "+result.getName());
		test.log(Status.FAIL,"Test case failed cause is: "+result.getThrowable());
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case skipped is: "+result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
