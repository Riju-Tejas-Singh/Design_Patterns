package critical.strategy.example1;

public class OffroadVehicle extends VehicleContext {

    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}