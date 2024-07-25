package command.connected_hardware;

public class Music {
    private int volume;
    private float stationFrequency;

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume=volume;
        System.out.println("Volume set to: "+this.volume);
    }

    public float getStationFrequency(){
        return this.stationFrequency;
    }

    public void setStationFrequency(float stationFrequency){
        this.stationFrequency=stationFrequency;
        System.out.println("Station frequency set to: "+this.stationFrequency);
    }

    public void on(){
        System.out.println("Music on");
//        hardware physically turns on
    }

    public void off(){
        System.out.println("Music off");
        //        hardware physically turns off

    }

}
