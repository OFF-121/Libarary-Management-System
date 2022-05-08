package Admin_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

interface addMethod{
	void add(int id,String name,String Author,String content) throws ClassNotFoundException, SQLException;
}

public class AddBooks implements addMethod{
	public AddBooks() throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the ID of The Book   : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name of The Book   : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the AuthorName of The Book   : ");
		String Author=sc.nextLine();
		
		System.out.println("Enter the BookContent of The Book   : ");
		String content=sc.nextLine();
		
		
		//System.out.println(id+" "+name+" "+Author+" "+content);
		add(id,name,Author,content);
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("SuccessFully Books is Added To Libarary!");
		System.out.println("----------------------------------------\n\n");
		new admin();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new AddBooks();
	}
	@Override
	public void add(int id, String name, String Author, String content) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "pravin", "java");
		
	
		Statement st=con.createStatement();
		
		String query="insert into Books values('"+id+"','"+name+"','"+Author+"','"+content+"')";
		st.executeUpdate(query);
	}
}