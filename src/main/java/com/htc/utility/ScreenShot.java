package com.htc.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.htc.prop.Property;

public class ScreenShot {

	
	public static String screenShot(WebDriver driver, String fileName, String path) {

		Property pro = new Property();
		Properties prop = pro.getProp();
        String scrPath=prop.getProperty(path) + fileName + "  " + timeStamp() +".jpg";
		TakesScreenshot tss = (TakesScreenshot) driver;
		
		File fl = tss.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(fl, new File(scrPath));

		} catch (IOException e) {

			e.printStackTrace();
		}
		return scrPath; 

	}
	public static String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());

	}

}
