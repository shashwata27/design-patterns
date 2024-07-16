package factory;

public class MangoIcecream implements Icecream{
    String flavour= "Mango";

    public String getFlavour(){
        System.out.println("getting "+ flavour + " flavoured icecream !");
        return flavour;
    }

}
