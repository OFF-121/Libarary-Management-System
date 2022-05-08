package Admin;


import java.util.Scanner;


public class Login {
	 Scanner sc=new Scanner(System.in);
	 String name="BookTiger";
	 String pass="BookTiger@7";

	 
	 public Login() throws ClassNotFoundException{
		 System.out.println();
		 System.out.println("Enter Admin UserName :\n");
		 String Name=sc.nextLine();
		 System.out.println();
		 System.out.println("Enter Admin PassWord :\n");
		 String Pass=sc.nextLine();
		 System.out.println();
		 
		 if(name.equals(Name) && pass.equals(Pass)) new MainDashboard();
		 
		 else if(!name.equals(Name) && pass.equals(Pass)) {
			 System.out.println("Incorrect UserName....");
			 new Login();
		 }
		 else if(name.equals(Name) && !pass.equals(Pass)) {
			 System.out.println("Incorrect PassWord....");
			 new Login();
		 }
		 else {
			 System.out.println("Both UserName And PassWord are Incorrect....");
			 new Login();
		 }
		
	}
	 public static void main(String args[]) throws ClassNotFoundException
	 {
		 new Login();
	 }
	 
	 
}
