package com.automation.utilities;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseBrowser {
	
	static WebDriver driver;
	
	public static WebDriver startApp(WebDriver driver,String bName,String url){
		
		if(bName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(bName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", "./Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else{
			System.out.println("This browser is not currently supported");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver){
		driver.quit();
	}

}
