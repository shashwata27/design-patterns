package command.commands;

import command.connected_hardware.KitchenLights;
import command.connected_hardware.Music;

public class EverythingOffCommand implements  Command{
    private KitchenLights kitchenLightsDevice;
    private Music musicDevice;

    public EverythingOffCommand(KitchenLights kitchenLights, Music music){
        this.kitchenLightsDevice=kitchenLights;
        this.musicDevice=music;
    }

    @Override
    public void execute() {

        this.musicDevice.setVolume(0);
        this.musicDevice.setStationFrequency((float) 0);
        this.musicDevice.off();

        this.kitchenLightsDevice.off();
    }
}
