package abs_factory_by_inheritance;


//this is the abstract Factory Class
// which can be extended to create different kinds of pizza like NY, Chicago, Italian, so on
// 1. when we introduce a new genre of pizza, we don't need to violate OpenClosed principle
// as that can simply extend this pizzaStoreFactory, and we add all the types of pizza in that genre in the createPizza implementation of that class,
// viz ItalianPizzaFactory creates ItalianNeapolitan, ItalianChicken  pizza
// 2. This lets a factory create a bunch of related objects which aren't same type but are distant relatives
public abstract class PizzaStoreFactory {

    public static PizzaStoreFactory getFactory(String type){
        if (type.equalsIgnoreCase("NY")){
            return new NYPizzaStoreFactory();
        }
        return null;
    }

    public Pizza orderPizza(String type){
        Pizza pizza=createPizza(type);

        pizza.assortMaterials();
        pizza.bake();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
