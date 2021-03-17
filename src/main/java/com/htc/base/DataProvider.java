package com.htc.base;

import java.lang.reflect.Method;



import com.htc.dataReader.ExcelFileManager;

  public class DataProvider {
	  
	@org.testng.annotations.DataProvider(name ="data")
	
	private Object[][] dataProvider(Method result) {
		
		if(result.getName().equals("vipBillingTest")) {
			
			 ExcelFileManager Tu = new ExcelFileManager();
			 
				Object[][] dat1 = Tu.getTestData("BillingTest");
				
				return dat1;
		   }
		else {
			
			 ExcelFileManager Tu = new ExcelFileManager();
			 
				Object[][] dat2 = Tu.getTestData("Sheet3");
				
				return dat2;
		   }		
	   }
	
	
	
}
