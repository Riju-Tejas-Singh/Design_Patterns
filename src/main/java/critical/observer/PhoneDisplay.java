package critical.observer;

/**
 * Concrete Observer class
 */
public class PhoneDisplay implements Observer {
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    private void display() {
        System.out.println("Phone Display:: updated weather: " + weather);
    }
}
