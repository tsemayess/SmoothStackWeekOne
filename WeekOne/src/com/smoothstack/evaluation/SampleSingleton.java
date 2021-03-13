package com.smoothstack.evaluation;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.smoothstack.dayfour.assignmentone.Singleton;

public class SampleSingleton {

	private static volatile SampleSingleton instance = null;
	private static Connection conn = null;
	
	

	public static SampleSingleton getInstance() {
		
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}

	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			int x = 0;
			while (rs.next()) {
				x = rs.getInt(1) * input.intValueExact();
			}
		} catch (SQLException e) {}
	}
}
