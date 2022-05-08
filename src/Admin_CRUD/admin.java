package Admin_CRUD;


import java.sql.SQLException;
import java.util.Scanner;

import E_Libraray.index;

public class admin {

	public admin() throws ClassNotFoundException, SQLException
	{
		System.out.println("----------Hi This is From Admin-----------\n\n");
		
		Scanner sc=new Scanner(System.in);
		
		char ch='"';
		System.out.println("To Add a New Book - Type "+ch+" Add "+ch);
		System.out.println("To Update a Book - Type "+ch+" Update "+ch);
		System.out.println("To Delete a New Book - Type "+ch+" Delete "+ch);
		System.out.println("To OrderBooks a New Book - Type "+ch+" Order "+ch);
		System.out.println("To Logout  - Type "+ch+" Logout "+ch);
		
		System.out.println("\n\n\n");
		String s=sc.next();
		
		if(s.equalsIgnoreCase("Add")) new AddBooks();
		else if(s.equalsIgnoreCase("Update")) new UpdateBooks();
		else if(s.equalsIgnoreCase("Delete")) new DeleteBook();
		else if(s.equalsIgnoreCase("Order")) new OrderBooks();
		else if(s.equalsIgnoreCase("Logout")) new index();
		
		System.out.println("\n\n\n");
		
	}

}