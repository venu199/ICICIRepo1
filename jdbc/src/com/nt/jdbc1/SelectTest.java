package com.nt.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectTest {
private static final String GET_STUDENT_BYNO="SELECT SNAME,SM1,SM2,SM3 from All_Student";

	public static void main(String[] args) {
		Scanner scan=null;
		int no=0;
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			scan=new Scanner("System.in");
			if(scan!=null) {
				System.out.println("Enter Student No::");
				no=scan.nextInt();
			}//if
			//loads the Driver Class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish the Connection 
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","manager");
			//create PreparedStatement
			if(con!=null)
				ps=con.prepareStatement(GET_STUDENT_BYNO);
			//create ResultSet Object
			
			
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
