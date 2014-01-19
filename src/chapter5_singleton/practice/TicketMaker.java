package chapter5_singleton.practice;

public class TicketMaker {
	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}

	private TicketMaker() {
	}

	public static TicketMaker getInctanse() {
		return ticketMaker;
	}
}
