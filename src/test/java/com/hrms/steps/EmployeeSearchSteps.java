package com.hrms.steps;

import com.hrms.utils.CommonnMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonnMethods{

	@Given("user navigates to Employee List page")
	public void user_navigates_to_employee_list_page() {
		//use Dashboard!
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);

	}

	@When("user enters valid employee id")
	public void user_enters_valid_employee_id() {
		sendText(viewEmp.empId, "545445");

	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		//jsClick(viewEmp.searchBtn);
	}

	@Then("users sees employee information is displayed")
	public void users_sees_employee_information_is_displayed() {
		System.out.println("Emp is displayed");
	}

	@When("user enters valid employee name")
	public void user_enters_valid_employee_name() {

	}
}