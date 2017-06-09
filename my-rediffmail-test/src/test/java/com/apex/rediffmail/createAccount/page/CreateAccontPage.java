package com.apex.rediffmail.createAccount.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.createAccount.constant.CreateAccntConstant;

public class CreateAccontPage extends RediffBaseTest  {
	
	protected WebDriver driver = null;
	
	@FindBy (linkText=CreateAccntConstant.CREATEACCNT)
	WebElement createAccntElmtxt;
	@FindBy (xpath=CreateAccntConstant.FULL_NAME)
	WebElement fullNameElm;
	@FindBy (xpath=CreateAccntConstant.CHOOSE_ID)
	WebElement chooseIdElm;
	@FindBy(xpath=CreateAccntConstant.RADIO_AVAILABILITY)
	List<WebElement> radioAvailableElm;
	@FindBy(xpath=CreateAccntConstant.CHECK_AVAILABILITY)
	WebElement checkAvailabilityElm;
	@FindBy (xpath=CreateAccntConstant.PASSWORD)
	WebElement passwordElm;
	@FindBy(xpath=CreateAccntConstant.RETYPE_PASSWORD)
	WebElement retypePasswordElm;
	@FindBy(xpath=CreateAccntConstant.ALTERNATE_EMAIL)
	WebElement alternateEmailElm;
	@FindBy(id=CreateAccntConstant.MOB_NO)
	WebElement mobNoElm;
	
	
	
	public CreateAccontPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void createAcconttxt(){
		
		createAccntElmtxt.click();
		
		
	}
	
	public void fillForm(String fName,String id,String password,String retypePassword,String alternateEmail,String mobNo){
		
		fullNameElm.sendKeys(fName);
		chooseIdElm.sendKeys(id);
		checkAvailabilityElm.click();
		chooseIdRadioButton();
		passwordElm.sendKeys(password);
		retypePasswordElm.sendKeys(retypePassword);
		alternateEmailElm.sendKeys(alternateEmail);
		mobNoElm.sendKeys(mobNo);
		maleFemale();
		
	}
	
	public void chooseIdRadioButton(){
		
		// get all the radio buttons by similar id or xpath and store in List    
		List<WebElement> radioBx= radioAvailableElm;
		// This will tell you the number of radio button are present
		int iSize = radioBx.size();
		//iterate each link and click on it
		for (int i = 0; i < iSize ; i++){
		// Store the Check Box name to the string variable, using 'Value' attribute
		String sValue = radioBx.get(i).getAttribute("value");
		// Select the Check Box it the value of the Check Box is same what you are looking for
		    if (sValue.equalsIgnoreCase("Checkbox expected Text")){
		     radioBx.get(i).click();
		     // This will take the execution out of for loop
		        break;
		    }
		   }

	}

	public void maleFemale(){
		
		WebElement radio_male = driver.findElement(By.xpath("//input[@value='M']"));
		radio_male.click();
	}
}
