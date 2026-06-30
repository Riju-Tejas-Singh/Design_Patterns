package critical.adapter.example2;

/**
 * Target Interface our client wants to use
 */
public interface WeatherService {
    double getTemperatureInCelsius(String city);
}
