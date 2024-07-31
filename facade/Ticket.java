package facade;

public class Ticket {
    public final String movieName;
    public final String watcher;
    public final Integer amount;

    Ticket(String watcher, Integer amount, String movieName){
        this.watcher=watcher;
        this.amount=amount;
        this.movieName=movieName;
    }
}
