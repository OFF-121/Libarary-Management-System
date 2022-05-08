package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class search {
	public search(String uname) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BookName to Be Searched");
		String name=sc.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		
	
		Statement st=con.createStatement();
		
		String query="Select * from Books";
		ResultSet rs= st.executeQuery(query);
		
		while(rs.next())
		{
			if(name.equals(rs.getString(2))) {
				new rent(uname);
				return;
			}
		}
		
		
		System.out.println("No Books is Available....");
		con.close();
	}
}
