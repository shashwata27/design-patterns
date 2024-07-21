package strategy;

public class Runner {

    public static void main(String[] args) {
//    lets you create classes of behaviour and pass it objects who internally use them

        FlyBehaviour flyWithWings=new FlyWithWings();

        Duck mallardDuck=new MallardDuck(flyWithWings);
        mallardDuck.performFly();


        System.out.println("------------------------------");
        System.out.println("------------------------------");


        FlyBehaviour noFly=new WingsDontWork();
        mallardDuck.setFlyBehaviour(noFly);
        mallardDuck.performFly();

    }

}
