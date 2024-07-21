package factory;


//Factory class takes the responsibility of creating different types of objects of a super class/interface
//using parameters
// abstracting away the object creation logic
// client doesn't need to know implementation logic of object creation, loose coupling
public class Factory {
    public static void main(String[] args) {
        Icecream mango= FactoryIcecream.getIcecream("MANGO");
        mango.getFlavour();

        Icecream vanila=FactoryIcecream.getIcecream("VANILA-CRUNCHIES");
        vanila.getFlavour();
    }
}
