package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) //running with Cucumber class using jUnit


@CucumberOptions(
		features = "src/test/resources/features/LoginFeaturesScenarios.feature",
		
		//name of the package where step definitions are
		glue = "com.hrms.steps",
		
		//dryRun = stops actual execution when set to true and scans all steps
		//also provides missing step definitions
		//to start execution, set dryRun to false
		dryRun = true,
		//tags = "@sprint1 or @sprint2"
		tags = "@example"

		
		)





public class TestFeatScenarioRunner {
	
	

}
