package com.htc.Base;


import java.util.Properties;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.htc.page.LoginPage;
import com.htc.prop.Property;



public class BaseClass  {
	protected WebDriver driver=null;
	protected Properties prop=null;
	protected LoginPage login;
	
	public BaseClass() {
		Property pro = new Property();
		 prop=pro.getProp();
	}


	@BeforeMethod
	public void initialization() {
		DriverFactory drf=new DriverFactory();
		this.driver=drf.driver();
		this.login = new LoginPage(driver);
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();

	}

}
