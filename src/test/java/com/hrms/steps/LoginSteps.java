package com.hrms.steps;

import com.hrms.utils.CommonnMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends CommonnMethods {

	@Given("user navigated to HRMS")
	public void user_navigated_to_hrms() {
		setUp();// implementation code

	}

	@Given("user is logged in with valid admin credentials")
	public void user_is_logged_in_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("pw"));
		login.buttonLogin.click();
		// or jsClick
		click(login.buttonLogin);
	}

	@When("user enters valid admin username and password")
	public void user_enters_valid_admin_username_and_password() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		sendText(login.username, "terri");
		sendText(login.password, "gfhfhh");
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		click(login.buttonLogin);
	}

	@Then("admin user is succesfully logged in")
	public void admin_user_is_succesfully_logged_in() {
		String expected = "Welcome Terri";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals(actual, expected, "Welcome message is not displayed or not correct");
		System.out.println(actual);
		wait(3);
	}
	@When("user enter valid ess username and password")
	public void user_enter_valid_ess_username_and_password(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);
	    
	}
	
	@Then("user see {string}")
	public void user_see(String errorMsg) {
		Assert.assertEquals("Error message is incorrectly displayed", errorMsg, login.errorMsg.getText());
		
	}
	@Then("ess user is successfully logged in")
	public void ess_user_is_successfully_logged_in() {
		String expected = "Welcome Terri";
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome msg is not displayed or not correct", expected, actual);
		System.out.println(actual);
		wait(3);
		//tearDown();
	}

	@When("user enters valid employee name and last name")
	public void user_enters_valid_employee_name_and_last_name() {
		
	}

}
