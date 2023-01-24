package inheritance.aggrigation;

import java.util.Scanner;

public class PersonMain {

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
		
		Person p = new Person();
		
		p.setS_name(name);
		p.setS_mobileNo(mobileNo);
		
		Mobile mobj = new Mobile();
		
		p.setM(mobj);
		p.getM().setCompanyName(c_name);
		p.getM().setRamSize(ramSize);
		p.getM().setprice(m_price);
		
		System.out.println("Person name is :" +p.getS_name());
		System.out.println("Person mobile no is :" +p.getS_mobileNo());
		System.out.println("Mobile company name is :" +p.getM().getCompanyName());
		System.out.println("Ram size is :" +p.getM().getRamSize());
		System.out.println("Mobile price is :" +p.getM().getprice());
	}

}
