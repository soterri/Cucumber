package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeeListPageElements {
	
	
	@FindBy(id="empsearch_emp_name_")
	public WebElement empName;

	@FindBy(id="empsearch_id")
	public WebElement empId;
	
	public ViewEmployeeListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
}
