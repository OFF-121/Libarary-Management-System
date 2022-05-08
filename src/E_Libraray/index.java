package E_Libraray;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;

import Admin_CRUD.admin;
import Login.AdminLogin;
import Login.UserLogin;
import Login.createAccount;
import Login.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class index {

	public index() throws ClassNotFoundException {
		
		Map<String ,String> x=System.getenv();
		
		System.out.println(x);
//		for(String s:x.keySet())
//		{
//			if()System.out.println(s+" "+x.get(s)+"-----------------");
//		
//		}
//		System.out.println(x);
//		
		Class.forName("oracle.jdbc.driver.OracleDriver");
        
		
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
			Statement st=con.createStatement();
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter UserName :");
			String username=sc.nextLine();
			System.out.println("Enter Password :");
			String password=sc.nextLine();
			
			String  query="select roles.roles from roles where roles.id=(select role from users where name='"+username+"' and password='"+password+"')";
			ResultSet rs=st.executeQuery(query);
			
			
			
			String what="";
			while(rs.next())
			{
				what=rs.getString(1);
			}
			if(what.equals("Admin")) new admin();
			else if(what.equals("Users"))new user(username);
			else {
				System.out.println("You are Not a user... Requesting to Create an Account");
				new createAccount();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	 new index();
	}
}


//select roles.roles from roles where roles.id=(select role from users where name='pravinKumar');