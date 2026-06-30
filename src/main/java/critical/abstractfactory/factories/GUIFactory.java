package critical.abstractfactory.factories;

import critical.abstractfactory.products.Button;
import critical.abstractfactory.products.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();

}
