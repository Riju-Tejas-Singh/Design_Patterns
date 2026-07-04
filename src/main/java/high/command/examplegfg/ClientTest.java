package high.command.examplegfg;

import high.command.examplegfg.commands.Command;
import high.command.examplegfg.commands.ChangeChannelCommand;
import high.command.examplegfg.commands.ChangeVolumeCommand;
import high.command.examplegfg.commands.TurnOffCommand;
import high.command.examplegfg.commands.TurnOnCommand;
import high.command.examplegfg.receiver.ChannelReceiverDevice;
import high.command.examplegfg.receiver.StereoDevice;
import high.command.examplegfg.receiver.TVDevice;
import high.command.examplegfg.receiver.VolumeReceiverDevice;

public class ClientTest {
    public static void main(String[] args) {
        // Create receivers
        ChannelReceiverDevice tv = new TVDevice();
        VolumeReceiverDevice stereo = new StereoDevice();

        // Create commands
        Command turnOnTV = new TurnOnCommand(tv);
        Command turnOffTV = new TurnOffCommand(tv);
        Command adjustVolume = new ChangeVolumeCommand(stereo);
        Command changeChannel = new ChangeChannelCommand(tv);

        // Create invoker
        RemoteControlInvoker remoteControl = new RemoteControlInvoker();

        // Test commands
        remoteControl.setCommand(turnOnTV);
        remoteControl.pressButton();

        remoteControl.setCommand(turnOffTV);
        remoteControl.pressButton();

        remoteControl.setCommand(adjustVolume);
        remoteControl.pressButton();

        remoteControl.setCommand(changeChannel);
        remoteControl.pressButton();
    }
    //    TV is turned on.
    //    TV is turned off.
    //    Stereo volume changed.
    //    TV channel changed.
}
