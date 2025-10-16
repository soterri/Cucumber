package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeeListPageElements;

public class PageInitializer extends BaseClass {

	//initializes all pages class and stores references in
	//static variables that will be called/used in test classes
	
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pdetail;
	public static ViewEmployeeListPageElements viewEmp;
	
	public static void initialize() {
		
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetail = new PersonalDetailsPageElements();
		viewEmp = new ViewEmployeeListPageElements();
	}
	public void navigateToAddEmployee() {
		//jsClick(PIM);
		//jsClick(addEmp);
	}
}
