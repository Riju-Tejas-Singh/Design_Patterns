package critical.strategy.example1;

public class SportsVehicle extends VehicleContext {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
