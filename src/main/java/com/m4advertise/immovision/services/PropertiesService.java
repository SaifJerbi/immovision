package com.m4advertise.immovision.services;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class PropertiesService {

	public Long countAll() {
		return (long) ((Math.random() * 9000) + 1000);
	}

}
