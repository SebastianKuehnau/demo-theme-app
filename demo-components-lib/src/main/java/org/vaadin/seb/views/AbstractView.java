package org.vaadin.seb.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import org.vaadin.seb.components.KeyboardIcon;

import javax.swing.*;

public abstract class AbstractView extends VerticalLayout {

    public AbstractView() {
        H1 header = new H1(viewName());
        header.setClassName("header");

        var icon = new Span();
        icon.addClassName("material-icons");
        icon.setText("house");

        var keyboardIcon = new KeyboardIcon();
        add(keyboardIcon);

        add(header, icon, keyboardIcon);
    }

    public abstract String viewName() ;
}

