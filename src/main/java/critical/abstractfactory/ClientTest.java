package critical.abstractfactory;

import critical.abstractfactory.factories.GUIFactory;
import critical.abstractfactory.factories.MacFactory;
import critical.abstractfactory.factories.WindowsFactory;
import critical.abstractfactory.products.Button;
import critical.abstractfactory.products.Checkbox;

/**
 * only interact with GUIFactory
 */
public class ClientTest {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Checkbox windowsCheckbox = windowsFactory.createCheckbox();
        windowsButton.paint();
        windowsCheckbox.paint();
        GUIFactory macFactory = new MacFactory();
        Button macButton = macFactory.createButton();
        Checkbox macCheckbox = macFactory.createCheckbox();
        macButton.paint();
        macCheckbox.paint();
    }
    // output
    //    Rendering Windows Button
    //    Rendering Windows Checkbox
    //    Rendering Mac Button
    //    Rendering Mac Checkbox
}
