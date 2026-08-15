package com.hrms.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonnMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	    @Before
	    public void start() {
	        BaseClass.setUp();
	    }

	    @After
	    public void end(Scenario scenario) {

	        if (BaseClass.driver != null) {

	            byte[] screenshot =
	                    ((TakesScreenshot) BaseClass.driver)
	                            .getScreenshotAs(OutputType.BYTES);

	            scenario.attach(screenshot, "image/png", scenario.getName());

	            BaseClass.driver.quit();
	            BaseClass.driver = null;
	        }
	        BaseClass.tearDown();
	    }
	}


//	@Before
//	public void start() {
//		BaseClass.setUp();
//	}
//
//	@After
//	public void end(Scenario scenario) {
//		BaseClass.tearDown();
//
//		byte[] pic;
//		if (scenario.isFailed()) {
//			pic = CommonnMethods.takeScreenshot("failed/" + scenario.getName());
//		} else {
//			pic = CommonnMethods.takeScreenshot("passed/" + scenario.getName());
//
//		}
//		
//		scenario.attach(pic, "image/png", scenario.getName());
//		
//		BaseClass.tearDown();
//	}
//
//}
