package high.command.examplegfg;

import high.command.examplegfg.commands.Command;

public class RemoteControlInvoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}
