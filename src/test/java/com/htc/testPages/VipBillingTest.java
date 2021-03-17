package com.htc.testPages;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.htc.base.BaseTest;
import com.htc.page.HomePage;


public class VipBillingTest extends BaseTest {

	private HomePage homePage = null;
	
	@Test(priority = 1, dataProviderClass = com.htc.base.DataProvider.class,dataProvider="data")
	private void vipBillingTest(Map<Object, Object> mapData) {
		 homePage= loginPage.LOGIN_TO_HOME(mapData.get("userid").toString(), mapData.get("password").toString());
		 homePage.clickOnVip();
		 billingInfo= vipPage.Vip();
		 billingInfo.billingInfo(mapData);
		String hm = billingInfo.verifyBilling();
		Assert.assertEquals(hm, "THANK YOU FOR YOUR PURCHASE!");
	}

}
