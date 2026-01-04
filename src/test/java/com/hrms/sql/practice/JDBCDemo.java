package com.hrms.sql.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class JDBCDemo {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc: driver type: hostname:port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntax_hrm_mysql";

	@Test // execute our test
	public void abc() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		// System.out.println("DB connection is successful"); printing out to check if
		// connection is made
		java.sql.Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		rs.next();
		String firstname = rs.getString("emp_firstname");
		System.out.println(firstname);
		rs.next();
		String firstname2 = rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);
		String allData;
		while (rs.next()) {
			allData = rs.getObject("emp_first_name").toString();
			System.out.println(allData);
		}
		rs.close();
		st.close();
		conn.close();

	}

	//retrieve all the job titles and store them in arraylist and show it in console from arrayList
	@Test
	public void listTask() throws SQLException	{
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		
		List<String> jobTitles = new ArrayList<>();
		while(rs.next()) {
			jobTitles.add(rs.getObject("emp_job_title").toString());		
		}
		System.out.println(jobTitles);
		for(String jt:jobTitles) {
			System.out.println(jt);
		}
		rs.close();
		st.close();
		conn.close();
	}
}
