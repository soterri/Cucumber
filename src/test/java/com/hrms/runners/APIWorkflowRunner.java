package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features = "src\\test\\resources\\features", //specify which feature file to run
	//inout case we say to run all features inside features package
	
	glue = "com/hrms/API/steps/practice",//where we can find implementation code for gherkin steps
	
	dryRun = true,//quickly scans all features, all gherkin steps, all java steps and will let us 
	//know to provide implementation for steps before execution
	//simply checks all steps have implementation code
	//if set to true, no actual execution will happen
	monochrome = true,
	//strict = true,
	//tags = "@regression"
	tags = "@workflow"
	//tags = "@smoke and @regression"
	,plugin= {
			"pretty", //prints gherkin steps in console
			"html:target/cucumber-default-report",//creates basic HTML report in specified location
			"json:target/cucumber.json"
	}
	)
	



















public class APIWorkflowRunner {

	
}
