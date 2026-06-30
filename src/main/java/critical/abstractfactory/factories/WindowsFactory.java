package critical.abstractfactory.factories;

import critical.abstractfactory.products.Button;
import critical.abstractfactory.products.Checkbox;
import critical.abstractfactory.products.WindowsButton;
import critical.abstractfactory.products.WindowsCheckbox;

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
