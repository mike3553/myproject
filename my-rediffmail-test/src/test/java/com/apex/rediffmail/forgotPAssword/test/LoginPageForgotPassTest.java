package com.apex.rediffmail.forgotPAssword.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.core.dataProvider;
import com.apex.rediffmail.forgotPAssword.page.LoginPageForgotPass;


public class LoginPageForgotPassTest extends RediffBaseTest {
	
	//hey lol wssup
	@Test(dataProvider = "testData4",dataProviderClass=dataProvider.class)
	public void forgotPassTest(String UserID, String Phone) throws InterruptedException {

		LoginPageForgotPass page = new LoginPageForgotPass(driver);
		page.clickForgotPass();
		page.clickNextWithPopup();
		page.emailForgotPassElm.sendKeys(UserID);
		page.clickNextWithoutPopup();
		page.clickNextWithoutRadio();
		page.clickNextWithRadio();
		page.mobNoElm.sendKeys(Phone);
		page.multiTab();
		page.captcha();
		page.verification();
		page.clickONProcees();
		
		Assert.assertTrue(true);
		
	}
	

}
