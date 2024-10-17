package database;

import java.util.ArrayList;

import model.Cake;
import model.Cupcake;
import model.Tart;

public class Database {
	
	ArrayList<Cake> cakeList;
	ArrayList<Cupcake> cupcakeList;
	ArrayList<Tart> tartList;
	
	private static volatile Database instance = null;
	
	public Database() {
		cakeList = new ArrayList<Cake>();
	}
	
	public static Database getinstance() {
		if(instance == null) {
			instance = new Database();
		}
		
		return instance;
	}

	
	
	

}
