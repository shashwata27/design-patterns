package command.commands;

import command.connected_hardware.Music;

public class MusicOffCommand implements Command{
    private Music musicDevice;

    MusicOffCommand(Music music){
        this.musicDevice =music;
    }

    @Override
    public void execute() {
        this.musicDevice.setVolume(0);
        this.musicDevice.setStationFrequency((float) 0);
        this.musicDevice.off();
    }
}
