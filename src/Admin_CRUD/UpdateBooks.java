package Admin_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateBooks {
	public UpdateBooks() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Book ISBN That Content Needs To be Changed ---\n\n");
		
		String isbn=sc.nextLine();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		
	
		Statement st=con.createStatement();
		
		String query="Delete from Book where isbn='"+isbn+"'";
		
		st.executeQuery(query);
		
		
		
	    System.out.println();
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("SuccesssFully Updated The Book");
		System.out.println("----------------------------------------\n\n");
	    
	    new admin();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UpdateBooks();
	}
}
