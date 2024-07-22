package decorator;

public class Latte extends Coffee{
    public Latte(){
        this.description="Latte";
    }
    @Override
    public double cost() {
        return 3.29;
    }
}
