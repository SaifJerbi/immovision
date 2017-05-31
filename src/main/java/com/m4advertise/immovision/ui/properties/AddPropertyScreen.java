package com.m4advertise.immovision.ui.properties;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = AddPropertyScreen.VIEW_NAME)
public class AddPropertyScreen extends VerticalLayout implements View {
	public static final String VIEW_NAME = "addProperty";

	@PostConstruct
	void init() {
		setMargin(true);
		setSpacing(true);
		TextField title = new TextField("Title");
		TextArea description = new TextArea("Description");

		addComponent(title);
		addComponent(description);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()
	}
}