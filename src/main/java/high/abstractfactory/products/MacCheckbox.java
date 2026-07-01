package high.abstractfactory.products;

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Mac Checkbox");
    }
}
