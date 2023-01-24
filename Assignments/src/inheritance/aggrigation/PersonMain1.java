package inheritance.aggrigation;

import java.util.Scanner;

public class PersonMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter person name");
		String name = sc.nextLine();
		
		System.out.println("Enter person mobile no");
		String mobileNo = sc.next();
		
		System.out.println("Enter mobile company name");
		String c_name = sc.next();
		
		System.out.println("Enter ram size");
		int ramSize = sc.nextInt();
		
		System.out.println("Enter price");
		int m_price = sc.nextInt();
		
		Mobile1 mobj = new Mobile1(c_name, ramSize, m_price);
		
		Person1 pobj = new Person1(name, mobileNo, mobj); 
		
		System.out.println(pobj);
	}

}
