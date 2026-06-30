package critical.strategy.example1;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
