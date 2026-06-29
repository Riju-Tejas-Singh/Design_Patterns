package critical.factory;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
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
