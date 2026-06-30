package critical.decorator;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " and Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10;
    }
}
