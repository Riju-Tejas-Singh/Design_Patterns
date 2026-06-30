package critical.strategy.example1;

public class ClientTest {

    public static void main(String[] args) {

        Vehicle passenger = new PassengerVehicle();
        passenger.drive();

        Vehicle sports = new SportsVehicle();
        sports.drive();

        Vehicle offRoad = new OffroadVehicle();
        offRoad.drive();
    }
}
