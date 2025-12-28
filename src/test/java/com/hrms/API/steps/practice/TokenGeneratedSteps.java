package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class TokenGeneratedSteps {

	// storing token as static variable
	public static String token;

	// BaseURI
	String baseURI = RestAssured.baseURI = "syntax hrms that I dont have access to";

	@Given("a JWT is generated")
	public void a_jwt_is_generated() {

		RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json")
				.body("syntax payload I dont have acccess to");

		Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");

		// generateTokenResponse.prettyPrint();

		//Retrieving token from generate response body and concatenating Bearer
		token = "Bearer" + generateTokenResponse.body().jsonPath().getString("token");
		// optional to print out token
		System.out.println(token);

	}

}
