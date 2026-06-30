package critical.strategy.example1;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
