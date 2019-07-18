package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.ChooseBrowser;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider con;
	public ExcelDataProvider ex;
	
	@BeforeSuite
	public void setupSuite() throws IOException{
		con=new ConfigDataProvider();
		ex=new ExcelDataProvider();
	}
	
	@BeforeClass
	public void startApp(){
		driver=ChooseBrowser.startApp(driver, con.getBrowser(),con.getUrl());
	}
	
	@AfterClass
	public void tearDown(){
		ChooseBrowser.quitBrowser(driver);
	}
}
