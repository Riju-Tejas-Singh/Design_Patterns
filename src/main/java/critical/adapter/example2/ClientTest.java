package critical.adapter.example2;

public class ClientTest {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherAdapter(new OpenWeatherApi());
        double Celsius = weatherService.getTemperatureInCelsius("Delhi");
        System.out.println("Temperature in Celsius is: " + Celsius); // 35
    }
}
