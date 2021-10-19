package com.bridglabz.bookstoremangementsystem.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1 st step load drivers
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver is loaded");
		
		// 2nd step to connect your db
		
		String url = "jdbc:mysql://localhost:3306/book_store_management_system";
		String orgUri = "jdbc:mysql://localhost:3306/org_worker";
		String username ="root";
		String password="mysql";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		Connection connectionOrg = DriverManager.getConnection(orgUri, username, password);
		System.out.println("Connection Successfull...");
		
		//3rd step to fetch the data from db
		Statement statement = connection.createStatement();
		Statement statementOrg = connectionOrg.createStatement();
		
		String qurey = "select * from tb_user;";
		String qurey1 = "select upper(FIRST_NAME) from worker;";
		
		ResultSet resultSet = statement.executeQuery(qurey);
		
		ResultSet resultSetOrg = statementOrg.executeQuery(qurey1);
		
		while(resultSet.next()) {
			System.out.println(" Id = "+resultSet.getString("id"));
			System.out.println(" Name = "+resultSet.getString(2));
			System.out.println(" Id = "+resultSet.getString(3));
			System.out.println(" Email = "+resultSet.getString("email"));
			
			System.out.println("<<<<<<<<<--------------->>>>>>>>>>>>>>");
		}
		
		while(resultSetOrg.next()) {
			System.out.println(" FirstName= "+resultSetOrg.getString(1));
			
			System.out.println("<<<<<<<<<--------------->>>>>>>>>>>>>>");
		}
		
		//4th step close the connection
		connection.close();
		connectionOrg.close();
	}
}
