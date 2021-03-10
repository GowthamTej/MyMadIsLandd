package listners;




import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.htc.base.BaseTest;
import com.htc.base.SeleniumUtility;

import extentreport.ExtentManager;
import extentreport.ExtentTestManager;

public class TestListener implements ITestListener {
	private ExtentTestManager extentTestManager;

	
	public TestListener() {
		
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
		
		    Object testClass = result.getInstance();
		    WebDriver webDriver = ((BaseTest) testClass).getDriver();
		    
		    SeleniumUtility.ScreenShot(webDriver,result.getName(),"pass");
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
		extentTestManager.getTest().log(Status.FAIL, "Test Failed"+result.getThrowable()+"....."+result.getParameters()+"...."+result.getSkipCausedBy());
	    Object testClass = result.getInstance();
	    WebDriver webDriver = ((BaseTest) testClass).getDriver();
	    
	    SeleniumUtility.ScreenShot(webDriver,result.getName(),"fail");
	    
		String str=result.getThrowable().fillInStackTrace().getMessage();
		System.out.println(str);
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		extentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
		
			
	}

}
