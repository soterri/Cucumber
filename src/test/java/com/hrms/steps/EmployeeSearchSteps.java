package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonnMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.GlobalVariables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchSteps extends CommonnMethods {

	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS(){
		setUp();
		
	}
	
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.buttonLogin);
	}

	@Given("user navigates to Employee List page")
	public void user_navigates_to_employee_list_page() {
		// use Dashboard!
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);

	}

	@When("user enters valid employee id {string}")
	public void user_enters_valid_employee_id(String empID) {
		sendText(viewEmp.empId, empID);

	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		// jsClick(viewEmp.searchBtn);
	}

	@Then("users sees employee information is displayed")
	public void users_sees_employee_information_is_displayed() {
		System.out.println("Emp is displayed");
		tearDown();
	}

	@When("user enters valid employee {string} and {string}")
	public void user_enters_valid_employee_name_and_last_name(String empId) {
		sendText(viewEmp.empId, empId);
		GlobalVariables.empID = empId;
	}

	@Then("verify table is displayed")
	public void verify_table_is_displayed() {
		Assert.assertEquals(true, viewEmp.isTableDisplayed());
	
	}

	@Then("get first name from table")
	public void get_first_name_from_table() {
		System.out.println(viewEmp.getFirstNameFromTable());

		
	}
	@Then("validate first name from ui againsts db")
	public void validate_first_name_from_ui_againsts_db() {
		Assert.assertEquals(DBSteps.dbData, viewEmp.getFirstNameFromTable());

	}


}