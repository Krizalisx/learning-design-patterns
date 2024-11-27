package com.design.patterns.creational.factory_method.gui;

import com.design.patterns.creational.factory_method.gui.creator.Dialog;
import com.design.patterns.creational.factory_method.gui.creator.HtmlDialog;
import com.design.patterns.creational.factory_method.gui.creator.WindowsDialog;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure("HTML");
        runBusinessLogic();

        configure("Windows");
        runBusinessLogic();

    }

    /**
     * The concrete factory is usually chosen depending on configuration or environment options.
     */
    private static void configure(String property) {
        if ("Windows".equals(property)) {
            dialog = new WindowsDialog();
        } else if ("HTML".equals(property)) {
            dialog = new HtmlDialog();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * All of the client code should work with factories and products through abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
