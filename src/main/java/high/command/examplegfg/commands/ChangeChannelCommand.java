package high.command.examplegfg.commands;

import high.command.examplegfg.receiver.ChannelReceiverDevice;

public class ChangeChannelCommand implements Command {
    private final ChannelReceiverDevice device;
    public ChangeChannelCommand(ChannelReceiverDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.changeChannel();
    }
}
