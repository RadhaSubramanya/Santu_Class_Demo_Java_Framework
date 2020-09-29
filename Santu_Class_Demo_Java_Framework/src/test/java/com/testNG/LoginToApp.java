package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testNG.Config.ProjectConfig;
import com.testNG.PageObjects.LoginPage;

public class LoginToApp extends Base {
	public LoginToApp() {
		super();
	}

	public static void main(String[] args) {
		LoginToApp lta = new LoginToApp();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(config.implicitTimeout, TimeUnit.SECONDS);
		driver.get(config.appUrl);
		LoginPage lp = new LoginPage();
		lp.userName_txtbox(driver).sendKeys(config.loginUserID);
		lp.password_txtbox(driver).sendKeys(config.loginPassword);
		lp.submit_button(driver).click();

	}

}
