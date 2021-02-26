package com.htc.prop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
	
	
	public Properties getProp() {
		Properties	prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Gowtham Teja\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Eclipse\\MyMadIsLandd\\src\\main\\java\\com\\htc\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

}
