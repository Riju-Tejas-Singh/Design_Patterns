package critical.decorator;

/**
 * simple coffee type, could also be expresso, latte, etc
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
