package critical.observer.example1;

public class ClientTest {
    public static void main(String[] args) {
        WeatherStationSubject weatherStation = new WeatherStationSubject();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Register observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Cloudy");

        // Remove one observer
        weatherStation.removeObserver(tvDisplay);

        // Notify remaining observer
        weatherStation.setWeather("Windy");
    }

    //    Phone Display:: updated weather: Sunny
    //    TV Display:: weather updated: Sunny
    //    Phone Display:: updated weather: Cloudy
    //    TV Display:: weather updated: Cloudy
    //    Phone Display:: updated weather: Windy

}
