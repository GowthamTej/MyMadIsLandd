package com.htc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.htc.utility.JSUtility;


public class HomePage {

	private WebDriver driver = null;
	private JSUtility util = null;
	
	@FindBy(xpath = "//a[text()='VIP']")
	private WebElement vip;
	@FindBy(xpath = "//a[text()='Sale']")
	private WebElement sale;
	@FindBy(xpath = "//li[@class='level0 nav-1 first parent']//a[text()='Women']")
	private WebElement women;
	@FindBy(xpath = "//li[contains(@class,'level0 nav-2 parent')]//a[text()='Men']")
	private WebElement men;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		util = new JSUtility();

	}

	public VipPage clickOnVip() {
		util.flash(vip, driver);
		vip.click();

		return new VipPage(driver);

	}

	public void clickOnSale() {
		util.flash(sale, driver);
		util.drawBorder(driver, sale);
		sale.click();

	}

	public void clickOnWomen() {
		util.flash(women, driver);
		women.click();

	}

	public void clickOnMen() {
		util.flash(men, driver);
		men.click();

	}

	public void clickOnSideBar() {
		clickOnVip();
		clickOnSale();
		clickOnWomen();
		clickOnMen();

	}

}
