package com.htc.base;

import com.htc.dataReader.ExcelFileManager;

  public class DataProvider {
	  
	@org.testng.annotations.DataProvider(name ="data")
	
	private Object[][] dataProvider() {
		      
			 ExcelFileManager Tu = new ExcelFileManager();
			 
				Object[][] dat1 = Tu.getTestData("TestData");
				
				return dat1;	
	   }
	
}
