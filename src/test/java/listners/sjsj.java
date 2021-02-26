package listners;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentreport.ExtentManager;
import extentreport.ExtentTestManager;

public class sjsj implements ITestListener {
	ExtentTestManager extentTestManager;
	public sjsj() {
		extentTestManager=new ExtentTestManager();
		
	}
	

	public void onStart(ITestContext context) {
	
		System.out.println("*** Test Suite " + context.getName() + " started ***");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		extentTestManager.endTest();
		context.getCurrentXmlTest();
		
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		extentTestManager.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
		extentTestManager.getTest().log(Status.PASS, "Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		extentTestManager.getTest().log(Status.FAIL, "Test Failed"+result.getThrowable()+"....."+result.getParameters()+"...."+result.getSkipCausedBy());
		
		
		
		
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		extentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
		
			
		
		
	}

}
