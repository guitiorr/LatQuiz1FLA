package model;

import java.util.ArrayList;

public abstract class Cake {
	String type;
	String name;
	String softness;
	ArrayList<String> toppings = new ArrayList<String>();
	double price;

	public Cake(String type, String name, String softness, ArrayList<String>toppings, double price) {
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
	}

}
