package command.commands;

import command.connected_hardware.KitchenLights;

public class KitchenLightsOnCommand implements Command{
    private KitchenLights kitchenLightsDevice;

    public KitchenLightsOnCommand(KitchenLights kitchenLights){
        this.kitchenLightsDevice=kitchenLights;
    }


    @Override
    public void execute() {
        this.kitchenLightsDevice.off();
    }
}
