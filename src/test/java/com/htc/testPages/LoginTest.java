package com.htc.testPages;

import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.base.BaseTest;


public class LoginTest extends BaseTest {

	
	
	@Test(priority = 1,dataProviderClass =com.htc.base.DataProvider.class , dataProvider = "Login_data")
	private void TestvalidLogin(Map<Object, Object> mapData) {
		
      
		login.LOGIN_TO_HOME(mapData.get("userId").toString(), mapData.get("password").toString());
		System.out.println("valid login ");
	    Assert.assertEquals(driver.getTitle(),"My Account");
        
	}

	
	
	
	@Test(priority = 2,dataProviderClass =com.htc.base.DataProvider.class , dataProvider = "Login_data", enabled=true)
	private void TestInvalidLogin(Map<Object, Object> mapData) {

		login.LOGIN_TO_HOME(mapData.get("invid").toString(), mapData.get("invpass").toString());
		System.out.println("invalidLogin");
		Assert.assertEquals(driver.getTitle(),"Customer Login");

	}

}
