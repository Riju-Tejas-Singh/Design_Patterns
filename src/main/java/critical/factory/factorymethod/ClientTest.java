package critical.factory.factorymethod;

public class ClientTest {
    public static void main(String[] args) {
        PizzaFactory pf1 = new VegPizzaFactory();
        PizzaFactory pf2 = new NonVegPizzaFactory();
        pf1.orderPizza();
        pf2.orderPizza();
    }
    //    prepare Veg Pizza
    //    prepare Non-Veg Pizza
}
