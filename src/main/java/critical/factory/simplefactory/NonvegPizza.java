package critical.factory.simplefactory;

public class NonvegPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Nonveg Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Nonveg Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Nonveg Pizza");
    }
}
