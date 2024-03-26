package org.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.seb.components.LocalTextField;
import org.vaadin.seb.views.AbstractView;

import javax.swing.*;

/**
 * The main view contains a button and a click listener.
 */
@Route("main")
@RouteAlias("")
public class MainView extends AbstractView {

    public MainView() {
        Button button = new Button("Click me",
                event -> Notification.show("Clicked!"));
        add(button, new LocalTextField("example input"));
        add(new Checkbox("Checkbox"));

//        add(new ButtonGroup(
//                new Button("Button 1", event -> Notification.show("Event 1")),
//                new Button("Button 2", event -> Notification.show("Event 2")),
//                new Button("Button 3", event -> Notification.show("Event 3"))
//        ));
    }

    @Override
    public String viewName() {
        return "Main";
    }
}
