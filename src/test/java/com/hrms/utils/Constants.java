package com.hrms.utils;

public class Constants {

	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")
			+ "\\src\test\resources\\configs\\configurations.properties";

//	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
//
//	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
	//bc I have WebDriverManager.chromedriver.setUp();


	public static final int IMPLICIT_WAIT_TIME = 10;
	
	public static final int EXPLICIT_WAIT_TIME=20;
	
	public static final String TESTDATA_FILEPATH=System.getProperty("user.dir")+"/src/test/resources/testdata/Book1.xlsx";

	public static final String REPORT_FILEPATH=System.getProperty("user.dir")+"/target/html-report/HRMS.html";
 
	public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"/screenshot/";
}
//changing the path to hrms framework src/test/resources