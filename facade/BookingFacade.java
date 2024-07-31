package facade;

public class BookingFacade {

    public Ticket createMovieBooking(User user, String movieName){
        TicketSystem ts=new TicketSystem();
        Ticket ticket=null;
        if(ts.isBookingValid("kalki")){
             ticket=ts.createTicket(user,movieName,100);

            PaymentSystem ps=new PaymentSystem();
            ps.debitAmount(ticket);

            NotificationSystem ns=new NotificationSystem();
            ns.sendSMS(ticket);
            ns.sendMail(ticket);
        }

        return ticket;
    }
}
