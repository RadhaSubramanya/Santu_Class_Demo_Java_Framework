package com.testNG.PageObjects;


import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends PagesConfig{
	static Logger log = Logger.getLogger(LoginPage.class);

	private static WebElement element = null;
	
	ResourceBundle pages;
	public LoginPage() {
		pages = readingResourceBundle("loginPage");
	}
	
	public WebElement userName_txtbox(WebDriver driver) {
		element = driver.findElement(By.id(pages.getString("username_TextBox")));
		
		return element;
	}
	
	public  WebElement password_txtbox(WebDriver driver) {
		element = driver.findElement(By.id(pages.getString("password_TextBox")));
		return element;
	}
	
	public  WebElement submit_button(WebDriver driver) {
		element = driver.findElement(By.xpath(pages.getString("signin_Button")));
		return element;			
	}
	
	public WebElement productTextBox(WebDriver driver) {
		return findTextBox(driver, pages.getString("ProductTextbox"));
	}
}
