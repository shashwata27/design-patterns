package command.commands;

import command.connected_hardware.KitchenLights;
import command.connected_hardware.Music;

public class EverythingOnCommand implements Command{
    private KitchenLights kitchenLightsDevice;
    private Music musicDevice;

    public EverythingOnCommand(KitchenLights kitchenLights, Music music){
        this.kitchenLightsDevice=kitchenLights;
        this.musicDevice=music;
    }

    @Override
    public void execute() {
        this.musicDevice.setVolume(10);
        this.musicDevice.setStationFrequency((float) 98.1);
        this.musicDevice.on();

        this.kitchenLightsDevice.on();
    }
}
