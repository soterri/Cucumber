package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class WorkflowAllSteps {

	String baseURI = RestAssured.baseURI = "syntax hrms that I dont have access to";
	RequestSpecification request;

	@Given("a request is prepared to create an employee")
	public void a_request_is_prepared_to_create_an_employee() {
		request = given().header("Content-Type", "application/json").header("Authorization", TokenGeneratedSteps.token)
				.body("Syntax payload I do not have access to");

	}

	@When("a POST call is made to create an employee")
	public void a_post_call_is_made_to_create_an_employee() {

	}

	@Then("the status code for creating an employee is {int}")
	public void the_status_code_for_creating_an_employee_is(Integer int1) {

	}

	@Then("the employee is created")
	public void the_employee_is_created() {

	}

	@Then("the employee ID is stored as a global variable to be used for other calls")
	public void the_employee_id_is_stored_as_a_global_variable_to_be_used_for_other_calls() {

	}

}
