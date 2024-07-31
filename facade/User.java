package facade;

public class User {
    protected final String phoneNumber;
    protected final String name;

    User(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

}
