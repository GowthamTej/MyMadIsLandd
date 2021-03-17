package com.htc.base;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.htc.page.BillingInfo;
import com.htc.page.HomePage;
import com.htc.page.LogOutPage;
import com.htc.page.LoginPage;
import com.htc.page.VipPage;
import com.htc.prop.Property;

public class BaseTest {

	protected WebDriver driver = null;
	protected Properties prop = null;
	protected LogOutPage logOut=null;
	protected LoginPage loginPage=null;
	protected HomePage homePage=null;
	protected VipPage vipPage=null;
	protected BillingInfo billingInfo=null;
	
	
	public BaseTest() {
		
		Property pro = new Property();
		prop = pro.getProp();
	}

	@BeforeMethod
	public void initialization() {
		DriverFactory drf = new DriverFactory();
		this.driver = drf.driver();
		
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getMethod().getMethodName().equals("TestInvalidLogin")) {
			driver.quit();
		     }
		else if(ITestResult.FAILURE==result.getStatus()||ITestResult.SUCCESS==result.getStatus()) {
			logOut.ClickOnLogOut();
			driver.close();
			driver.quit();
		}
		else if(ITestResult.SKIP==result.getStatus()) {
			driver.close();
			driver.quit();
		}
		
	} 
	
	@BeforeMethod
	public  void objectCreation() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		 loginPage=new LoginPage(driver);
		 homePage=new HomePage(driver);
		 vipPage=new VipPage(driver);
		 billingInfo=new BillingInfo(driver);
		 logOut=new LogOutPage(driver);
		
	}

	public WebDriver getDriver() {
		
		return driver;
	}

	
	

}
