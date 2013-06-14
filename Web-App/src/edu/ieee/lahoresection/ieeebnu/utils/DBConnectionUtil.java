/**
 * author: Muhammad Haris
 * date: Feb 19, 2013
 * CSC-315 - Lab Project Course
 * SCIT- Beaconhouse National University
 */
package edu.ieee.lahoresection.ieeebnu.utils;


import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Utility class to open a DB Connection
 */
public class DBConnectionUtil {

	public static Connection openConnection() throws Exception {

		/* Load the Driver class to make available to DriverManager */
		Class.forName("com.mysql.jdbc.Driver");

		/* JDBC URL consists of 4 parts like an HTTP URL:
		 * 1. Protocol --> jdbc:mysql:// (will always be same for MySQL).
		 * 2. Host --> localhost (can be any hostname or ip address).
		 * 3. Port --> 3306 (default port for MySQL)
		 * 4. Database --> sales (can be any database available on server)
		 */
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb";
		
		/* get java.sql.Connection by supplying URL, username and password */
		return DriverManager.getConnection(jdbcURL, "root", "");
	}
}
