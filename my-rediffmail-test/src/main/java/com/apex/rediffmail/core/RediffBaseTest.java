package com.apex.rediffmail.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class RediffBaseTest {
	
	protected WebDriver driver = null;
	@BeforeMethod
	@Parameters("browser")
	
	
	public void browserStartup(String browserName) throws InterruptedException{
		
		if(browserName.equalsIgnoreCase("firefox")){
			
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("opera")){
			
			System.setProperty("webdriver.opera.driver", "C:\\driver\\operadriver.exe");
			driver = new OperaDriver();
			
		}
		
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
		
	
	}
	

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

}
