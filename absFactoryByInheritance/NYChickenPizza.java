package absFactoryByInheritance;

public class NYChickenPizza extends Pizza {
    @Override
    public void assortMaterials(){
        System.out.println("getting dough, chicken, spices");
    }

    @Override
    public void bake(){
        System.out.println("baking for 10min");
    }

    @Override
    public void pack() {
        System.out.println("packing in the big box");
    }
}
