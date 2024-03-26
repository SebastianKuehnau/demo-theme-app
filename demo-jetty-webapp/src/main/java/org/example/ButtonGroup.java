package org.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

@Tag("button-group")
public class ButtonGroup extends Component {

    private final FlexLayout buttonLayout = new FlexLayout();
    public ButtonGroup(Button... buttons) {
        buttonLayout.add(buttons);
        getElement().appendChild(buttonLayout.getElement());
    }
}
