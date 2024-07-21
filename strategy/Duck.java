package strategy;

public abstract class  Duck {

//    when we want to pass fly behaviour to some ducks and some ducks don't know to fly
//    we don't want ducks who don't want to fly to throw an exception when we call the fly method
//    so by implementing strategy pattern we create noFlyBehaviour class which doesn't fly
    protected FlyBehaviour flyBehaviour;

    public Duck(FlyBehaviour flyBehaviour){
        this.flyBehaviour=flyBehaviour;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
