package com.htc.testPages;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.base.BaseTest;
import com.htc.page.BillingInfo;
import com.htc.page.HomePage;
import com.htc.page.VipPage;

public class VipBillingTest extends BaseTest{
	
	
	private HomePage homePage=null;
	
	
	@Test(priority = 1,dataProviderClass =com.htc.base.DataProvider.class ,dataProvider="billing")
	private void VipBillingTest(Map <Object,Object>mapData) {
		homePage=login.LOGIN_TO_HOME(prop.getProperty("email"),prop.getProperty("password"));
		VipPage vp=homePage.clickOnVip();
		BillingInfo bill=vp.Vip();
		bill.billingInfo(mapData);
		String hm=bill.verifyBilling();
		System.out.println(hm);
		Assert.assertEquals(hm,"THANK YOU FOR YOUR PURCHASE!");
		
	}

}
