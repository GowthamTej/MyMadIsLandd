package com.htc.base;

import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.htc.page.LoginPage;
import com.htc.prop.Property;

public class BaseTest {
	protected WebDriver driver = null;
	protected Properties prop = null;
	protected LoginPage login;

	public BaseTest() {
		Property pro = new Property();
		prop = pro.getProp();
	}

	@BeforeMethod
	public void initialization() {
		DriverFactory drf = new DriverFactory();
		this.driver = drf.driver();
		this.login = new LoginPage(driver);
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		
		if (result.getMethod().getMethodName().equals("TestInvalidLogin")) {
			driver.quit();
		} else {
			login.ClickOnLogOut();
			driver.quit();
		}

	}

	public void ExplicitWait(int tm, WebElement we) {

		try {
			WebElement wdw = new WebDriverWait(driver, tm).until(ExpectedConditions.visibilityOf(we));
			boolean status = wdw.isDisplayed();
			if (status) {
				System.out.println("===== WebDriver is visible======");
			}
		} catch (NoSuchElementException nsee) {
			System.out.println("You are getting No Such Element Exception" + "------------>");
			nsee.printStackTrace();
		} catch (Exception e) {
			System.out.println("You are getting other Exception");
			// Perform What you want if any other exception happens (Except
			// NoSuchElementException )
			e.printStackTrace();
		}

	}

	public WebDriver getDriver() {
		return driver;
	}

}
