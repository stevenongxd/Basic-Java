package main;

import java.util.Scanner;

public class Main {

	public Main() {
		 Scanner scan = new Scanner(System.in);
		 
		 int menu = 0, quantity = 0;
		 
		 System.out.println("ES Companies Portal - Cashier App 2");
		 System.out.println("================================");
		 System.out.println("1. Keyboard - $49.99");
		 System.out.println("2. Mouse - $19.99");
		 System.out.println("3. Monitor - $99.99");
		 System.out.println("4. Exit");
		 System.out.printf("Choose: ");
		 menu = scan.nextInt(); scan.nextLine();
		 
		 if (menu >= 1 && menu <= 4) {
			 
			 if (menu != 4) {
				 System.out.printf("Input Quantity [1..20]: ");
				 quantity = scan.nextInt();
				 scan.nextLine();
				 
				 if (quantity > 20) {
					 System.out.println("Out of stock!");
				 } else {
					 System.out.println("\n\n\n\n\n\n\n");
					 double total = 0, money = 0;
					 
					 System.out.println("ES Companies Portail - Invoice");
					 System.out.println("==============================");
					 
					 switch(menu) {
					 case 1:
						 System.out.println("Item's name : Keyboard");
						 System.out.println("Price       : $49.99");
						 System.out.println("Quantity    : " + quantity);
						 
						 total = 49.99*quantity;
						 System.out.println("\nTotal     : " + total);
						 System.out.printf("Input your money [min. " + total + "]: ");
						 money = scan.nextDouble(); scan.nextLine();
						 
						 if (money < total) {
							 System.out.println("Not Enough Money");
						 } else {
							 System.out.println("Thanks for purchasing!");
							 System.out.println("Your Change: " + (money - total));
						 }
						 break;
						 
					 case 2:
						 System.out.println("Item's name : Mouse");
						 System.out.println("Price       : $19.99");
						 System.out.println("Quantity    : " + quantity);
						 
						 total = 19.99*quantity;
						 System.out.println("\nTotal     : " + total);
						 System.out.printf("Input your money [min. " + total + "]: ");
						 money = scan.nextDouble(); scan.nextLine();
						 
						 if (money < total) {
							 System.out.println("Not Enough Money");
						 } else {
							 System.out.println("Thanks for purchasing!");
							 System.out.println("Your Change: " + (money - total));
						 }
						 break;
						 
					 case 3:
						 System.out.println("Item's name : Monitor");
						 System.out.println("Price       : $99.99");
						 System.out.println("Quantity    : " + quantity);
						 
						 total = 99.99*quantity;
						 System.out.println("\nTotal     : " + total);
						 System.out.printf("Input your money [min. " + total + "]: ");
						 money = scan.nextDouble(); scan.nextLine();
						 
						 if (money < total) {
							 System.out.println("Not Enough Money");
						 } else {
							 System.out.println("Thanks for purchasing!");
							 System.out.println("Your Change: " + (money - total));
						 }
						 break;
					 }
				 }
			 }
				 
			 
		 }
		 System.out.println("Thanks for using this application!");
	}

	public static void main(String[] args) {
		new Main();
	}

}
