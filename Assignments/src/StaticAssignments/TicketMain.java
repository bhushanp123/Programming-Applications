package StaticAssignments;

import java.util.Scanner;

public class TicketMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ticket t = new Ticket();
		
		System.out.println("Enter the no of bookings");
		int bookings = sc.nextInt();
		
		System.out.println("Enter the available tickets : ");
		Ticket.setAvailabelTickets(sc.nextInt());
		
		for (int i = 1; i <= bookings; i++)
		{
			System.out.println("Enter the ticket id : ");
			t.setTicketId(sc.nextInt());
			
			System.out.println("Enter the price");
			t.setPrice(sc.nextInt());
			
			System.out.println("Enter the no of tickets : ");
			int noOfTickets = sc.nextInt();
			
			System.out.println("Available tickets : "+Ticket.getAvailabelTickets());
			
			System.out.println("Total amount : "+t.calculateTicketCost(noOfTickets));
			
			System.out.println("Available tickets after booking : "+Ticket.getAvailabelTickets());
		}
		
	}

}
