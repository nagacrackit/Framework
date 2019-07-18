package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(how=How.CSS,using="input#user_login")
	WebElement uname;
	
	@FindBy(how=How.CSS,using="input[id*='pass']")
	WebElement upass;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	WebElement login;
	
	
	public void loginToWord(String username,String password){
		uname.sendKeys(username);
		upass.sendKeys(password);
		login.click();
	}

}
