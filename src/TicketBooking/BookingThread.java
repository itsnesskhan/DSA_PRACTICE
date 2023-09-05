package TicketBooking;

public class BookingThread implements Runnable {
	
	private String name;
	private MovieTicketBooking ticket;
	private int numberOfTickets;
	
	
	public BookingThread(String name ,MovieTicketBooking ticket, int numberOfTickets) {
		this.name = name;
		this.ticket = ticket;
		this.numberOfTickets = numberOfTickets;
	}

	@Override
	public void run() {
			ticket.bookTicket(name,numberOfTickets);
		
	}

}
