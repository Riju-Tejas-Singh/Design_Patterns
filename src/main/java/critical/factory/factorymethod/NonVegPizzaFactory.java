package critical.factory.factorymethod;

public class NonVegPizzaFactory extends PizzaFactory {
    /**
     * Factory Method implementation
     */
    @Override
    public Pizza createPizza() {
        return new NonVegPizza();
    }
}
