package critical.factory.factorymethod;

public abstract class PizzaFactory {
    public void orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
    }

    /**
     * Factory Method , hence the name of this pattern
     */
    protected abstract Pizza createPizza();
}
