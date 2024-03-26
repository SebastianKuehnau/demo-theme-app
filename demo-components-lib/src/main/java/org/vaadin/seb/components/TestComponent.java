package org.vaadin.seb.components;

import com.vaadin.flow.component.html.Span;

public class TestComponent extends Span {

    public TestComponent() {
        var icon = new Span();
        icon.addClassName("material-icons");
        icon.setText("phone");
        add(icon);
    }
}
