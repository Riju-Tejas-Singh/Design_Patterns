package high.abstractfactory.factories;

import high.abstractfactory.products.Button;
import high.abstractfactory.products.Checkbox;
import high.abstractfactory.products.MacButton;
import high.abstractfactory.products.MacCheckbox;

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
