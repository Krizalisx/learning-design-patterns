package com.design.patterns.creational.factory_method.gui.creator;

import com.design.patterns.creational.factory_method.gui.product.Button;
import com.design.patterns.creational.factory_method.gui.product.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
