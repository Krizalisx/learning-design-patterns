package com.design.patterns.behavioral.chain_of_responsibility.gui_help.component;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Container extends Component {

    protected List<Component> children;

    public void add(Component component) {
        children.add(component);
        component.container = this;
    }
}
