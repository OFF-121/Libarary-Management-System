package Login;

import java.sql.SQLException;
import java.util.Scanner;

import Admin_CRUD.admin;

public class AdminLogin {
	 Scanner sc=new Scanner(System.in);
	 String name="PravinKumar";
	 String pass="19euec104";

	 
	 public AdminLogin() throws ClassNotFoundException, SQLException {
		 System.out.println();
		 System.out.println("Enter Admin UserName :\n");
		 String Name=sc.nextLine();
		 System.out.println();
		 System.out.println("Enter Admin PassWord :\n");
		 String Pass=sc.nextLine();
		 System.out.println();
		 
		 if(name.equals(Name) && pass.equals(Pass)) new admin();
		 
		 else if(!name.equals(Name) && pass.equals(Pass)) {
			 System.out.println("Incorrect UserName....");
			 new AdminLogin();
		 }
		 else if(name.equals(Name) && !pass.equals(Pass)) {
			 System.out.println("Incorrect PassWord....");
			 new AdminLogin();
		 }
		 else {
			 System.out.println("Both UserName And PassWord are Incorrect....");
			 new AdminLogin();
		 }
		
	}
	 
	 
}
