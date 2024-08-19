package com.sqlserver;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlServerConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String connectionurl="jdbc:sqlserver://WIN2019;Databases=Insurance Policy Management;integratedSecurity=true;encrypt=false";
			Connection conn=DriverManager.getConnection(connectionurl);
			System.out.println("Connection established");
			
		}
		catch (Exception e)
		{
			System.out.println("Connection failed");
			e.printStackTrace();
		}
	}

}
