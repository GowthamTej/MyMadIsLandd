package com.htc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	private WebDriver driver=null;
	
	@FindBy(xpath = "//a//span[text()='Account']")
	private WebElement account;
	
	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement logout;
	
	public LogOutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnLogOut() {
		this.account.click();
		
		this.logout.click();
		System.out.println("//logout");
		
	}
}
