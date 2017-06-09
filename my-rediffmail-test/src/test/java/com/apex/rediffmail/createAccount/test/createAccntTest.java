package com.apex.rediffmail.createAccount.test;

import org.testng.annotations.Test;

import com.apex.rediffmail.core.RediffBaseTest;
import com.apex.rediffmail.createAccount.page.CreateAccontPage;

public class createAccntTest extends RediffBaseTest {
	
	
	@Test
	public void createAccont(){
		
		CreateAccontPage create = new CreateAccontPage(driver);
		
		create.createAcconttxt();
		create.fillForm("Mike mac", "mike20mac", "Jesus@12345", "Jesus@12345", "mayank20macwan@gmail.com", "5106745969");
		
		
	}

}
