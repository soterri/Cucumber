package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features = "@target/failed.txt", //specify which feature file to run
	//inout case we say to run all features inside features package
	
	glue = "com/hrms/steps",//where we can find implementation code for gherkin steps
	
	dryRun = true,//quickly scans all features, all gherkin steps, all java steps and will let us 
	//know to provide implementation for steps before execution
	//simply checks all steps have implementation code
	//if set to true, no actual execution will happen
	
	monochrome = true,
	
	
	plugin= {
			"pretty", //prints gherkin steps in console
			"html:target/cucumber-default-report" //creates basic HTML report in specified location
	}
	
	
	
	
)
public class FailedRunner {

}
