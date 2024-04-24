package com.design.patterns.creational.factory_method.example.gui.creator;

import com.design.patterns.creational.factory_method.example.gui.product.Button;
import com.design.patterns.creational.factory_method.example.gui.product.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
