package com.htc.testPages;
import java.util.Map;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.htc.base.BaseTest;
public class LoginTest extends BaseTest {
	 
	public LoginTest() {
		super();
	}
	

	@Test(priority = 1, dataProviderClass = com.htc.base.DataProvider.class, dataProvider ="data")
	private void TestvalidLogin(Map<Object, Object> mapData) {
		loginPage.LOGIN_TO_HOME(mapData.get("userid").toString(), mapData.get("password").toString());
		System.out.println("valid login ");
		Assert.assertEquals(driver.getTitle(), "My Account");
		
	}
	
	
	@Test(priority = 2, dataProviderClass = com.htc.base.DataProvider.class, dataProvider ="data", enabled =true)
	private void TestInvalidLogin(Map<Object, Object> mapData) {
		loginPage.LOGIN_TO_HOME(mapData.get("invalidUserid").toString(), mapData.get("invalidPassword").toString());
		System.out.println("invalidLogin");
		Assert.assertEquals(driver.getTitle(), "Customer Login");
	}
}
