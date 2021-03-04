package com.htc.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.htc.page.BillingInfo;
import com.htc.Base.Utility;



public class VipPage {

	private WebDriver driver = null;
	private Utility util = null;

	@FindBy(xpath = "//a[text()='VIP']")
	private WebElement vipLink;

	@FindBy(xpath = "//img[ @id='product-collection-image-427']")
	private WebElement clickOnProduct;

	@FindBy(xpath = "//img[@alt='Blue']")
	private WebElement clickOnColour;

	@FindBy(xpath = "//span[@class='swatch-label' and contains(text(),'27')]")
	private WebElement clickOnSize;

	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement clickOnQty;

	@FindBy(xpath = "//button[ @onclick='productAddToCartForm.submit(this)' ]//child::span[text()='Add to Cart']")
	private WebElement clickOnCard;

	@FindBy(xpath = "//ul[@class='checkout-types top']/li/button")
	private WebElement proceedToCheckOut;

	public VipPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		util = new Utility();
	}

	public BillingInfo Vip() {
		vipLink.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,500)");

		clickOnProduct.click();

		clickOnColour.click();
		clickOnSize.click();
		Actions act = new Actions(driver);
		jse.executeScript("window.scrollBy(0,400)");

		act.moveToElement(clickOnQty).click().keyDown(Keys.CONTROL).sendKeys("a").sendKeys("x").keyUp(Keys.CONTROL)
				.sendKeys("1").perform();

		clickOnCard.click();
		proceedToCheckOut.click();

		return new BillingInfo(driver);
	}

}
