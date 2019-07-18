package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties p;
	public ConfigDataProvider() throws IOException{
		File src=new File("./Config/config.properties");
		FileInputStream fs=new FileInputStream(src);
		p=new Properties();
		p.load(fs);
		
	}
	
	public String getBrowser(){
		return p.getProperty("browser");
	}
	
	public String getUrl(){
		return p.getProperty("url");
	}
}
