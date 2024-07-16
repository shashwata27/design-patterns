package absFactoryByInheritance;

public abstract class Pizza {
    public abstract void assortMaterials();
    public abstract void bake();
    public void cut(){
        System.out.println("cutting pizza into 8 slices");
    }

    public abstract void pack();
}
