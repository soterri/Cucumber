package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HardcodedExamples {

	/**
	 * Rest Assured has methods
	 *  given - preconditions/preparing requests
	 *  when -making call to the end point 
	 *  then - validating, verifying, asserting
	 */
	
	static String baseURI =RestAssured.baseURI = "http://syntaxHRMSwebsitethatIdonothaveaccessto";
	String token = "create a token on postman Bearer:kgfkhjkhjgfhkjgkhj";
	
	public void SampleTestNotes() {


		/*
		 * Base URI for all calls
		 */

		RestAssured.baseURI = "http://syntaxHRMSwebsitethatIdonothaveaccessto";

		/*
		 * Json Web Token (JWT) required for all calls - expires every 12 hours
		 */
		String token = "create a token on postman Bearer:kgfkhjkhjgfhkjgkhj";

		/*
		 * Preparing /getOneEmployee.php request
		 */
		RequestSpecification getOneEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", "6090A").log().all();

		/*
		 * Storing Response
		 */
		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
	
		/*
		 * Two ways to print response
		 * prettyPrint() method converts JSON obj into String and prints - no need to SOP
		 */
		getOneEmployeeResponse.prettyPrint();
		//String response = getOneEmployeeResponse.body().asString();
		//System.out.println(response);
		
		//Verifying response status code is 200
		getOneEmployeeResponse.then().assertThat().statusCode(200);
	}
	@Test
	public void aPOSTcreateEmployee() {
		
		/*
		 * preparing request for /createEmployee.php
		 */
		RequestSpecification createEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization",token).body("copy payload and paste in here").log().all();
		
		/*
		 * Storing response into createEmployeeResponse
		 */
	Response createEmployeeResponse= createEmployeeRequest.when().log().all().post("/createEmployee.php");
		
	/*
	 * printing response using prettyPrint method
	 */
	createEmployeeResponse.prettyPrint();
	}
}




