package critical.strategy.example1;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}