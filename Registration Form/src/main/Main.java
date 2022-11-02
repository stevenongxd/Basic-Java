package main;

import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===================");
		System.out.println("|Registration Form|");
		System.out.println("===================");
		
		String name;
		do {
			System.out.print("Input your full name [5-30]: ");
			name = scan.nextLine();
		}while(name.length() < 5 || name.length() > 30);
		
		String major;
		do {
			System.out.print("Choose your major [Computer Science / Information System]: ");
			major = scan.nextLine();
		}while(!major.equals("Computer Science") && !major.equals("Information System"));
		
		int form = 0;
		do {
			System.out.print("Quantity of Form [1-10]: ");
			try{
				form = scan.nextInt();
			}catch(Exception e) {
				System.out.println("[!] Please Input Numeric Value [!]");
			}finally {
				scan.nextLine();
			}
		}while(form < 1 || form > 10);
		
		System.out.println("\n");
		
		int price;
		if (major.equals("Computer Science")) {
			price = 200000;
		}else {
			price = 150000;
		}
		
		int discount = 0;
		int total;
		if (form >= 5) {
			discount = (int) (0.2 * price * form);
			total = (int) (0.8 * price * form);
		}else if (form >= 3) {
			discount = (int) (0.1 * price * form);
			total = (int) (0.9 * price * form);
		}else {
			total = (int) (price * form);
		}
		
		System.out.println("===================");
		System.out.println("|Registration Form|");
		System.out.println("===================");
		
		System.out.println("Name         : " + name);
		System.out.println("Major        : " + major);
		System.out.println("Quantity     : " + form);
		System.out.println("Discount     : " + discount);
		System.out.println("Total Price  : " + total);
		System.out.println("Thank You For Registering!");
	}

}
