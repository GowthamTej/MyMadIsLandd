package com.htc.page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;

	// Page Factory or Object Repository

	@FindBy(xpath = "//a//span[text()='Account']")
	private WebElement account;

	@FindBy(xpath = "//a[text()='Log In']")
	private WebElement loginOption;

	@FindBy(xpath = "//input[ @title='Email Address' ]")
	private WebElement email;

	@FindBy(xpath = "//input[ @name='login[password]']")
	private WebElement password;

	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;

	@FindBy(xpath = "//p[contains(text(),'Welcome')]")
	private WebElement verifyValidlogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ClickAccount() {
		account.click();
	}

	public void ClickLoginOption() {
		loginOption.click();
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {

		this.password.sendKeys(password);
	}

	public void ClickOnLogin() {
		this.login.click();
	}

	public HomePage LOGIN_TO_HOME(String email, String password) {
		try {

			account.click();
			loginOption.click();
			this.email.sendKeys(email);
			this.password.sendKeys(password);
			this.login.click();

		} catch (NoSuchElementException ee) {
			ee.printStackTrace();
			ee.getMessage();

		} catch (Exception ee) {

			ee.printStackTrace();
			ee.getMessage();

		}

		return new HomePage(driver);
	}

}
