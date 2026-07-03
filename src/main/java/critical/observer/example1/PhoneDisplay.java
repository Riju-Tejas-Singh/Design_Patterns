package critical.observer.example1;

/**
 * Concrete Observer class
 */
public class PhoneDisplay implements Observer {
    @Override
    public void update(String weather) {
        System.out.println("Phone Display:: updated weather: " + weather);
    }
}
