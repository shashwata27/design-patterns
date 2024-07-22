package decorator;

public class WithSugar extends  CoffeeDecorator{
    Coffee coffee;

    public WithSugar(Coffee coffee){
        this.coffee=coffee;
    }
    @Override
    public double cost() {
        return this.coffee.cost()+ 0.25;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Added Sugar";
    }
}
