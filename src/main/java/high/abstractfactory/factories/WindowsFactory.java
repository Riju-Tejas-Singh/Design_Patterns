package high.abstractfactory.factories;

import high.abstractfactory.products.Button;
import high.abstractfactory.products.Checkbox;
import high.abstractfactory.products.WindowsButton;
import high.abstractfactory.products.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
