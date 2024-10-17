package factory;

import java.util.ArrayList;

import model.Cake;
import model.Cupcake;
import model.Tart;

public abstract class CakeFactory {
	
	public abstract Cake createCake(String type, String name, String softness, ArrayList<String> toppings, double price);
	
//	public abstract Cake createCake(String type, String name, String softness, ArrayList<String> toppings, double price) {
//		if(type.equals("Cupcake")) {
//			return new Cupcake(type, name, softness, toppings, price);
//		}
//		else if(type.equals("Tart")) {
//			return new Tart(type, name, softness, toppings, price);
//		}
//		else {
//			return null;
//		}
//	}

	public CakeFactory() {
		// TODO Auto-generated constructor stub
	}

}
