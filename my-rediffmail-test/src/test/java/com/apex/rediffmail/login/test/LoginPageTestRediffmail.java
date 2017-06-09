package com.apex.rediffmail.login.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.core.dataProvider;
import com.apex.rediffmail.login.page.LoginPageRediffmail;

public class LoginPageTestRediffmail extends RediffBaseTest {

	@Test(priority = 1,dataProvider="testData",dataProviderClass=dataProvider.class)

	public void successfullId(String UserId, String Password) throws InterruptedException {
		LoginPageRediffmail page = new LoginPageRediffmail(driver);
		page.userIdElm.sendKeys(UserId);
		page.passwordElm.sendKeys(Password);
		page.clickSignON();
		Assert.assertEquals("Rediffmail", driver.getTitle());

	}
	
	@Test(priority = 2, dataProvider = "testData1",dataProviderClass=dataProvider.class)
	public void loginWithBlankID(String UserId, String Password) throws InterruptedException {

		LoginPageRediffmail page = new LoginPageRediffmail(driver);
		page.userIdElm.sendKeys(UserId);
		page.passwordElm.sendKeys(Password);
		page.clickSignON();
		page.popUp();
		Assert.assertEquals("Inbox", page.inboxtxt());

	}

	@Test(priority = 3, dataProvider = "testData2",dataProviderClass=dataProvider.class)
	public void loginIwthBlankPassword(String UserId, String Password) throws InterruptedException {
		LoginPageRediffmail page = new LoginPageRediffmail(driver);
		page.userIdElm.sendKeys(UserId);
		page.passwordElm.sendKeys(Password);
		page.clickSignON();
		page.popUp();
		Assert.assertEquals("Inbox", page.inboxtxt());

	}
	
	@Test(priority = 4, dataProvider = "testData3",dataProviderClass=dataProvider.class)
	public void invalidLogin(String UserId, String Password) throws InterruptedException {
		LoginPageRediffmail page = new LoginPageRediffmail(driver);
		page.userIdElm.sendKeys(UserId);
		page.passwordElm.sendKeys(Password);
		page.clickSignON();
		page.clickLogin();
		page.popUp();
		Assert.assertEquals("Wrong username and password combination.", page.wrongUnameTxt());

	}

}
