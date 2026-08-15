package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//test runner is the class that tells your test framework how to run your feature files
//and step definitions connecting ff, step def files, reporting, tags, plugins

@RunWith(Cucumber.class)

@CucumberOptions(

    features = "src/test/resources/features",
    glue = "com.hrms.steps",

    dryRun = true,
    monochrome = true,

    tags = "@temp",

    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber.json",
        "rerun:target/failed.txt"
    }

)

public class TestRunner {

}


//@RunWith(Cucumber.class) //tells Junit to run the test using cucumber
//@CucumberOptions (
//	//when running all tests - regression testing -> src/test/resources/features
//	features = "src\\test\\resources\\features\\", //specify which feature file to run
//	//inout case we say to run all features inside features package
//	
//	glue = "com\\hrms\\steps",//where we can find implementation code for gherkin steps
//	
//	dryRun = true,//quickly scans all features, all gherkin steps, all java steps and will let us 
//	//know to provide implementation for steps before execution
//	//simply checks all steps have implementation code
//	//if set to true, no actual execution will happen
//	monochrome = true
//	//strict = true,
//	//tags = "@regression"
//	,tags = "@temp"
//	//tags = "@smoke and @regression"
//	//,plugin= {
//			//"pretty", //prints gherkin steps in console
//			//"html:target/cucumber-default-report", //creates basic HTML report in specified location
//			//"json:target/cucumber.json",
//			//"rerun:target/failed.txt"
//			
//	//}
//	
//	
//	
//	
//)


//public class TestRunner {
//will specify configurations, since tryna run cucumber, we need specific configs
/*
 * how to execute multiple features in cucumber?
 * we will need to have runner class to specify cucumberoptions
 * which are configs that are needed to run cucumber tests
 * specifying which features to run and glue for implementation steps
 * before actual execution, use dryRun to scan all features, gherkin steps, java steps
 *
 *Runner test will help us to execute our cucumber features to run
 *cucumber features using cucumber option we are specifying some configs 
 *there are diff cucumber options we have we 100 need features specifying path to feature file we want to run
 *then using glue we specifying  the name of our package and go inside package and all the implementation steps you will find 
 *dry run - quickly check if steps have implementation specify dry run to true
 *
 */
	

