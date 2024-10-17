package database;

import java.util.ArrayList;

import model.Cake;

public class Database {
	
	ArrayList<Cake> cakeList = new ArrayList<Cake>();
	
	private static volatile Database instance = null;
	
	public static Database getinstance() {
		if(instance == null) {
			instance = new Database();
		}
		
		return instance;
	}

	public Database() {
		cakeList = null;
	}
	
	

}
