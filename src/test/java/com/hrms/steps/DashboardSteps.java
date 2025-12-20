package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.hrms.utils.CommonnMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashboardSteps extends CommonnMethods {

	// write implementation for THEN user see dashboard menu is displayed step w/o
	// usnig runner
	/*
	 * first add annotation @Then then specify entire step, user see DB menu is
	 * displayed during execution, calling the method that has matching tags once,
	 * tags are done, add method public void user see dashboard menu is displayed no
	 * spaces allowed bw identifiers - add underscores supplying data to the method
	 * specify datatable has a parameter, passing DataTable + any given variable
	 * name when one row no header - use List
	 */

	@Then("user see dashboard menu is displayed")
	public void user_see_dashboard_is_displayed(DataTable dashboardMenu) {
		List<String> expectedMenu = dashboardMenu.asList();
		List<String> actualMenu = new ArrayList<>();

		for (WebElement el : dashboard.dashMenu) {
			actualMenu.add(el.getText());

		}
		System.out.println(expectedMenu);
		System.out.println(actualMenu);

		Assert.assertTrue(actualMenu.equals(expectedMenu));

	}

}
