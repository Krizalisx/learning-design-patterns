package com.design.patterns.creational.factory_method.example.gui.creator;

import com.design.patterns.creational.factory_method.example.gui.product.Button;
import com.design.patterns.creational.factory_method.example.gui.product.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
