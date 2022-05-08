package Login;

import java.sql.SQLException;
import java.util.Scanner;
import E_Libraray.index;


public class user {
	
	
	Scanner sc=new Scanner(System.in);
	
     public user(String Uname) throws ClassNotFoundException, SQLException {
        
    	 System.out.println("----------Hi This is From UserSide-----------\n\n");
		char ch='"';
		System.out.println("To Ask a Book To Libraian - Type "+ch+" Ask "+ch);
		System.out.println("To Search a Book - Type "+ch+" Search "+ch);
		System.out.println("To Read a Book - Type "+ch+" Read "+ch);
		System.out.println("To Rent a Book - Type "+ch+" Rent "+ch);
		System.out.println("To Logout - Type "+ch+" Logout "+ch);
		
		System.out.println("\n\n\n");
		String s=sc.next();
		
		if(s.equalsIgnoreCase("Ask")) new askBook(Uname);
		else if(s.equalsIgnoreCase("Search")) new search(Uname);
		else if(s.equalsIgnoreCase("Read")) new read();
		else if(s.equalsIgnoreCase("Rent")) new rent(Uname);
		else if(s.equalsIgnoreCase("Logout")) new index();
	}
}
