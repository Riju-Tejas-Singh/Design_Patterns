package critical.strategy.example1;

/**
 * Context class Vehicle being extended by real domain entities
 */
public class VehicleContext {

    private final DriveStrategy driveStrategy;

    public VehicleContext(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
