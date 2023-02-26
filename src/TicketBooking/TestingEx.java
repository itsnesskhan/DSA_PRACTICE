package TicketBooking;

public class TestingEx {
	public static void main(String[] args) {
		MovieTicketBooking movieTicketBooking = new MovieTicketBooking();
		movieTicketBooking.setTicket(10);
		BookingThread bookingThread = new BookingThread("Nasser Khan", movieTicketBooking,3);
		BookingThread bookingThread2 = new BookingThread("Hamda Khan", movieTicketBooking,4);
		BookingThread bookingThread3 = new BookingThread("Zoya Sheikh", movieTicketBooking,4);
//		BookingThread bookingThread4 = new BookingThread("Mahira Sheikh", movieTicketBooking,5);
		
		Thread thread = new Thread(bookingThread);
		Thread thread2 = new Thread(bookingThread2);
		Thread thread3 = new Thread(bookingThread3);
//		Thread thread4 = new Thread(bookingThread4);
		
		thread3.start();
		thread.start();
		thread2.start();
//		thread4.start();
		
	}
}
