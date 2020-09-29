package com.testNG.PageObjects;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.testNG.Config.ProjectConfig;



public class PagesConfig {
	static Logger log = Logger.getLogger(PagesConfig.class);
	private  ResourceBundle rb;
	ProjectConfig config = new ProjectConfig();
	
	public Locale getLocale() {
		return config.locale;
	}
	
	
	public ResourceBundle readingResourceBundle(String pageObjectPagePropertyFileName) {
		try{
			 rb = ResourceBundle.getBundle("PageProperties/"+pageObjectPagePropertyFileName, getLocale());
		}catch(MissingResourceException e) {
			log.error("Resouce Bundle Property File not found");
		}
		return rb;
	}
	
	public WebElement findTextBox(WebDriver driver,String textBoxLabel) {
		return driver.findElement(By.xpath("//td[contains(text(),'"+textBoxLabel+"')]/following-sibling::td[@class='fieldValue'][1]/input"));
	}
	
}
