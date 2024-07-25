package command.commands;

import command.connected_hardware.Music;

public class MusicOnCommand implements Command{
    private Music musicDevice;

    MusicOnCommand(Music music){
        this.musicDevice =music;
    }

    @Override
    public void execute() {
        this.musicDevice.setVolume(10);
        this.musicDevice.setStationFrequency(98.1f);
        this.musicDevice.on();
    }
}
