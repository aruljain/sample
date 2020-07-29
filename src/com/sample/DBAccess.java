package com.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAccess {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//by the year 2000 I studied. Legacy. Hibernate ORM tool 
	
		Class.forName("com.mysql.cj.jdbc.Driver"); // to load Driver class during runtime.

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_db", "root", "root");
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from tbl_user");
		
		while(rs.next())
		{
			System.out.println(rs.getInt("userid")+"     "+rs.getInt("roleid")+"    "+rs.getString("username")+"   "+rs.getString("pwd"));
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
}
