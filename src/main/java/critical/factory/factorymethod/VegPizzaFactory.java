package critical.factory.factorymethod;

public class VegPizzaFactory extends PizzaFactory {
    /**
     * Factory Method implementation
     */
    @Override
    public Pizza createPizza() {
        return new VegPizza();
    }
}
