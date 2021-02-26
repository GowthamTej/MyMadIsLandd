package com.htc.Base;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.DataProvider;

import com.htc.DataReader.TestUtil;

import com.htc.page.LoginPage;
import com.htc.prop.Property;

public class BaseClass  {
	protected WebDriver driver;
	public  Properties prop;
	protected LoginPage login;
	
	
	public  BaseClass() {
		Property pro = new Property();
		 prop=pro.getProp();

	}

	@BeforeMethod
	public void initialization() {
		String browserName=prop.getProperty("browser");
		switch(browserName) {
		case "chrome":
		System.setProperty(prop.getProperty("dri"), prop.getProperty("path"));
		driver = new ChromeDriver();
		break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		login = new LoginPage(driver);

	}
	
	

	@DataProvider
	public Object[][] validLogin() {
		TestUtil Tu = new TestUtil();

		Object[][] dat1 = Tu.getTestData("Test1");
   
		return dat1;

	}

	
	@DataProvider
	public Object[][] invalidLogin() {
		TestUtil Tu = new TestUtil();

		Object[][] dat2 = Tu.getTestData("Test2");

		return dat2;

	}
	
	
	@DataProvider
	public Object[][] billing() {
		TestUtil Tu = new TestUtil();

		Object[][] dat2 = Tu.getTestData("Tst");

		return dat2;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
