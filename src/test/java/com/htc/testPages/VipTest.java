package com.htc.testPages;

import java.util.Map;
import org.testng.annotations.Test;
import com.htc.base.BaseTest;
import com.htc.page.HomePage;
public class VipTest extends BaseTest {
	private HomePage homePage = null;

	@Test(priority = 1, dataProviderClass = com.htc.base.DataProvider.class, dataProvider = "data")
	private void testVipPage(Map<Object, Object> mapData) {

		homePage = loginPage.LOGIN_TO_HOME(mapData.get("userid").toString(), mapData.get("password").toString());
		homePage.clickOnVip();
		vipPage.Vip();
	}

}
