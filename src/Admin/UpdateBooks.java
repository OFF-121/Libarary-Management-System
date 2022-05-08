package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateBooks {

	public UpdateBooks() throws ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Book ISBN That Content Needs To be Changed ---\n\n");
		
		String isbn=sc.nextLine();
		
		try
		{

		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "BookTiger", "Password");
		
	
		Statement st=con.createStatement();
		
		String query="Delete from Book where isbn='"+isbn+"'";
		
		st.executeQuery(query);
	
		System.out.println("Enter the Name of The Book   : ");
		String Name=sc.nextLine();
		
		
		System.out.println("Enter the Author name of The Book   : ");
		String authorname=sc.nextLine();
		
		System.out.println("Enter the Price number of The Book   : ");
		String price=sc.nextLine();
		
		
		System.out.println("Enter the Rating of The Book   : ");
		String rating=sc.nextLine();
		
		System.out.println("Enter the Year of The Book   : ");
		String year=sc.nextLine();
		
		add(Name,authorname,price,isbn,rating,year);
	    
	    System.out.println();
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("SuccesssFully Updated The Book");
		System.out.println("----------------------------------------\n\n");
		}
		catch(Exception e)
		{
			
		}
	    new MainDashboard();
	}
	
	public void add(String name,String Aname,String price,String isbn,String rating,String year) throws ClassNotFoundException{

		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "BookTiger", "Password");
		
	
		Statement st=con.createStatement();
		
		String query="insert into Book values('"+name+"','"+Aname+"','"+price+"','"+isbn+"','"+rating+"','"+year+"')";
		st.executeUpdate(query);
		
		
		}
		catch(Exception e)
		{
			System.out.print("Error"+ e);
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UpdateBooks();
	}
}
