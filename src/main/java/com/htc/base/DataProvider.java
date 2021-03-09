package com.htc.base;

import java.lang.reflect.Method;

import com.htc.dataReader.ExcelFileManager;

public class DataProvider {

	@org.testng.annotations.DataProvider(name = "Login_data")

	public Object[][] Login(Method m) {
		ExcelFileManager Tu = new ExcelFileManager();
		if (m.getName().equals("TestInvalidLogin")) {
			Object[][] dat2 = Tu.getTestData("Test1");

			return dat2;
		} else {
			Object[][] dat1 = Tu.getTestData("Test1");
			return dat1;

		}
	}

	@org.testng.annotations.DataProvider
	public Object[][] billing() {
		ExcelFileManager Tu = new ExcelFileManager();

		Object[][] dat2 = Tu.getTestData("Tst");

		return dat2;

	}

}
