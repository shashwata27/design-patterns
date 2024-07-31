package facade;

public class TicketSystem {
    public Ticket createTicket(User user, String movieName, int ticketAmount) {
        return new Ticket(user.name,ticketAmount,movieName);

    }

    public boolean isBookingValid(String kalki) {
        return true;
    }
}
