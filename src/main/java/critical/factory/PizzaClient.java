package critical.factory;

public class PizzaClient {
    public static void main(String[] args) {
        Pizza p = PizzaFactory.createPizza("Veg");
        p.cut();
        Pizza p2 = PizzaFactory.createPizza("Non Veg");
        p2.bake();
    }
}
