package facade;

public class NotificationSystem {
    public void sendSMS(Ticket ticket) {
        System.out.println("send sms to "+ticket.watcher);
    }

    public void sendMail(Ticket ticket) {
        System.out.println("sent mail to "+ticket.watcher);
    }
}
