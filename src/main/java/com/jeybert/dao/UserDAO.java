package com.jeybert.dao;

import java.sql.*;

public class UserDAO {

	
	public void connect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://82.180.160.15:3306/lyrics", "jeybert", "iamBlESSED007@@");
			if(con != null)
			{
			Statement st = con.createStatement();
			ResultSet rs =  st.executeQuery("SELECT * FROM user");
			if(rs.next())
			{
				System.out.println("DATABASE CONNECTED");
			}
			}
			else
			{
				System.out.println("Failed to connect with mysql");
			}
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION");
			e.printStackTrace();
		}
	}
}
