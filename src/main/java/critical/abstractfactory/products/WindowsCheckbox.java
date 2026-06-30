package critical.abstractfactory.products;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Rendering Windows Checkbox");
    }
}
