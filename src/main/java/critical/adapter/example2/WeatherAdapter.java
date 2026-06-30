package critical.adapter.example2;

/**
 * Adapter class implementing the target class
 */
public class WeatherAdapter implements WeatherService {
    private final OpenWeatherApi openWeatherApi;
    public WeatherAdapter(OpenWeatherApi openWeatherApi) {
        this.openWeatherApi = openWeatherApi;
    }

    public double getTemperatureInCelsius(String city) {
        double fahrenheit = openWeatherApi.getTemperature(city);
        return (fahrenheit - 32) * 5 / 9;
    }
}
