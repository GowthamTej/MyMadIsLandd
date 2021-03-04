package com.htc.TestPages;

import java.util.Map;
import org.testng.annotations.Test;
import com.htc.Base.BaseClass;


public class LoginTest extends BaseClass {

	
	
	@Test(priority = 1,dataProviderClass =com.htc.Base.DataProviders.class , dataProvider = "validLogin")
	public void TestvalidLogin(Map<Object, Object> mapData) {

		login.LOGIN_TO_HOME(mapData.get("userId").toString(), mapData.get("password").toString());
		System.out.println("validLogin");

	//	Assert.assertEquals(driver.getTitle(), "My Account");
	}

	
	
	
	@Test(priority = 2,dataProviderClass =com.htc.Base.DataProviders.class , dataProvider = "invalidLogin")
	public void TestInvalidLogin(Map<Object, Object> mapData) {

		login.LOGIN_TO_HOME(mapData.get("userId").toString(), mapData.get("password").toString());
		System.out.println("invalidLogin");
		//Assert.assertEquals(driver.getTitle(), "Customer Login");

	}

}
