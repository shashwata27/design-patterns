package abs_factory_by_inheritance;

public class Runner {
    public static void main(String[] args) {


        PizzaStoreFactory factory=new NYPizzaStoreFactory();
        factory.orderPizza("cheese");

//        but now runner needs to know concrete implementation of the factory, which is anti pattern
//        create factory to get these factories?
//        if we don't want to expose the concrete factory classes
        System.out.println("-------------------------------");
        PizzaStoreFactory factory2=PizzaStoreFactory.getFactory("NY");
        factory2.orderPizza("chicken");
    }
}
