package com.hrms.API.utils;

import org.json.JSONObject;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;

public class PayloadConstants {

	public static String createEmployeeBody() {

		// Create employee body
		// @return
		String createEmployeeBody = "payload I do not have access to on Syntax HRMS";

		return createEmployeeBody;
	}

	/**
	 * creating payload using JSONObject and returning it as a String
	 * 
	 * @return
	 */
	public static String createEmployeePayload() {

		JSONObject obj = new JSONObject();
		obj.put("emp_firstname", "syntaxFirstName");
		obj.put("emp_lastname", "syntaxLastname");
		obj.put("emp_middle_name", "syntaxMiddleName");
		obj.put("emp_gender", "F");
		obj.put("emp_birthday", "2013-12-07");

		return obj.toString();

	}

	/*
	 * Created method to return payload - to reduce messy code
	 * 
	 * @return
	 */
	public static String updateCreatedEmpBody() {

		String updateBody = "payload that i dont have access to";

		return updateBody;
	}
}
