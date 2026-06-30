package critical.abstractfactory.factories;

import critical.abstractfactory.products.Button;
import critical.abstractfactory.products.Checkbox;
import critical.abstractfactory.products.MacButton;
import critical.abstractfactory.products.MacCheckbox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
