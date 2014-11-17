package com.beimin.eveapi.model.eve;

import java.util.ArrayList;

public class StatsList<E> extends ArrayList<E> {
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}