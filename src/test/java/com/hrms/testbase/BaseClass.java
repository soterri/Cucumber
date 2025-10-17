package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver setUp() {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);


		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			//system.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;

		default:
			throw new RuntimeException("Browser is not supported:");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));

		return driver;
		
	
	}

	public static void tearDown() {
	if (driver != null) {
			driver.quit();

		}
	}
}
	


//	public static WebDriver setUp() {
//
//		// Debug path
//		System.out.println("CONFIG FILE PATH: " + Constants.CONFIGURATION_FILEPATH);
//		File f = new File(Constants.CONFIGURATION_FILEPATH);
//		System.out.println("Does file exist? " + f.exists());
//
//		// Load properties
//		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
//
//		// Read browser from config and trim spaces
//		String browser = ConfigsReader.getProperty("browser").trim().toLowerCase();
//
//		switch (browser) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
//			driver = new ChromeDriver();
//			break;
//		case "firefox":
//			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
//			driver = new FirefoxDriver();
//			break;
//		default:
//			throw new RuntimeException("Browser is not supported: " + browser);
//		}
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
//		driver.get(ConfigsReader.getProperty("url").trim());
//		return driver;
//	}
//
//	public static void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
//}

//public class BaseClass {
//	public static WebDriver driver;
//
//	public static WebDriver setUp() {
//
//		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
//
//		switch (ConfigsReader.getProperty("browser").toLowerCase()) {
//
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
//			driver = new ChromeDriver();
//			break;
//		case "firefox":
//			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
//			driver = new FirefoxDriver();
//			break;
//		default:
//			throw new RuntimeException("Browser is not supported");
//		}
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
//		driver.get(ConfigsReader.getProperty("url"));
//		return driver;
//	}
//
//	public static void tearDown() {
//		if (driver != null) {
//			driver.quit();
//
//		}
//	}
//
//}
