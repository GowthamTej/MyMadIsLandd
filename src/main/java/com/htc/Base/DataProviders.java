package com.htc.Base;

import org.testng.annotations.DataProvider;

import com.htc.DataReader.TestUtil;

public class DataProviders {
	
	@DataProvider
	public Object[][] validLogin() {
		TestUtil Tu = new TestUtil();

		Object[][] dat1 = Tu.getTestData("Test1");
   
		return dat1;

	}
	@DataProvider
	public Object[][] invalidLogin() {
		TestUtil Tu = new TestUtil();

		Object[][] dat2 = Tu.getTestData("Test2");

		return dat2;

	}

	@DataProvider
	public Object[][] billing() {
		TestUtil Tu = new TestUtil();

		Object[][] dat2 = Tu.getTestData("Tst");

		return dat2;

	}

}
