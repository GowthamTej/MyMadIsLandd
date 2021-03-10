package com.htc.base;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.htc.prop.Property;

public class SeleniumUtility {
	
	

	public void setExplicitWait(WebDriver wd, int tm, WebElement we, String value) throws InterruptedException {
		WebElement wdw = new WebDriverWait(wd,tm).until(ExpectedConditions.visibilityOf(we));
		we.sendKeys(value);
	}

	public static void ScreenShot(WebDriver driver, String fileName,String path) {
		
		Property pro = new Property();
		Properties prop = pro.getProp();
		
			TakesScreenshot tss = (TakesScreenshot) driver;
			File fl = tss.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(fl, new File( prop.getProperty(path)+ fileName + ".png"));

			} catch (IOException e) {

				e.printStackTrace();
			}

		
	}


}
