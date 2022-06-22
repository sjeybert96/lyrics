package com.jeybert.dao;

import java.sql.*;

public class UserDAO {

	
	public void connect()
	{
		Statement st = null ;
		Connection con = null ;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://82.180.160.15:3306/lyrics?useSSL=false&allowPublicKeyRetrieval=true", "jeybert", "iamjeYbert007@@");
			if(con != null)
			{
			 st = con.createStatement();
			ResultSet rs =  st.executeQuery("SELECT * FROM user");
			if(rs.next())
			{
				System.out.println("DATABASE CONNECTED");
				System.out.println(rs.getString("email"));
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
		finally
		{
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
