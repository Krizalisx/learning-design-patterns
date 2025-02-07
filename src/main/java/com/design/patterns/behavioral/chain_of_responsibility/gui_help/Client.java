package com.design.patterns.behavioral.chain_of_responsibility.gui_help;

import com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.elements.Button;
import com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.elements.Dialog;
import com.design.patterns.behavioral.chain_of_responsibility.gui_help.component.elements.Panel;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {
        Dialog dialog = new Dialog(new ArrayList<>(), "Dialog help message");
        Panel panel = new Panel(new ArrayList<>(), "Panel help message");
        Button ok = new Button();
        Button cancel = new Button();
        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);

        ok.showHelp();
        panel.showHelp();
        dialog.showHelp();
    }
}
