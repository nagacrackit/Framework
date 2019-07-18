package com.automation.tests;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;


public class VerifyLogin extends BaseClass {
	
	
	
	
	@Test
	public void loginApp(){
		
		LoginPage log=PageFactory.initElements(driver, LoginPage.class);
		log.loginToWord(ex.getStringData("login", 0, 0),ex.getStringData("login", 0, 1));
		
	}
	
	
	
	

}
