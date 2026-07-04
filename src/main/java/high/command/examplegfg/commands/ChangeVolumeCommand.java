package high.command.examplegfg.commands;

import high.command.examplegfg.receiver.VolumeReceiverDevice;

public class ChangeVolumeCommand implements Command {
    private final VolumeReceiverDevice device;
    public ChangeVolumeCommand(VolumeReceiverDevice device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.changeVolume();
    }
}
