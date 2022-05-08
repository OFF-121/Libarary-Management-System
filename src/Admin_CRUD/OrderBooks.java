package Admin_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;

class java{
	private String username="pravin";
	private String pass="pravin";
	
	public String name()
	{
		return username;
	}
	
	public String pass()
	{
		return pass;
	}
	
}

public class OrderBooks {
	public OrderBooks() throws ClassNotFoundException, SQLException {
        
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("Enter the Book Name That You Want to Order ---\n\n");
		
        String name=sc.nextLine();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String userName=new java().name();
		String Password=new java().pass();
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",userName, Password);
		
	
		Statement st=con.createStatement();
		
		String query="select * from Store where name='"+name+"'";
		
		ResultSet rs= st.executeQuery(query);
		
		int id=0;
		String Name="",Author="",content="";
		
		while(rs.next())
		{
			id=rs.getInt(1);
			Name=rs.getString(2);
			Author=rs.getString(3);
			content=rs.getString(4);
		}
		//System.out.println(id+" "+Name+" "+Author+" "+content);
		
		query="insert into Books values('"+id+"','"+Name+"','"+Author+"','"+content+"')";
		st.executeUpdate(query);
		
		System.out.println("SuccessFully Ordered and Added To Library\n\n");
		new admin();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new OrderBooks();
	}
}
