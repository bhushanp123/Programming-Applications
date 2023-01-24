package StaticAssignments;

public class Ticket {
	private int ticketId;
	private int price;
	private static int availableTickets;
	
	public void setTicketId(int ticketId)
	{
		this.ticketId = ticketId;
	}
	public int getTicketId()
	{
		return ticketId;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	
	public static void setAvailabelTickets(int tickets)
	{
		availableTickets = tickets;
	}
	public static int getAvailabelTickets()
	{
		return availableTickets;
	}
	
	public int calculateTicketCost(int noOfTickets)
	{
		int totalAmount = 0;
		
		if(availableTickets >= noOfTickets)
		{
			availableTickets = availableTickets - noOfTickets;
			
			totalAmount = noOfTickets * price;
		}
		else
		{
			System.out.println("No tickets are availables");
			
		}
		return totalAmount;
	}
}
