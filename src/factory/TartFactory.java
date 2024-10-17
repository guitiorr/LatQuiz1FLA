package factory;

import java.util.ArrayList;

import model.Cake;
import model.Tart;

public class TartFactory extends CakeFactory{

	public TartFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cake createCake(String type, String name, String softness, ArrayList<String> toppings, double price, String paymentType) {
		return new Tart(type, name, softness, toppings, price, paymentType);
	}

}
