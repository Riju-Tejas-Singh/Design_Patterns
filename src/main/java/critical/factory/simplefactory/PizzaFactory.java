package critical.factory.simplefactory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type) {
            case "Veg":
                return new VegPizza();
            case "Non Veg":
                return new NonvegPizza();
            default:
                throw new IllegalArgumentException("Pizza type not found");
        }
    }
}
