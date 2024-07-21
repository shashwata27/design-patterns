package observer;

import java.util.Random;

public class Runner {
//      when multiple objects depend on a single object
//    dependent objects get notifications of any change in the main object
//    this dependents/observers subscribes to a subject/topic/publisher to get these notifications
public static void main(String[] args) throws InterruptedException {
    WeatherStation weatherStation=new WeatherStation();

    CurrentWeather currentWeather=new CurrentWeather(weatherStation);
    ForecastWeather forecastWeather=new ForecastWeather(weatherStation);

//    emulate update in real time
    for(int i=0;i<5;i+=1){
        System.out.println("\n ------ UPDATE  "+ i +" ------");

        int randTemp=getRandom(-50,40);
        float randHumidit=(float) getRandom(0,100);

        weatherStation.measurementsChanged(randTemp,randHumidit);

        Thread.sleep(200);
    }
}

private static int getRandom(int min, int max){
    Random random=new Random();
    return random.nextInt(max+1-min)+min;
}
}
