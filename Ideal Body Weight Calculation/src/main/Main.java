package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		do {
			do {
				System.out.println("Ideal Body Weight Calculation");
				System.out.println("=============================");
				System.out.println("1. Login");
				System.out.println("2. Exit");
				System.out.print(">> ");
				try {
					menu = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]\n");
				}finally {
					sc.nextLine();
				}
			}while(menu < 1 || menu > 2);
			
		switch(menu) {
		
		case 1:
			String name;
			do {
				System.out.print("Input Username [5-30]: ");
				name = sc.nextLine();
			}while(name.length() < 5 || name.length() > 30);
			
			String pass;
			do {
				System.out.print("Input Password [Password is the same as Username] [Type CANCEL to cancel]: ");
				pass = sc.nextLine();
				if(pass.equalsIgnoreCase("Cancel")) {
					System.out.println("Thank You For Using This Application!");
					System.exit(0);
				}
			}while(!pass.equals(name));
			
			String userName;
			userName = name;
			
			greetUser(userName);
			int age = 0;
			do {
				System.out.print("Input your age [1-60]: ");
				try {
				age = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(age < 1 || age > 60);
			
			if(age <= 10) {
				float weight1;
				weight1 = (age * 2) + 8;
				System.out.println("Your ideal weight is: " + weight1 + " kg");
				sc.nextLine();
				
			}else {
				int height = 0;
				Double weight2;
				do {
					System.out.print("Input your height [150-300 cm]: ");
					try {
					height = sc.nextInt();
					}catch(Exception e) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
				}while(height < 150 || height > 300);
				
				weight2 = (height - 100) * 0.9;
				System.out.println("Your ideal weight is: " + weight2 + " kg");
				sc.nextLine();
			}
			break;
			
		case 2:
			
			System.out.println("Thank You For Using This Application!");
			System.exit(0);
			break;
		}
		}while(menu != 2);
		
	}
	
	void greetUser(String name) {
		System.out.println("Welcome, " + name);
	}
	
	void menu() {
		System.out.println("Ideal Body Weight Calculation");
		System.out.println("=============================");
		System.out.println("1. Login");
		System.out.println("2. Exit");
		System.out.print(">> ");
	}

	public static void main(String[] args) {
		new Main();
	}

}
