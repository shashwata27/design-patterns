package command;

import command.commands.EverythingOffCommand;
import command.commands.EverythingOnCommand;
import command.commands.KitchenLightsOffCommand;
import command.commands.KitchenLightsOnCommand;
import command.connected_hardware.KitchenLights;
import command.connected_hardware.Music;

public class Runner {
    public static void main(String[] args) {
//        encapsulate all info need to perform an action or trigger an event at a later time
//        we use polymorphism to call the same function signature that does different stuff when we slide different classes in that slot

        AlexaDevice alexaDevice=new AlexaDevice();

        KitchenLights kitchenLights=new KitchenLights();

        alexaDevice.setCommands(0, new KitchenLightsOnCommand(kitchenLights), new KitchenLightsOffCommand(kitchenLights));

        System.out.println(alexaDevice);
        alexaDevice.activateSlot(0);
        alexaDevice.deactivateSlot(0);


        Music music=new Music();

        alexaDevice.setCommands(1, new EverythingOnCommand(kitchenLights, music), new EverythingOffCommand(kitchenLights,music));

        System.out.println(alexaDevice);

        alexaDevice.activateSlot(1);
    }
}
