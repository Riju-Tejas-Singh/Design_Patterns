package critical.strategy.example1;

public class ClientTest {

    public static void main(String[] args) {

        VehicleContext passenger = new PassengerVehicle();
        passenger.drive();

        VehicleContext sports = new SportsVehicle();
        sports.drive();

        VehicleContext offRoad = new OffroadVehicle();
        offRoad.drive();
    }
    //    Normal Drive Capability
    //    Sports Drive Capability
    //    Sports Drive Capability
}
