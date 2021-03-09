package com.htc.testPages;

import java.util.Map;


import org.testng.annotations.Test;

import com.htc.base.BaseTest;
import com.htc.page.HomePage;

public class HomeElementsTest extends BaseTest {
	 private HomePage homePage = null;
	 
	@Test(priority = 1,dataProviderClass =com.htc.base.DataProvider.class , dataProvider = "Login_data")

	public void TestHomePgae_Accessibility(Map<Object, Object> mapData) {

		homePage = login.LOGIN_TO_HOME(mapData.get("userId").toString(), mapData.get("password").toString());
		homePage.clickOnSideBar();
		
	}
	
}
