package com.htc.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

public class SeleniumUtility {

	public void setExplicitWait(WebDriver wd, int tm, WebElement we, String value) throws InterruptedException {
		WebElement wdw = new WebDriverWait(wd, tm).until(ExpectedConditions.visibilityOf(we));
		we.sendKeys(value);
	}

	public static void FailTestScreenShot(WebDriver driver, ITestResult result, String path) {
		if (ITestResult.FAILURE == result.getStatus()) {

			TakesScreenshot tss = (TakesScreenshot) driver;
			File fl = tss.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(fl, new File(path + result.getName() + ".png"));

			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}

}
