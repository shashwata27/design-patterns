package strategy;

public class WingsDontWork implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Wings are hurt. Can't fly :(");
    }
}
