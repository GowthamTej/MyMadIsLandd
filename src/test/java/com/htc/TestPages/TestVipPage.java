package com.htc.TestPages;

import java.util.Map;

import org.testng.annotations.Test;

import com.htc.Base.BaseClass;

import com.htc.page.HomePage;
import com.htc.page.VipPage;

public class TestVipPage  extends BaseClass {
	    private HomePage homePage=null;
	
	
     	@Test(priority = 1,dataProviderClass =com.htc.Base.DataProviders.class ,dataProvider="validLogin")
	    public void testVipPage(Map <Object,Object>mapData) 
     	{
     		
		homePage=login.LOGIN_TO_HOME(mapData.get("userId").toString(),mapData.get("password").toString());
		homePage.clickOnVip();
		
		   VipPage vp=new VipPage(driver);
	       vp.Vip();
			
	    	
	    }

}
