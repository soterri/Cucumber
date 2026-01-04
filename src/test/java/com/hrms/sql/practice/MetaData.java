package com.hrms.sql.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {
	
	String dbUsername = "syntax";
	String dbPassword = "syntax123";
	String dbUrl = "jdbc:mysql://166.02.36.207:3306/syntax_mysql";
	
	@Test
	public void dbMetaData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData = conn.getMetaData();
		String driverName=dbMetaData.getDriverName();
		String dbVersion = dbMetaData.getDatabaseProductVersion();
		System.out.println(driverName);
		System.out.println(dbVersion);
	
	}
	//query - display all the info about employees whose emp_number is 15464
	@Test
	public void rsMetaData() throws SQLException{
		Connection conn = DriverManager.getConnection(dbUrl, dbPassword, dbUsername);
		Statement st = conn.createStatement();
		ResultSet rs =st.executeQuery("select * fro hs_hr_employees where emp_number is = 5545");
		ResultSetMetaData rsMetaData = rs.getMetaData();
		int  colNumbers = rsMetaData.getColumnCount();
		System.out.println(colNumbers);
		String colName1 = rsMetaData.getColumnName(1);
		System.out.println(colName1);
		
		for(int i=1; i <colNumbers; i++) {
			String colNames = rsMetaData.getColumnName(i);
			System.out.println(colNames);
			
		}
	}

}
