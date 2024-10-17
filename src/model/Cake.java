package model;

import java.util.ArrayList;

public abstract class Cake {
	String type;
	String name;
	String softness;
	ArrayList<String> toppings = new ArrayList<String>();
	double price;
	String paymentType;

	public Cake(String type, String name, String softness, ArrayList<String>toppings, double price, String paymentType) {
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
		this.paymentType = paymentType;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getSoftness() {
		return softness;
	}

	public ArrayList<String> getToppings() {
		return toppings;
	}

	public double getPrice() {
		return price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}

	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	

}
