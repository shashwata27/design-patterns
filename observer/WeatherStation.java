package observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements Subject{
    private Set<Observer> observers;
    private int temp;
    private float humidity;

    public WeatherStation(){
        this.observers=new HashSet<Observer>();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(this.observers.contains(observer)){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o->o.update(temp,humidity));
    }

    public void measurementsChanged(int temp,float humidity){
        this.temp=temp;
        this.humidity=humidity;
        notifyObserver();
    }
}
