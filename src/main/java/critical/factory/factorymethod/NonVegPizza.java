package critical.factory.factorymethod;

public class NonVegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Non-Veg Pizza");
    }
}
