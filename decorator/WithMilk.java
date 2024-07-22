package decorator;

public class WithMilk extends CoffeeDecorator{
    Coffee coffee;

    public WithMilk(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost() + .05;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + " Added Milk";
    }
}
