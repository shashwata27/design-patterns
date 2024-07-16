package factory;

public class FactoryIcecream {
    public static Icecream getIcecream(String type){
        if (type.trim().equalsIgnoreCase("MANGO")){
            return new MangoIcecream();
        } else if (type.trim().equalsIgnoreCase("VANILA-CRUNCHIES")) {
            return new VanilaCrunchiesIcecream(10);
        }
        return null;
    }
}
