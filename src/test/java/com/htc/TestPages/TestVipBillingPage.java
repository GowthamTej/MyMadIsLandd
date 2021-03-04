package com.htc.TestPages;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.Base.BaseClass;
import com.htc.page.BillingInfo;
import com.htc.page.HomePage;
import com.htc.page.VipPage;

public class TestVipBillingPage extends BaseClass{
	
	
	private HomePage homePage=null;
	
	
	@Test(priority = 1,dataProviderClass =com.htc.Base.DataProviders.class ,dataProvider="billing")
	private void VipBillingTest(Map <Object,Object>mapData) {
		homePage=login.LOGIN_TO_HOME(prop.getProperty("email"),prop.getProperty("password"));
		VipPage vp=homePage.clickOnVip();
		BillingInfo bill=vp.Vip();
		bill.billingInfo(mapData);
		 
		String hm=bill.verifyBilling();
		System.out.println(hm);
		
		//Assert.assertEquals();
		
	}

}
