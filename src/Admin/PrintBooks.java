package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrintBooks {

	public PrintBooks() throws ClassNotFoundException{
        
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "BookTiger", "Password");
		
	
		Statement st=con.createStatement();
		
		String query="select * from book";
		 PreparedStatement pstmt=con.prepareStatement(query);
		 ResultSet rst=pstmt.executeQuery();

         while(rst.next()){
      	    System.out.print("NAME:"+rst.getString("Name")+"	");
      	   System.out.print("AUTHOR NAME:"+rst.getString("Author_name")+"	");
      	 System.out.print("PRICE:"+rst.getString("price")+"	");
      	System.out.print("ISBN NUMBER:"+rst.getString("isbn")+"	");
      	System.out.print("RATING :"+rst.getString("Rating")+"	");
      	System.out.print("PUBLISHED YEAR "+rst.getString("Published_Year")+"	");
      	System.out.println();
             
         }
	
		}
		catch(Exception e)
		{
			System.out.print("Error"+ e);
		}
		System.out.println("SuccessFully Printed\n\n");
		new MainDashboard();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new PrintBooks();
	}
}
