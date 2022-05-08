package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {
	public UserLogin() throws ClassNotFoundException, SQLException {
	//	System.out.println("If you Want To be a Member of Library ?");
		System.out.println();
		System.out.println("-----------User Login--------------");
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the UserName ---\n\n");
	    String name=sc.nextLine();
	    
	    System.out.println("Enter the Password ---\n\n");
	    String password=sc.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		Statement st=con.createStatement();
		
		String query="select UserName,Password from Admin where UserName='"+name+"' and PassWord='"+password+"' ";
		ResultSet rs= st.executeQuery(query);
		
		boolean fact=false;
		
		while(rs.next())
		{
			if(name.equals(rs.getString(1)) && password.equals(rs.getString(2))) {
				new user(rs.getString(1));
				fact=true;
			}
			
		}
		if(fact) return;
		System.out.println("You are Not A User-------\nIf you Want To be a Member of Library, You are Requesting to Create an Account\n(Yes/No)");
		
		String res=sc.next();
		
		if(res.equals("Yes")|| res.equals("yes")) new createAccount();
		else new user("Empty");
		
	}
}
