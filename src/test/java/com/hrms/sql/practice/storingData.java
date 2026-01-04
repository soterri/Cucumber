package com.hrms.sql.practice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class storingData {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	// jdbc:driver type:hostname:port/db_name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void getAndStoreData() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id, name, country code from ohrm location");

		List<Map<String, String>> listOfData = new ArrayList<>();
		Map<String, String> mapData;

		while (rs.next()) {
			mapData = new LinkedHashMap<>(); // initializing map after each iteration so that our data does not get
												// overwritten
			mapData.put("Location id", rs.getObject("id").toString());// storing our first col in map
			mapData.put("Office name", rs.getObject("name").toString());
			mapData.put("Country code", rs.getObject("country_code").toString());

			listOfData.add(mapData); // storing our map inside list

		}
		System.out.println(listOfData);

	}

	@Test
	public void retrieveAndStoreDataEnhanced() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from ohrm_job_title");
		ResultSetMetaData rsMetaData = rs.getMetaData();

		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> mapData;

		while (rs.next()) {
			mapData = new LinkedHashMap<>();

			for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
				mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());

			}
			listData.add(mapData);
		}
		System.out.println(listData);

	}
	//display all the info from nationality table but 
	//display id "nationality id",  name = "nationality"
	@Test
	public void getNationalty() throws SQLException {
	Connection conn = DriverManager.getConnection(dbUsername, dbPassword, dbUrl);
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery("select * from ohrm_nationality");
	ResultSetMetaData rsMetaData = rs.getMetaData();
	
	List<Map<String,String>> listData = new ArrayList<>();
	Map<String,String> mapData;
	
	while(rs.next()) {
		mapData = new LinkedHashMap<>();
		for(int i=1; i<rsMetaData.getColumnCount(); i++) {
			mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
			
		}
	}
	

}
}