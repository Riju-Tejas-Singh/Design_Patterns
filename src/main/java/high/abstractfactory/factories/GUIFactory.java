package high.abstractfactory.factories;

import high.abstractfactory.products.Button;
import high.abstractfactory.products.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
