package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
	features = "src\\test\\resources\\features", //specify which feature file to run
	//inout case we say to run all features inside features package
	glue = "com/hrms/steps",//where we can find implementation code for gherkin steps
	dryRun = true//quickly scans all features, all gherkin steps, all java steps and will let us 
	//know to provide implementation for steps before execution
	//simply checks all steps have implementation code
	//if set to true, no actual execution will happen
	
)


public class TestRunner {
//will specify configurations, since tryna run cucumber, we need specific configs
/*
 * how to execute multiple features in cucumber?
 * we will need to have runner class to specify cucumberoptions
 * which are configs that are needed to run cucumber tests
 * specifying which features to run and glue for implementation steps
 * before actual execution, use dryRun to scan all features, gherkin steps, java steps
 */
}
