package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class createAccount {
	static int id=1;
	Scanner sc=new Scanner(System.in);
	public createAccount() throws SQLException, ClassNotFoundException {
		 String ID="user"+(id++);
		 System.out.println("Enter UserName :");
		 String Name=sc.nextLine();
		 System.out.println("Enter PassWord :");
		 String Pass=sc.nextLine();
		 System.out.println();
		 int role=2;
		 
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		 Statement st=con.createStatement();
			
		 String query="insert into Admin values('"+ID+"','"+Name+"','"+Pass+"','"+role+"')";
		 
		 st.executeUpdate(query);
		 
		 System.out.println("SuccessFully Created\n\n You need to Login --");
		 new UserLogin();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new createAccount();
	}
	
}
