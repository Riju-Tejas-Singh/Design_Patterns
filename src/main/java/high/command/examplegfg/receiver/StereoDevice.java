package high.command.examplegfg.receiver;

public class StereoDevice implements VolumeReceiverDevice {

    @Override
    public void turnOn() {
        System.out.println("Stereo is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is turned off.");
    }

    @Override
    public void changeVolume() {
        System.out.println("Stereo volume changed.");
    }
}
