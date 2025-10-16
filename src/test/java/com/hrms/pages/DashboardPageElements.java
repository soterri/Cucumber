package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonnMethods;

public class DashboardPageElements extends CommonnMethods {
	
	@FindBy(id="Welcome")
	public WebElement welcome;
	
	@FindBy(xpath="//div['logo']")
	public WebElement logo;
	
	@FindBy(xpath="//a@id=['menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(xpath="//a[@id=menu_pim_addEmployee']")
	public WebElement PIM;
	
	@FindBy(id="//a[@id='menu_pim']")
	public WebElement empListPage;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	public void navigateToAddEmployee() {
		jsClick(addEmp);
		//click(addEmp);
	}

}
