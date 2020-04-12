package com.nt.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;

public class SelectTest1 {

	public static void main(String[] args) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Establish the Connection 
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
		

	}

}
