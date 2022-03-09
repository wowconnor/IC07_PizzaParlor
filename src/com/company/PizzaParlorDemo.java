package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class PizzaParlorDemo {

	public static void main(String[] args) {

		
		int choice;
		char size;
		boolean pepperoni, sausage, mushrooms, vegan;
		Scanner keyboard = new Scanner(System.in);
		PizzaOrder myOrder = new PizzaOrder();
		
		do {
			System.out.println("~~~Welcome to MiraCosta's Pizza Parlor~~~");
			System.out.println("Enter (1) to order a Pizza");
			System.out.println("Enter (2) to view order");
			System.out.println("Enter (3) to checkout");
			choice = keyboard.nextInt();
			System.out.println();
			keyboard.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("What size pizza would you like (S, M, L)?");
				size = keyboard.next().toUpperCase().charAt(0);
				System.out.println("Please enter your toppings:");
				System.out.print("Pepperoni (Y/N)? ");
				pepperoni = keyboard.next().equalsIgnoreCase("y");
				System.out.print("Sausage   (Y/N)? ");
				sausage = keyboard.next().equalsIgnoreCase("y");
				System.out.print("Mushrooms (Y/N)? ");
				mushrooms = keyboard.next().equalsIgnoreCase("y");
				System.out.print("Vegan     (Y/N)? ");
				vegan = keyboard.next().equalsIgnoreCase("y");

				myOrder.addPizzaToOrder(size, pepperoni, sausage, mushrooms, vegan);
				break;

			case 2:
				System.out.println(myOrder);
				break;

			case 3:
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				System.out.println("Please pay " + currency.format(myOrder.calcCost()) + " at the counter.");
				break;	
			}
			System.out.println();
		} while (choice != 3);

		keyboard.close();
	}
	
}
