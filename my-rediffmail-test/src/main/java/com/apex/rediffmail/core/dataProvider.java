package com.apex.rediffmail.core;

import org.testng.annotations.DataProvider;

public class dataProvider {
	
	@DataProvider(name = "testData")
	public static Object[][] successFullID() {
		String[][] idFromSheet = XLSUtilRediffMail.getTableArray("rediffIds.xls", "Sheet1", "RediffIds");
		return idFromSheet;
	}


	@DataProvider(name = "testData1")
	public static Object[][] blankID() {
		String[][] idFromSheet = XLSUtilRediffMail.getTableArray("rediffIds_blank_id.xls", "Sheet1", "RediffIds");
		return idFromSheet;
	}
	
	@DataProvider(name = "testData2")
	public static Object[][] blankPassword() {
		String[][] idFromSheet = XLSUtilRediffMail.getTableArray("rediffIds_blank_password.xls", "Sheet1", "RediffIds");
		return idFromSheet;

	}
	
	
	@DataProvider(name = "testData3")
	public static Object[][] invalid() {
		String[][] idFromSheet = XLSUtilRediffMail.getTableArray("rediffIds_invalid.xls", "Sheet1", "RediffIds");
		return idFromSheet;

	}
	
	@DataProvider(name = "testData4")
	public static Object[][] forgotPass() {
		String[][] idFromSheet = XLSUtilRediffMail.getTableArray("rediffIds_forgot_pass.xls", "Sheet1", "RediffIds");
		return idFromSheet;
	}
}

