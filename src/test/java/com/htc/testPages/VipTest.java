package com.htc.testPages;

import java.util.Map;

import org.testng.annotations.Test;

import com.htc.base.BaseTest;
import com.htc.page.HomePage;
import com.htc.page.VipPage;

public class VipTest  extends BaseTest {
	    private HomePage homePage=null;
	
	
     	@Test(priority = 1,dataProviderClass =com.htc.base.DataProvider.class ,dataProvider="Login_data")
	    private void testVipPage(Map <Object,Object>mapData) 
     	{
     		
		homePage=login.LOGIN_TO_HOME(mapData.get("userId").toString(),mapData.get("password").toString());
		homePage.clickOnVip();
		
		   VipPage vp=new VipPage(driver);
	       vp.Vip();
			
	    	
	    }

}
