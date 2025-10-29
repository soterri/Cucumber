package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.utils.CommonnMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddEmployeeSteps extends CommonnMethods {

	@Given("user navigates to Add Employee page")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmployee();
	}

	// this method is an enhanced method and parameter values are
	// supplied from gherkin Feature File
	@When("user enters employees {string} and {string}")
	public void user_enters_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		// WaitandClick(addEmp.saveBtn);

	}

	// enhanced method and parameter values that are supplied from feature file
	@Then("{string} employee is added successfully")
	public void employee_is_added_succesfully(String expectedName) {
		String actual = pdetail.profilePic.getText();
		Assert.assertEquals(expectedName, actual);

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

	@When("user clicks on save button")
	public void user_clicks_on_save_button() {

	}

	@Then("employee is added succesfully")
	public void employee_is_added_succesfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters employees {string}, {string}, and {string}")
	public void user_enters_employees_and(String fName, String lName, String middleName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.lastName, lName);
		sendText(addEmp.middleName, middleName);
	}

	@Then("{string}, {string}, and {string} is added succesfully")
	public void and_is_added_succesfully(String string, String string2, String string3) {
		System.out.println("Employee is added");
	}
	@When("user enters employee details and click on save")
	public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
	  List<Map<String, String>> addEmployeeList=dataTable.asMaps();
		
	  for(Map<String, String> addEmpListMap:addEmployeeList) {
		  
		  String fname = addEmpListMap.get("FirstName");
		  String mname = addEmpListMap.get("MiddleName");
		  String lname = addEmpListMap.get("lastName");
		  
		  sendText(addEmp.firstName, addEmpListMap.get("FirstName"));
		  sendText(addEmp.lastName, addEmpListMap.get("lastName"));
		  sendText(addEmp.middleName, addEmpListMap.get("MiddleName"));
		  click(addEmp.saveBtn);
		  
		  String actual=pdetail.profilePic.getText();
		  String expected = fname+" "+lname+" "+mname;
		  Assert.assertEquals("Emp is not added successfully", "");
		 jsClick(dashboard.addEmp);
		  
	  }
		
		// Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}
	@Then("employee is added")
	public void employee_is_added() {
		System.out.println("----employee is added using datatable");
	}

}
