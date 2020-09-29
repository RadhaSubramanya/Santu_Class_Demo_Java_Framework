package com.testNG;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testNG.Config.ProjectConfig;

public class Base {
	static Logger log = Logger.getLogger(Base.class);
	public static ProjectConfig config = new ProjectConfig();
	public static WebDriver driver ;

	Base(){
		launchBrowser();
	}
	public  void launchBrowser() {
		switch (config.browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", config.browserDriver);
			driver = new ChromeDriver();
			log.info("Chrome Driver Initialization Successful");
			
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", config.browserDriver);
			driver = new FirefoxDriver();
			log.info("Firefox/Gecko Driver Initialization Successful");

			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", config.browserDriver);
			driver = new InternetExplorerDriver();
			log.info("IE Driver Initialization Successful");

			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", config.browserDriver);
			driver = new EdgeDriver();
			log.info("Edge Driver Initialization Successful");

			break;

		}
	}
}
