package assignments_7jan;

import java.util.Scanner;

class Person
{
	private String name;
	private char gender;
	private int age;
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	public char getGender()
	{
		return gender;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
}

class BusTicket
{
	private int ticketNo;
	private float ticketPrice;
	private float totalAmount;
	Person person;
	
	public void setTicketNo(int ticketNo) 
	{
		this.ticketNo = ticketNo;
	}
	public int getTicketNo() 
	{
		return ticketNo;
	}
	
	public void setTicketPrice(float ticketPrice) 
	{
		this.ticketPrice = ticketPrice;
	}
	public float getTicketPrice() 
	{
		return ticketPrice;
	}
	
	public void setTotalAmount(float totalAmount) 
	{
		this.totalAmount = totalAmount;
	}
	public float getTotalAmount() 
	{
		return totalAmount;
	}
	
	public void setPerson(Person person) 
	{
		this.person = person;
	}
	public Person getPerson() 
	{
		return person;
	}
	
	void calculateTotal()
	{
		if(person.getAge() < 16)
		{
			totalAmount = ticketPrice * 0.5f;
			System.out.println("Total bill is : "+totalAmount);
		}
		else if(person.getAge() >= 60)
		{
			totalAmount = ticketPrice * 0.75f;
			System.out.println("Total bill is : "+totalAmount);
		}
		else if(person.getGender() == 'F' || person.getGender() == 'f')
		{
			totalAmount = ticketPrice * 0.9f;
			System.out.println("Total bill is : "+totalAmount);
		}
		else
		{
			totalAmount = ticketPrice;
			System.out.println("Total bill is : "+totalAmount);
		}
	}
	
	public static BusTicket getTicketDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		Person p = new Person();
		
		BusTicket b1 = new BusTicket();
		
		b1.setPerson(p);
		
		System.out.println("Enter the passenger name");
		b1.getPerson().setName(sc.nextLine());
		
		System.out.println("Enter the gender(M or F / m or f)");
		b1.getPerson().setGender(sc.next().charAt(0));
		
		System.out.println("Enter the age");
		b1.getPerson().setAge(sc.nextInt());
		
		System.out.println("Enter ticket no");
		b1.setTicketNo(sc.nextInt());
		
		System.out.println("Enter ticket price");
		b1.setTicketPrice(sc.nextFloat());
		
		return b1;
	}
}

public class TestMain {

	public static void main(String[] args) {
		
		BusTicket b = BusTicket.getTicketDetails();
		
		System.out.println("Ticket no : "+b.getTicketNo());
		System.out.println("Passenger name : "+b.getPerson().getName());
		System.out.println("Price of Ticket : "+b.getTicketPrice());
		
		b.calculateTotal();
	}

}
