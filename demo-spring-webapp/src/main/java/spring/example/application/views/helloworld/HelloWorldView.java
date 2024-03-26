package spring.example.application.views.helloworld;

import com.helger.commons.state.EMandatory;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.ContextMenu;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.seb.axainputtext.AxaInputText;
import org.vaadin.seb.components.LocalTextField;
import org.vaadin.seb.components.TestComponent;
import org.vaadin.seb.views.AbstractView;
import spring.example.application.views.MainLayout;

@PageTitle("Hello World")
@Route(value = "hello", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class HelloWorldView extends AbstractView {

    private TextField name;
    private Button sayHello;

    public HelloWorldView() {
        var icon = new Span();
        icon.addClassName("material-icons");
        icon.setText("house");
        add(icon);

        add(new TestComponent());

        addClassName("hello-world");

        var anotherIcon = new Span();
        anotherIcon.addClassName("icon-snowflake");
        anotherIcon.setText("test");
        add(anotherIcon);

        name = new TextField("Your name");
        sayHello = new Button("Say hello");
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        add(name, sayHello);

        add(new LocalTextField("Seb Input TextField"));

        MenuBar menuBar = new MenuBar();
        MenuItem menuItem = menuBar.addItem("Item 1");
        menuItem.getSubMenu().addItem("Sub Item 1", e -> Notification.show("Sub Item 1"));
        add(menuBar);


        Tabs tabMenu = new Tabs();
        tabMenu.add(new Tab(new Span("test 1")));
        tabMenu.add(new Tab(new Span("test 2")));
        //tabMenu.add(new Tab(new ContextMenu(new Span("test 1")), new ContextMenu(new Span("test 2"))));
        tabMenu.setOrientation(Tabs.Orientation.VERTICAL);
        add(tabMenu);

        add(new AxaInputText());
    }

    @Override
    public String viewName() {
        return "Hello World";
    }

}
