package com.hinduja.asterix.project1;
import java.sql.*;

public class DatabaseConnector
{
	public static String dbname="project1";
	public static String url="jdbc:mysql://localhost:3306/"+dbname;
	public static String User="root";
	public static String Password="root";
	public static Connection con=null;

	public static Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getCOnnection(url,user,password);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}	
	public static Statement getStatement()
	{
		Statement stmt=null;
		try
		{
			con=getConnection();
			stmt=con.createStatement();
		}
		catch (Exception e)
		{
			 e.printStackTrace();
		}
		return stmt;
	}
	public static PreparedStatement getPreparedStatement()
	{
		PreparedStatement pstmt=null;
		try
		{
			con=getConnection();
			pstmt=con.preparedStatement(query);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return pstmt
	}
	public static ResultSet getResultSet(String query)
	{
		ResultSet rs=null;
		Statement stmt;
		try
		{
			con=getStatement();
			rs=stmt.executeQuery(query);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return rs;
	}
}
		


