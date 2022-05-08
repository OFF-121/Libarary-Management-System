package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import E_Libraray.index;

public class rent {
	public rent(String Uname) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the Book , You are willing to Rent..");
		String name=sc.nextLine();
		System.out.println("Yes the Book is Available\n Do You need To Rent The Book?");
		System.out.println("(Yes/No)");
		
		String ans=sc.nextLine();
		if(ans.equals("yes") || ans.equals("Yes"))
		{
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
			

			Statement st=con.createStatement();
			
			String query="Select * from Admin where UserName='"+Uname+"'";
			ResultSet rs= st.executeQuery(query);
			
			while(rs.next())
			{
				//System.out.println(rs.getString(3)+"----------------------");
				if(rs.getString(4).equals("No")) System.out.println("You are Not a Member");
				else System.out.println("Successfully Rented");
			}
			
			
		}
		else {
			System.out.println("ThankYou For Your Response\nHappy Learning");
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("\n\n\n\n");
		System.out.println("-----------------------------------------------\n");
		new index();
	}
}
