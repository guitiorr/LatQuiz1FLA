package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import database.Database;

public class Main {
	
	public static Scanner sc = new Scanner(System.in);

	public Main() {
		int reset = 1;
		int choice = 0;
		int pass = 1;
		String typeInput = null;
		String nameInput = null;
		String softnessInput = null;
		String confirmAddTopping = null;
		String toppingInput = null;
		double priceInput = 0;
		String inputPaymentType = null;
		ArrayList<String> toppings = new ArrayList<String>();
		
		
		Database instance = Database.getinstance();
		
		while(reset == 1) {
			
			while(true) {
				try {
					System.out.println("Nom Nom Co.");
					System.out.println("===========");
					
					System.out.println("1. Bake Confectionary");
					System.out.println("2. View Confectionary Order");
					System.out.println("3. Exit");
					System.out.print(">> ");
					choice = sc.nextInt();
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid Input!");
					sc.next();
				}
			};
			
			sc.nextLine();
			
			switch(choice) {
			
			case 1:
				
				// INPUT TYPE
				while(true) {
					try {
						pass = 0;
						while(pass == 0) {
							System.out.print("Input confectionary type [Cupcake | Tart][Case Sensitive]: ");
							typeInput = sc.nextLine();
							
							if(typeInput.equals("Cupcake") || typeInput.equals("Tart")) {
								pass = 1;
								break;
							}
							else {
								pass = 0;
							}
						}
						break;
					}
					catch(Exception E) {
						System.out.println("Invalid Input!");
						sc.next();
					}
				}
				
				
				// INPUT NAME
				while(true) {
					try {
						pass = 0;
						while(pass == 0) {
							System.out.print("Input confectionary name [length between 5 - 15]: ");
							nameInput = sc.nextLine();
							if(nameInput.length() < 5) {
								System.out.println("Length must be more than 5!");
								pass = 0;
							}
							else if(nameInput.length() > 15) {
								System.out.println("Length must be less than 15!");
								pass = 0;
							}
							else {
								pass = 1;
								break;
							}
						}
						break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input!");
						sc.next();
					}
				}
				
				// INPUT SOFTNESS
				while(true) {
					try {
						pass = 0;
						
						while(pass == 0) {
							System.out.print("Input confectionary softness [Fluffy | Medium | Hard][Case Sensitive]: ");
							softnessInput = sc.nextLine();
							if(softnessInput.equals("Fluffy") || softnessInput.equals("Medium") || softnessInput.equals("Hard")) {
								pass = 1;
								break;
							}
							else {
								pass = 0;
							}
						}
						
						break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input!");
						sc.next();
					}
				}
				
				// INPUT BOOLEAN ADD ADDITIONAL TOPPING?
				while(true) {
					try {
						pass = 0;
						
						while(pass == 0) {
							System.out.print("Adding additional topping [Y | N][Case Sensitive]: ");
							confirmAddTopping = sc.next();
							
							if(confirmAddTopping.equals("Y") || confirmAddTopping.equals("N")) {
								pass = 1;
								break;
							}
							else {
								pass = 0;
							}
						}
						
						break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input!");
						sc.next();
					}
				}
				
				sc.nextLine();
				//IF YES ADD TOPPING INPUT TOPPINGS
				if(confirmAddTopping.equals("Y")) {
					while(true) {
						try {
							pass = 0;
							
							// TOPPING 1
							while(pass == 0) {
								System.out.print("Input topping 1[length between 1 - 10]: ");
								toppingInput = sc.nextLine();
								if(toppingInput.length() < 1) {
									System.out.println("Length must be more than 1!");
									pass = 0;
								}
								else if(toppingInput.length() > 10) {
									System.out.println("Length must be less than 10!");
									pass = 0;
								}
								else {
									toppings.add(toppingInput);
									pass = 12;
									break;
								}
							}
							
							// TOPPING 2
							while(pass == 12) {
								System.out.print("Input topping 2[length between 1 - 10]: ");
								toppingInput = sc.nextLine();
								if(toppingInput.length() < 1) {
									System.out.println("Length must be more than 1!");
									pass = 12;
								}
								else if(toppingInput.length() > 10) {
									System.out.println("Length must be less than 10!");
									pass = 12;
								}
								else {
									toppings.add(toppingInput);
									pass = 13;
									break;
								}
							}
							
							// TOPPING 3
							while(pass == 13) {
								System.out.print("Input topping 3[length between 1 - 10]: ");
								toppingInput = sc.nextLine();
								if(toppingInput.length() < 1) {
									System.out.println("Length must be more than 1!");
									pass = 13;
								}
								else if(toppingInput.length() > 10) {
									System.out.println("Length must be less than 10!");
									pass = 13;
								}
								else {
									toppings.add(toppingInput);
									pass = 1;
									break;
								}
							}
							
							break;
						}
						catch(Exception e) {
							System.out.println("Invalid Input!");
							sc.next();
						}
					}
				}
				
				// INPUT PRICE
				while(true) {
					try {
						pass = 0;
						
						while(pass == 0) {
							System.out.print("Input confectionary price [10.0 - 50.0]: ");
							priceInput = sc.nextDouble();
							
							if(priceInput < 10.0) {
								System.out.println("Minimum price is 10.0");
								pass = 0;
							}
							else if(priceInput > 50.0) {
								System.out.println("Maximum price is 50.0");
								pass = 0;
							}
							else {
								pass = 1;
								break;
							}
						}
						
						break;
					}
					catch(Exception e) {
						System.out.println("Invalid Input!");
						sc.next();
					}
				}
				
				
				//INPUT PAYMENT TYPE
				while(true) {
					try {
						pass = 0;
						
						while(pass == 0) {
							System.out.print("What kind of payment [Cash | Transfer | Crypto][Case Sensitive]: ");
							inputPaymentType = sc.next();
							
							if(inputPaymentType.equals("Cash") || inputPaymentType.equals("Transfer") || inputPaymentType.equals("Crypto")) {
								pass = 1;
								break;
							}
							
						}
						
						break;
					}
					catch(Exception e) {
						System.out.println("Invalid input!");
						sc.next();
					}
				}
				
				
				
				System.out.println("Confectionary Baked!");
				System.out.println("Press enter to continue...");
				sc.nextLine();
				reset = 1;
				sc.nextLine();
				
				break;
				
			case 2:
				
				
				
				
				
				
				break;
				
			case 3:
				System.out.println("Exiting...");
				reset = 0;
				break;
				
			default :
				break;
			
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
