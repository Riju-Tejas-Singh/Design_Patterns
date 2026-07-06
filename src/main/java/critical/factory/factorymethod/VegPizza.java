package critical.factory.factorymethod;

public class VegPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare Veg Pizza");
    }
}
