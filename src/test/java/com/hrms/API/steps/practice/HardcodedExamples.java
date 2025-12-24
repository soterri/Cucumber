package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
//import org.apache.hc.core5.http.ContentType;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * This @FixMethodOrder(MethodSorters.NAME_ASCENDING) will execute @Test annotation
 * in ascending order 
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {

	/**
	 * Rest Assured has methods
	 *  given - preconditions/preparing requests
	 *  when -making call to the end point 
	 *  then - validating, verifying, asserting
	 */
	
	static String baseURI =RestAssured.baseURI = "http://syntaxHRMSwebsitethatIdonothaveaccessto";
	String token = "create a token on postman Bearer:kgfkhjkhjgfhkjgkhj";
	static String employeeID;
	
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
	
	/*
	 * jsonPath to view response body which lets us get the employee ID
	 * storing employee ID as a global variable so that we may use it with our
	 * other calls
	 * ASSERT THAT methods performs the assertion
	 */
	
	employeeID = createEmployeeResponse.body().jsonPath().getString("Employee[0].employee_id");
	System.out.println(employeeID);
	
	createEmployeeResponse.then().assertThat().statusCode(201);
	
	/**
	 * verifying message using equalTo() method - manually importing static package 
	 * import static org.hamcrest.Matcher.*
	 */
	createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
	
	createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("first name"));
	
	/**
	 * verifying server using then().header()
	 */
	createEmployeeResponse.then().header("Server", "Apache/2.4.39 (win64) PHP/7.2.18");
	
	/**
	 * verifying content-type using assertThat().header()
	 */
	createEmployeeResponse.then().assertThat().header("Content-Type", "application/json");
	}
	
	@Test
	public void bGETCreatedEmployee() {
	/**
	 * preparing request for /getOneEmployee.php
	 * using log().all() to see all info being sent with request
	 */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
		.header("Authorization", token).queryParam("employee_id", employeeID).log().all();
		
		/**
		 * making call to retrieve created employee
		 */
		Response getCreatedEmployeeResponse =getCreatedEmployeeRequest.when().log().all().get("/getoneemployyee.php");
		String response = getCreatedEmployeeResponse.prettyPrint();
		
		/**
		 * storing response employeeID into empID which will be used for verification against
		 * stored global emp ID
		 */
		/**
		 * matching exact emp id
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		
		boolean verifyingEmployeeIDMatch = empID.equalsIgnoreCase(employeeID);
		
		/**
		 * asserting emp id's match
		 */
		Assert.assertTrue(verifyingEmployeeIDMatch);
		
		/**
		 * verifying status ode is 200
		 */
		
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
		/**
		 * using json path class to retrieve values from response as a Strinhh
		 */
		JsonPath js = new JsonPath(response);
		
		String emplID = js.getString("employee[0].employee_id");
		String firstName = js.getString("employee[0].emp_firstname");
		String lastName = js.getString("employee[0].emp_lastname");
		String birthday = js.getString("employee[0].emp_birtday");
		String jobTitle = js.getString("employee[0].emp_job_title");
		String gender = js.getString("employee[0].emp_gender");
 
		Assert.assertTrue(emplID.contentEquals(employeeID));
		//Second way of assertion
		Assert.assertEquals("employeeID", emplID);
		
		//verifying expected first name matches actual first name
		Assert.assertTrue(firstName.contentEquals("syntaxFirstName"));
		
		
		

		
	}
}
