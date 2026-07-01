package high.abstractfactory.products;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Button");
    }
}
