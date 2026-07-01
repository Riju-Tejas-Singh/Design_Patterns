package critical.strategy.example1;

public class PassengerVehicle extends VehicleContext {

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
