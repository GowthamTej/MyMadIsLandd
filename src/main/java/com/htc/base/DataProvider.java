package com.htc.base;

import java.lang.reflect.Method;

import com.htc.dataReader.ExcelFileManager;

public class DataProvider {

	@org.testng.annotations.DataProvider(name = "data")

	private Object[][] dataProvider(Method result) {
		ExcelFileManager excelFile = null;
		Object[][] data = null;
		if (result.getName().equals("vipBillingTest")) {

			excelFile = new ExcelFileManager();
			data = excelFile.getTestData("BillingData");

		} else {
			excelFile = new ExcelFileManager();
			data = excelFile.getTestData("LoginData");
		}
		return data;
	}

}
