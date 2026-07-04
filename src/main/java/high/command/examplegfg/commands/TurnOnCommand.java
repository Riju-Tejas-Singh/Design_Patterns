package high.command.examplegfg.commands;

import high.command.examplegfg.receiver.ReceiverDevice;

public class TurnOnCommand implements Command {
    private final ReceiverDevice device;
    public TurnOnCommand(ReceiverDevice device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOn();
    }
}
