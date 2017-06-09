package com.apex.rediffmail.forgotPAssword.page;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.forgotPAssword.constant.LoginConstantForgotPAss;

public class LoginPageForgotPass extends RediffBaseTest {

	protected WebDriver driver = null;
	private static Scanner dataIn = new Scanner(System.in);

	@FindBy(linkText = LoginConstantForgotPAss.FORGOTPASS)
	public WebElement forgotPassElm;
	@FindBy(name = LoginConstantForgotPAss.NEXT_FORGOTPASS)
	public WebElement nextForgorPassElm;
	@FindBy(id = LoginConstantForgotPAss.EMAIL_FORGORPASS)
	public WebElement emailForgotPassElm;
	@FindBy(xpath = LoginConstantForgotPAss.NEXT_FORGOTPASS2)
	public WebElement nextForgorPassElm2;
	@FindBy(id = LoginConstantForgotPAss.MOB_RADIOBUTTON_FORGOTPASS)
	public WebElement mobRadioButtonElm;
	@FindBy(id = LoginConstantForgotPAss.MOB_NO)
	public WebElement mobNoElm;
	@FindBy(linkText = LoginConstantForgotPAss.CAPTCHA_STRING)
	public WebElement captchaLinkElm;
	@FindBy(name = LoginConstantForgotPAss.CAPTCH_TAB)
	public WebElement captchaTabElm;
	@FindBy(id = LoginConstantForgotPAss.CAPTCHA)
	public WebElement captchaElm;
	@FindBy(xpath = LoginConstantForgotPAss.NEXT_CAPTCHA)
	public WebElement nextCaptchBtnElm;
	@FindBy(id = LoginConstantForgotPAss.MOB_CODE)
	public WebElement mobCodeElm;
	@FindBy(xpath = LoginConstantForgotPAss.VERIFICATION)
	public WebElement verificationElm;
	@FindBy(name=LoginConstantForgotPAss.PROCEED)
	public WebElement proceedBtnElm;

	public LoginPageForgotPass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void popUp() throws InterruptedException {

		Alert popUp = driver.switchTo().alert();
		System.out.println("Alert Msg CLicked:--" + popUp.getText());
		popUp.accept();
		Thread.sleep(2000);
	}

	public void clickForgotPass() throws InterruptedException {

		forgotPassElm.click(); // locator for forgotEmailLink
		Thread.sleep(2000);

	}

	public void clickNextWithoutPopup() throws InterruptedException {
		nextForgorPassElm.click(); // click without entering ID
	}

	public void clickNextWithPopup() throws InterruptedException {
		clickNextWithoutPopup(); // click without entering ID
		popUp();

	}

	public void clickNextWithoutRadio() throws InterruptedException {
		nextForgorPassElm2.click();
		popUp();
		Thread.sleep(2000);
	}

	public void clickNextWithRadio() throws InterruptedException {
		mobRadioButtonElm.click();
		nextForgorPassElm2.click();
		Thread.sleep(4000);
	}

	public void multiTab() {

		String oldTab = driver.getWindowHandle();
		captchaLinkElm.click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		captchaTabElm.click();
		driver.switchTo().window(oldTab);
	}

	public void captcha() throws InterruptedException {
		System.out.println("Enter captcha");
		String captcha = dataIn.nextLine();
		captchaElm.sendKeys(captcha);
		nextCaptchBtnElm.click();
		Thread.sleep(2000);
	}

	public void verification() {
		// TODO Auto-generated method stub
		System.out.println("Enter Mobile Verification code:");
		String code = dataIn.nextLine();
		mobCodeElm.sendKeys(code);

	}
	
	public  void clickONProcees() throws InterruptedException{
		
		proceedBtnElm.click();
		Thread.sleep(3000);
		
	}

	public void verificationSuccess() {

		verificationElm.getText();

	}

}
