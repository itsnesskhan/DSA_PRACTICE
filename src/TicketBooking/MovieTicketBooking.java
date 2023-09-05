package TicketBooking;


public class MovieTicketBooking {

	private int availbaleTickets;
	
	public int getTiket() {
		return  availbaleTickets;
	}
	
	public void setTicket(int ticket) {
		this.availbaleTickets = ticket;
	}
	
	
	public int bookTicket(String name,int ticketstoBook) {
		if (availbaleTickets >= ticketstoBook) {
			availbaleTickets = availbaleTickets - ticketstoBook;
			System.out.println(ticketstoBook + " tickets booked successfully! Congratulations " + name);
			System.out.println("Remaing Tickets " + availbaleTickets);
		}
		else {
			System.out.println(ticketstoBook+" tickets not availble "+name);
			System.out.println("Remaing Tickets "+availbaleTickets);
		}
		
		return ticketstoBook;
	}
}
