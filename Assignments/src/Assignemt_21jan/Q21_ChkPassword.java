package Assignemt_21jan;

import java.util.Scanner;

class User
{
	private String username;
	private String password;
	
	public User() 
	{
		this.username = "bhushanp608@gmail.com";
		this.password = "B.p@0000";
	}
	
	public void chkLoginDetails(String username,String password)
	{
		if(password.length() < 8)
		{
			System.out.println("Password must be 8 char long");
		}
		/*if((password.matches("^[@#]")))
		{
			System.out.println("at least one special @ or # character must be present");
		}*/
		if(! (password.matches("[0-9]")))
		{
			System.out.println("Password must contain at least one digit");
		}
		if(password.contains(" "))
		{
			System.out.println("Password must not have space");
		}
		if(! (password.matches("[A-Z]")))
		{
			System.out.println("Password must contain at least one uppercase letter");
		}
		if(this.username.equals(username) && this.password.equals(password))
		{
			System.out.println("Welcome");
		}


	}
	
}

public class Q21_ChkPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username : ");
		String u_name = sc.nextLine();
		
		System.out.println("Enter password : ");
		String u_pass = sc.nextLine();
		
		User u = new User();
		
		u.chkLoginDetails(u_name,u_pass);
	}

}
