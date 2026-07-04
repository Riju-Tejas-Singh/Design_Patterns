package high.command.examplegfg.receiver;

public class TVDevice implements ChannelReceiverDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off.");
    }
    @Override
    public void changeChannel() {
        System.out.println("TV channel changed.");
    }
}

