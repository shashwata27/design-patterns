package abs_factory_by_inheritance;

public class NYPizzaStoreFactory extends  PizzaStoreFactory{
    @Override
    protected Pizza createPizza(String type) {
        if(type=="cheese"){
            return new NYCheeseHeavenPizza();
        }else if(type=="chicken"){
            return new NYChickenPizza();
        }
        return null;
    }
}
