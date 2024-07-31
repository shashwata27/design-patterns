package facade;

public class PaymentSystem {

    public void debitAmount(Ticket ticket) {
        System.out.println("debited amount "+ticket.amount+" from "+ ticket.watcher);
    }
}
