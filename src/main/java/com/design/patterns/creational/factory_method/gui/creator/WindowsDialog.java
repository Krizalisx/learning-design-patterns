package com.design.patterns.creational.factory_method.gui.creator;

import com.design.patterns.creational.factory_method.gui.product.Button;
import com.design.patterns.creational.factory_method.gui.product.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
