package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.net.ResponseCache;

public class HardcodedExamples {

	/**
	 * Rest Assured has methods
	 *  given - preconditions/preparing requests
	 *  when -making call to the end point 
	 *  then - validating, verifying, asserting
	 */

	public static void main(String[] args) {

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
				.header("Authorization", token).queryParam("employee_id", "6090A");

		/*
		 * Storing Response
		 */
		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
	
		/*
		 * Two ways to print response
		 * prettyPrint() mtehod converts JSON obj into String and prints - no need to SOP
		 */
		getOneEmployeeResponse.prettyPrint();
		//String response = getOneEmployeeResponse.body().asString();
		//System.out.println(response);
		
		//Verifying status code is 200
		getOneEmployeeResponse.then().assertThat().statusCode(200);
		
		
	}
}
