package abs_factory_by_inheritance;

public class NYCheeseHeavenPizza extends Pizza{
    @Override
    public void assortMaterials(){
        System.out.println("getting dough, 7 types of cheese, spices");
    }

    @Override
    public void bake(){
        System.out.println("baking for 5min");
    }

    @Override
    public void pack() {
        System.out.println("packing in the big box");
    }
}
