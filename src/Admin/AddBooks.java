package Admin;
import java.util.Scanner;
import java.sql.*;

public class AddBooks{
	public AddBooks() throws ClassNotFoundException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Name of The Book   : ");
		String Name=sc.nextLine();
		
		
		System.out.println("Enter the Author name of The Book   : ");
		String authorname=sc.nextLine();
		
		System.out.println("Enter the Price number of The Book   : ");
		String price=sc.nextLine();
		
		System.out.println("Enter the ISBN number of The Book   : ");
		String isbn=sc.nextLine();
		
		System.out.println("Enter the Rating of The Book   : ");
		String rating=sc.nextLine();
		
		System.out.println("Enter the Year of The Book   : ");
		String year=sc.nextLine();
		
		
		
		
		
		//System.out.println(id+" "+name+" "+Author+" "+content);
		add(Name,authorname,price,isbn,rating,year);
		
		System.out.println();
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("SuccessFully Books is Added To Libarary!");
		System.out.println("----------------------------------------\n\n");
		new MainDashboard();
	}
	public static void main(String[] args) throws ClassNotFoundException {
		new AddBooks();
	}
	
	public void add(String name,String Aname,String price,String isbn,String rating,String year) throws ClassNotFoundException{

		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "BookTiger", "Password");
		
	
		Statement st=con.createStatement();
		
		String query="insert into Book values('"+name+"','"+Aname+"','"+price+"','"+isbn+"','"+rating+"','"+year+"')";
		st.executeUpdate(query);
		
		/*String query1="insert into Book values('madav','madhav','5','45465','5','2022')";
		st.execute(query1);*/
		
		}
		catch(Exception e)
		{
			System.out.print("Error"+ e);
		}
	}
}
