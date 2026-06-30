package critical.observer;

public class ClientTest {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        // Register observers
        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather changes
        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
        weatherStation.setWeather("Cloudy");

        // Remove one observer
        weatherStation.removeObserver(tvDisplay);

        // Notify remaining observer
        weatherStation.setWeather("Windy");
    }

    //    Phone Display:: updated weather: Sunny
    //    TV Display:: weather updated: Sunny
    //    Phone Display:: updated weather: Rainy
    //    TV Display:: weather updated: Rainy
    //    Phone Display:: updated weather: Cloudy
    //    TV Display:: weather updated: Cloudy
    //    Phone Display:: updated weather: Windy

}
