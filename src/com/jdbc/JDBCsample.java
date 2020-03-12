package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCsample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");	
	
	String s="select * from employees";
	PreparedStatement p = c.prepareStatement(s);
	
	ResultSet eq = p.executeQuery();
	while (eq.next()) {
String t = eq.getString("first_name");	
System.out.println(t);
String t1 = eq.getString("last_name");
System.out.println("lastname ="+t1);
	}
	c.close();

	
	
	
	
	
	
}
}
