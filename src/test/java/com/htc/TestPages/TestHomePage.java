package com.htc.TestPages;

import java.util.Map;


import org.testng.annotations.Test;

import com.htc.Base.BaseClass;
import com.htc.page.HomePage;

public class TestHomePage extends BaseClass {
	 private HomePage homePage = null;
	 
	 
	 
 
	@Test(priority = 1,dataProviderClass =com.htc.Base.DataProviders.class , dataProvider = "validLogin")

	public void TestHomePgae_Accessibility(Map<Object, Object> mapData) {

		homePage = login.LOGIN_TO_HOME(mapData.get("userId").toString(), mapData.get("password").toString());
		homePage.clickOnSideBar();
		
		
	}
	
	

}
