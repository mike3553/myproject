package com.apex.rediffmail.login.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.login.constant.LoginConstantRediffmail;

public class LoginPageRediffmail extends RediffBaseTest  {
	
	protected WebDriver driver=null;
	
	@FindBy(id=LoginConstantRediffmail.USERNAME)
	public WebElement userIdElm;
	@FindBy(id=LoginConstantRediffmail.PASSWORD_FIELD)
	public WebElement passwordElm;
	@FindBy(name=LoginConstantRediffmail.SUBMIT)
	WebElement submitElm;
	@FindBy(xpath=LoginConstantRediffmail.INBOX)
	WebElement inboxElm;
	@FindBy(linkText=LoginConstantRediffmail.FORGOTPASS)
	WebElement forgotPassElm;
	@FindBy(name=LoginConstantRediffmail.NEXT_FORGOTPASS)
	WebElement nextForgorPassElm;
	@FindBy(id=LoginConstantRediffmail.EMAIL_FORGORPASS)
	WebElement emailForgotPassElm;
	@FindBy(xpath=LoginConstantRediffmail.NEXT_FORGOTPASS2)
	WebElement nextForgorPassElm2;
	@FindBy(id=LoginConstantRediffmail.MOB_RADIOBUTTON_FORGOTPASS)
	WebElement mobRadioButtonElm;
	@FindBy(id=LoginConstantRediffmail.MOB_NO)
	WebElement mobNoElm;
	@FindBy(linkText=LoginConstantRediffmail.CAPTCHA_STRING)
	WebElement captchaLinkElm;
	@FindBy(name=LoginConstantRediffmail.CAPTCH_TAB)
	WebElement captchaTabElm;
	@FindBy(id=LoginConstantRediffmail.CAPTCHA)
	WebElement captchaElm;
	@FindBy (xpath= LoginConstantRediffmail.NEXT_CAPTCHA)
	WebElement nextCaptchBtnElm;
	@FindBy(id=LoginConstantRediffmail.MOB_CODE)
	WebElement mobCodeElm;
	@FindBy(xpath=LoginConstantRediffmail.WRONGUNAME)
	WebElement wrongUnameTxtElm;
	@FindBy(name=LoginConstantRediffmail.LOGIN1)
	WebElement loginWrongElm;
	
	
	public LoginPageRediffmail(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
	
}

	
	public void clickSignON() throws InterruptedException {
		// TODO Auto-generated method stub
		
		submitElm.click();
		Thread.sleep(4000);
		
	}
	
	public void popUp() throws InterruptedException{
		
		Alert popUp = driver.switchTo().alert();
		System.out.println("Alert Msg CLicked:--" + popUp.getText());
		popUp.accept();
		Thread.sleep(2000);
	}
	
	public String wrongUnameTxt(){
		
		return wrongUnameTxtElm.getText();
		
		
	}
	
	public String inboxtxt(){
		
		return inboxElm.getText();
	}
	
	public void clickLogin(){
		
		loginWrongElm.click();
	}
	
	


	

}
