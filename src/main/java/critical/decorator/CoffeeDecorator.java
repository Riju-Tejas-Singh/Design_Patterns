package critical.decorator;

/**
 * abstract decorator class
 * implements Coffee and also has its object
 * choose Composition over Inheritance
 */
public abstract class CoffeeDecorator implements Coffee{
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
}
