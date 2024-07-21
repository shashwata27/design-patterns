package observer;

import java.util.ArrayList;

public class ForecastWeather implements Observer{

    private ArrayList historicalData;

    ForecastWeather(Subject subject){
        subject.registerObserver(this);
        this.historicalData=new ArrayList();
    }

    @Override
    public void update(int temp, float humidity) {
        this.historicalData.add(temp + " "+ humidity);
        displayHistory();

    }

    public void displayHistory(){
        System.out.println("Historical Data");
        System.out.println(this.historicalData);
    }
}
