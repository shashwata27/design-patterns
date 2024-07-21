package observer;

public class CurrentWeather implements Observer{
    private int curTemp;
    private float curHumidity;

    public CurrentWeather(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(int temp, float humidity) {
        this.curHumidity=humidity;
        this.curTemp=temp;
        display();
    }

    public void display(){
        System.out.println("Cur temp"+ curTemp);
        System.out.println("Cur Humidity" + curHumidity);
    }
}
