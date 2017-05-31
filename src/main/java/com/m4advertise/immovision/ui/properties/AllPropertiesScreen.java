package com.m4advertise.immovision.ui.properties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.m4advertise.immovision.services.PropertiesService;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

//pay attention to the order of annotations
@SpringView(name = AllPropertiesScreen.VIEW_NAME)
public class AllPropertiesScreen extends VerticalLayout implements View {
	public static final String VIEW_NAME = "allProperties";

	@Autowired
	private PropertiesService propertiesServices;

	@PostConstruct
	void init() {
		setMargin(true);
		setSpacing(true);
		addComponent(new Label("Fetch all properties. System says: " + propertiesServices.countAll()));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()
	}
}