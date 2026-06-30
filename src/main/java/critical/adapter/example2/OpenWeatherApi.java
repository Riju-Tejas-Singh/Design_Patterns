package critical.adapter.example2;

/**
 * Adaptee or 3rd party class, you cannot change it
 */
class OpenWeatherApi {

    public double getTemperature(String city) {
        return 95;    // Fahrenheit
    }
}
