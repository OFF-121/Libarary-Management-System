package Admin_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteBook {
	public DeleteBook() throws ClassNotFoundException, SQLException {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name of The book that needs to be Deleted ---\n\n");
		
		String name=sc.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		
	
		Statement st=con.createStatement();
		
		String query="Delete from Books where name='"+name+"'";
		
		st.executeQuery(query);
		
		System.out.println("SuccessFully Deleted\n\n");
		new admin();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new DeleteBook();
	}
}
