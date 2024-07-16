package absFactoryByInheritance;

public class Runner {
    public static void main(String[] args) {

//         but now runner needs to know concrete implementation of the factory, which is anti pattern
//        create factory to get these factories?
        PizzaStoreFactory factory=new NYPizzaStoreFactory();
        factory.orderPizza("cheese");
    }
}
