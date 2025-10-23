package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {
	
	@FindBy(id="personal_cmbNation")
	public WebElement nationalityDD;
	
	@FindBy(name="personal[optGender]'")
	public List<WebElement> genderRadioGroup;
	
	@FindBy(xpath="//div[@id=pdMainContainer']")
	public WebElement lblPersonalDetails;
	
	@FindBy(xpath="//div[@id='profile-c']//h1")
	public WebElement profilePic;
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	

}
