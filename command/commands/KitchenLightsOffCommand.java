package command.commands;

import command.connected_hardware.KitchenLights;

public class KitchenLightsOffCommand implements Command{
    private KitchenLights kitchenLightsDevice;

    public KitchenLightsOffCommand(KitchenLights kitchenLights){
        this.kitchenLightsDevice=kitchenLights;
    }

    @Override
    public void execute() {
        this.kitchenLightsDevice.off();
    }
}
