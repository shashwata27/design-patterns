package command;

import command.commands.Command;
import command.commands.NoOpCommand;

public class AlexaDevice {

//    using these slots we can create different combinations like EverythingOn in onCommands and KitchenLightsOff in offCommands
    private Command[] onCommands;
    private Command[] offCommands;
    private int slots=3;

    AlexaDevice(){
        onCommands=new Command[slots];
        offCommands=new Command[slots];

        for(int i=0;i<slots;i++){
            onCommands[i]=new NoOpCommand();
            offCommands[i]=new NoOpCommand();
        }
    }

    public void setCommands(int slot, Command onCommand,Command offCommand){
        if(onCommand ==null || offCommand ==null){
            throw new IllegalArgumentException("Commands can't be null");
        }else{
            this.onCommands[slot]=onCommand;
            this.offCommands[slot]=offCommand;
        }
    }

    public void activateSlot(int slot){ onCommands[slot].execute();}
    public void deactivateSlot(int slot){ offCommands[slot].execute();}


    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("\n ___________Alexa Device Controller_________________\n");
        for(int i=0;i<slots;i++){
            sb.append("Slot no: "+i+" - "+ onCommands[i].getClass().getSimpleName()+" ["+onCommands.getClass().getSimpleName()+" ] - "+ offCommands[i].getClass().getSimpleName()+" ["+offCommands.getClass().getSimpleName()+"] \n");
        }
        return sb.toString();
    }
}
