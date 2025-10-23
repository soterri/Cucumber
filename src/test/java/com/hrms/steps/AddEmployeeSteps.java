package com.hrms.steps;

import com.hrms.utils.CommonnMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddEmployeeSteps extends CommonnMethods {

	@Given("user navigates to Add Employee page")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}

	@When("user enters employees first name and last name")
	public void user_enters_first_name_and_last_name() {
		sendText(addEmp.firstName, "Terri");
		sendText(addEmp.lastName, "Thach");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		//WaitandClick(addEmp.saveBtn);

	}
	@Then("employee is added successfully")
	public void employee_is_added_succesfully() {
		String actual = pdetail.profilePic.getText();
		String expected = "name";
		Assert.assertEquals(expected, actual);
		
	}
	@When("user delete employee id")
	public void user_deletes_employee_id() {
		addEmp.employeeId.clear();
	}
	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		jsClick(addEmp.checkboxLoginDetails);
	}
	@When("user enters login credentials")
	public void user_enters_login_credentials() {
		addEmp.createEmpLoginCR();
	}
}
