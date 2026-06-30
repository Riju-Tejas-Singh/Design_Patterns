package critical.strategy.example1;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}