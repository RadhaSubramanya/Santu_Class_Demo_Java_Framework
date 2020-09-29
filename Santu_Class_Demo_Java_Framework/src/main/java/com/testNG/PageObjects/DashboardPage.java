package com.testNG.PageObjects;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends PagesConfig{
	private static WebElement element = null;
	public  ResourceBundle pages = ResourceBundle.getBundle("PageProperties/loginPage", getLocale() );

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
}
