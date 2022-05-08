package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteBooks {


	public DeleteBooks() throws ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ISBN of The book that needs to be Deleted ---\n\n");
		
		String isbn=sc.nextLine();
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "BookTiger", "Password");
		
	
		Statement st=con.createStatement();
		
		String query="Delete from Book where isbn='"+isbn+"'";
		
		st.executeQuery(query);
		}
		catch(Exception e)
		{
			System.out.print("Error"+ e);
		}
		System.out.println("SuccessFully Deleted\n\n");
		new MainDashboard();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new DeleteBooks();
	}
}
