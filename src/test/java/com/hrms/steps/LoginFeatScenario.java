package com.hrms.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeatScenario {

	public WebDriver driver;

	@Given("user is able to access hrms application")
	public void user_is_able_to_access_hrms_application() {
		driver = new ChromeDriver();
		driver.get("syntax site");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password");

	}

	@Then("user is able to see dashboard page")
	public void user_is_able_to_see_dashboard_page() {

	}

	@Then("user {string} and {string} sees dashboard")
	public void user_and_sees_dashboard(String firstName, String lastName) {
		WebElement firstName1 = driver.findElement(By.id("name"));
		WebElement lastN = driver.findElement(By.id("lname"));

		firstName1.sendKeys("terri");
		lastN.sendKeys("thach");

	}
	@Given("user add {string}, {string}, and {string}")
	public void user_add_and(String string, String string2, String string3) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("user clicks on save button")
	public void user_clicks_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
