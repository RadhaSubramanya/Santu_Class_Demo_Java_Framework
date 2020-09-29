package com.testNG.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ProjectConfig {

	static Logger log = Logger.getLogger(ProjectConfig.class);
	private Properties projectConfigProp = new Properties();

	public String browser;
	public String browserDriver;
	public int implicitTimeout;
	public String appUrl;
	public String loginUserID;
	public String loginPassword;
	public Locale locale;
	public String localeLanguage;
	public String localeCountry;


	public ProjectConfig() {
		loadConfig();
		setValues();
	}

	private void loadConfig() {
		try {
			projectConfigProp.load(new FileInputStream("projectConfig.properties"));
			log.info("Loading Project Configuration - Successful");
		} catch (FileNotFoundException e) {
			log.error("Error loading project config File : " + e);
			e.printStackTrace();
		} catch (IOException e) {
			log.error("Error Reading the project config File : " + e);
			e.printStackTrace();
		}
	}
	
	private void setValues() {
		browser = projectConfigProp.getProperty("browser");
		log.info("Selected Browser : "+browser);
		
		implicitTimeout = Integer.parseInt(projectConfigProp.getProperty("implicitwait"));
		log.info("Implicit Wait Delay : "+implicitTimeout);
		
		browserDriver = System.getProperty("user.dir")+projectConfigProp.getProperty(browser+"."+"driver");
		log.info(browser + " Driver Location : "+browserDriver);
		
		appUrl = projectConfigProp.getProperty("appUrl");
		log.info("Application URL : "+appUrl);
		
		loginUserID = projectConfigProp.getProperty("loginUserID");
		log.info("Application Login User ID : "+loginUserID);
		
		loginPassword = projectConfigProp.getProperty("loginPassword");
		log.info("Application Login User ID : "+loginPassword);
		
		localeLanguage = projectConfigProp.getProperty("localeLanguage");
		localeCountry = projectConfigProp.getProperty("localeCountry");
		log.info("Application Language Locale = "+localeLanguage +" "+localeCountry);
		locale =new Locale(localeLanguage, localeCountry);
	}
}