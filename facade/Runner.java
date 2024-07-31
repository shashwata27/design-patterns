package facade;

public class Runner {
    public static void main(String[] args) {
//        a layer that abstracts what all methods need to be called to do a task
//        for different kind of subsystems
//        eg: in self-service and served restaurant the waiter is your facade layer
//        this cn be applied to systems outside sw design also
        User user =new User("shas","78192 31231");

        TicketSystem ts=new TicketSystem();
        if(ts.isBookingValid("kalki")){
            Ticket ticket=ts.createTicket(user,"kalki",100);

            PaymentSystem ps=new PaymentSystem();
            ps.debitAmount(ticket);

            NotificationSystem ns=new NotificationSystem();
            ns.sendSMS(ticket);
            ns.sendMail(ticket);
        }



        System.out.println("with facade");
        BookingFacade bf= new BookingFacade();
        Ticket ticket2=bf.createMovieBooking(user,"kalki");
    }
}
