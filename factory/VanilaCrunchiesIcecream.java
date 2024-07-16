package factory;

public class VanilaCrunchiesIcecream implements Icecream{
    String flavour= "Vanila";
    int crunchiesWeight=0;

    public VanilaCrunchiesIcecream(int crunchiesWeight){
        this.crunchiesWeight=crunchiesWeight;
    }

    public String getFlavour(){
        System.out.println("getting "+ flavour + " flavoured icecream, with "+ crunchiesWeight +"gm crunchies !");
        return flavour;
    }

}
