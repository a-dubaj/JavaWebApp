package com.dubajandrzej.demo;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {
    private PersonRepository repository;
    private TextField firstName = new TextField("First name: ");
    private TextField lastName = new TextField("Last name: ");
    private EmailField email = new EmailField("Email");
    private Binder<Person> binder = new Binder<>(Person.class);
    private Grid<Person> grid = new Grid<>(Person.class);
    public MainView(PersonRepository repository) {
        this.repository = repository;

        add(getForm(), grid);

    }

    private Component getForm() {

    }
}