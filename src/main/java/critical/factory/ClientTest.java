package critical.factory;

public class ClientTest {
    public static void main(String[] args) {
        Pizza p1 = PizzaFactory.createPizza("Veg");
        p1.cut();
        Pizza p2 = PizzaFactory.createPizza("Non Veg");
        p2.bake();
    }
    //    Cutting Veg Pizza...
    //    Baking Nonveg Pizza
}
