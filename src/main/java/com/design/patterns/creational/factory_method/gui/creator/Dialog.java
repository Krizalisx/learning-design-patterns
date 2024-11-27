package com.design.patterns.creational.factory_method.gui.creator;

import com.design.patterns.creational.factory_method.gui.product.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It should have some core business logic which needs different products to
 * be created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // other code

        createButton().render();
    }

    public abstract Button createButton();

}
