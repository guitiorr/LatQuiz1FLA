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
		cupcakeList = new ArrayList<Cupcake>();
		tartList = new ArrayList<Tart>();
	}
	
	public static Database getinstance() {
		if(instance == null) {
			instance = new Database();
		}
		
		return instance;
	}

	public ArrayList<Cake> getCakeList() {
		return cakeList;
	}

	public ArrayList<Cupcake> getCupcakeList() {
		return cupcakeList;
	}

	public ArrayList<Tart> getTartList() {
		return tartList;
	}

	public void setCakeList(ArrayList<Cake> cakeList) {
		this.cakeList = cakeList;
	}

	public void setCupcakeList(ArrayList<Cupcake> cupcakeList) {
		this.cupcakeList = cupcakeList;
	}

	public void setTartList(ArrayList<Tart> tartList) {
		this.tartList = tartList;
	}
	
	

	
	
	

}
