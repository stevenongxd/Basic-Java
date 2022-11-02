package main;

import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		double price;
		int quantity = 0;
		int discount = 0;
		
		System.out.println("ES Companies Portal - Cashier App");
		System.out.println("====================================");
		System.out.print("Input item's name: ");
		name = scan.nextLine();
		
		System.out.print("Input item's price [use decimal]: ");
		price = scan.nextDouble();
		
		do{
			System.out.print("Input item's quantity [1..20]: ");
			quantity = scan.nextInt();
		}while (quantity < 1 || quantity > 20);
		
		
		do{
			System.out.print("Input item's discount [0..50]: ");
			discount = scan.nextInt();
		}while (discount < 0 || discount > 50);
		
		System.out.println("\n\n");
		
		System.out.println("ES Companies Portal - Invoice");
		System.out.println("===============================");
		System.out.println("Item's name     : " + name);
		System.out.println("Item's price    : $" + price);
		System.out.println("Item's quantity : " + quantity);
		System.out.println("Item's discount : " + discount + "%\n");

		
		double total = 0;
		total = price * quantity * (100 - discount)/100;
		
		System.out.println("You have to pay: $" + total);
		
		double money = 0;
		System.out.print("Input your money [use decimal]: $");
		money = scan.nextDouble();
		
		if(money < total) {
			System.out.println("Not Enough Money!");
		}else {
			System.out.println("");
			
			System.out.println("Thanks For Purchashing!");
			
			double change = 0;
			change = money - total;
			System.out.println("Your change: $" + change);
		}
			
	}

}
