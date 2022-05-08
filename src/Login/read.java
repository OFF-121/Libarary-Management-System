package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import E_Libraray.index;

public class read {
	public read() throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Book , You are willing to read..");
		String name=sc.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		

		Statement st=con.createStatement();
		
		String query="Select BookContent from Books where Name='"+name+"'";
		ResultSet rs= st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		
		
		System.out.println("Book Read SuccessFully...");
		
		con.close();
		
		System.out.println("-----------------------------------------------");
		System.out.println("\n\n\n\n");
		System.out.println("-----------------------------------------------\n");
		new index();

	}
}
