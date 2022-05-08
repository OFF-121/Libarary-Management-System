package Admin;

import java.util.Scanner;


public class MainDashboard {

	public MainDashboard() throws ClassNotFoundException
	{
		System.out.println("----------Hi BookTiger-----------\n\n");
		
		Scanner sc=new Scanner(System.in);
		
		char ch='"';
		System.out.println("To Add a New Book - Type "+ch+" Add "+ch);
		System.out.println("To Update a Book - Type "+ch+" Update "+ch);
		System.out.println("To Delete a New Book - Type "+ch+" Delete "+ch);
		System.out.println("To Print the list of books - Type "+ch+" Print "+ch);
		System.out.println("To Logout  - Type "+ch+" Logout "+ch);
		
		System.out.println("\n\n\n");
		String s=sc.next();
		
		if(s.equalsIgnoreCase("Add")) new AddBooks();
		else if(s.equalsIgnoreCase("Update")) new UpdateBooks();
		else if(s.equalsIgnoreCase("Delete")) new DeleteBooks();
		else if(s.equalsIgnoreCase("Print")) new PrintBooks();
		else if(s.equalsIgnoreCase("Logout")) new Login();
		
		System.out.println("\n\n\n");
		
	}
}
