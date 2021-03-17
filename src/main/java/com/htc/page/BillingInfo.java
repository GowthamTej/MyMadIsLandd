package com.htc.page;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BillingInfo  {
	private WebDriver driver;

	@FindBy(xpath = "//div[@class='input-box']//select[@name='billing_address_id' and @id='billing-address-select']/option[2]")
	private WebElement addrs;

	@FindBy(xpath = "//input[@id='billing:company']") //
	private WebElement company;

	@FindBy(xpath = "//input[@id='billing:email']")
	private WebElement emailID;

	@FindBy(xpath = "//input[@id='billing:street1' ]") //
	private WebElement StreetAddress;

	@FindBy(xpath = "//input[ @id='billing:street2']") //
	private WebElement StreetAddress2;

	@FindBy(xpath = "//input[@name='billing[city]']") //
	private WebElement city;

	@FindBy(xpath = "//select[ @name='billing[region_id]']") //
	private WebElement state;

	@FindBy(xpath = "//select[@id='billing:country_id']//option[@value='IN']")
	private WebElement country;

	@FindBy(xpath = "//input[ @id='billing:postcode' ]") //
	private WebElement postcode;

	@FindBy(xpath = "//select[@name='billing[country_id]']//option[text()='India']") //
	private WebElement country3;

	@FindBy(xpath = "//input[@id='billing:telephone']") //
	private WebElement telephone;

	@FindBy(xpath = "//input[@name='billing[fax]']") //
	private WebElement fax;

	@FindBy(xpath = "//label[text()='Ship to this address']") //
	private WebElement ShipAddress;

	@FindBy(xpath = "//button[ @onclick='billing.save()']") //
	private WebElement Continue;

	@FindBy(xpath = "//label[contains(text(),'Ship to this address')]")
	private WebElement radiobutton;
	@FindBy(xpath = "//label[@for='s_method_freeshipping_freeshipping']")
	private WebElement radiobutton2;

	@FindBy(xpath = "//span[@id='shipping-method-please-wait']//parent::div//button/span/span[text()='Continue']")
	private WebElement cnt;

	@FindBy(xpath = "//button[@onclick='payment.save()']")
	private WebElement cnt2;

	@FindBy(xpath = "//button[@title='Place Order']")
	private WebElement PlaceOrder;

	@FindBy(xpath = "//h2[text()='Thank you for your purchase!']")
	private WebElement VerifyPlaceOrder;

	public BillingInfo(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void billingInfo(Map<Object, Object> mapData) {

		addrs.click();

		Actions act = new Actions(driver);
		act.moveToElement(company).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("cmpnt").toString()).build().perform();

		act.moveToElement(StreetAddress).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("address").toString()).build().perform();

		act.moveToElement(StreetAddress2).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("street").toString()).build().perform();

		act.moveToElement(city).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("city").toString()).build().perform();

		act.moveToElement(postcode).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("zipcode").toString()).build().perform();
		country3.click();

		act.moveToElement(fax).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys(mapData.get("fax").toString()).build().perform();
		ShipAddress.click();
		Continue.click();

		radiobutton.click();
		radiobutton2.click();
		cnt.click();
		cnt2.click();
		PlaceOrder.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String verifyBilling() {
		String str = this.VerifyPlaceOrder.getText();
		return str;
	}

}
