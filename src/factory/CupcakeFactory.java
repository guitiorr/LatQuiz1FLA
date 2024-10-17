package factory;

import java.util.ArrayList;

import model.Cake;
import model.Cupcake;

public class CupcakeFactory extends CakeFactory{

	public CupcakeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cake createCake(String type, String name, String softness, ArrayList<String> toppings, double price) {
		return new Cupcake(type, name, softness, toppings, price);
	}
	
//	public Cake createCake(String type, String name, String softness, ArrayList<String> toppings, double price) {
//		return new Cupcake(type, name, softness, toppings, price);
//	}
	
	

}
