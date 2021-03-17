package com.htc.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.htc.page.BillingInfo;
import com.htc.page.HomePage;
import com.htc.page.LogOutPage;
import com.htc.page.LoginPage;
import com.htc.page.VipPage;

public class PageOpjects  {
	
	protected WebDriver driver = null;
	protected Properties prop = null;
	protected LogOutPage logOut=null;
	protected LoginPage loginPage=null;
	protected HomePage homePage=null;
	protected VipPage vipPage=null;
	protected BillingInfo billingInfo=null;  
	
	
	
	
	

}
