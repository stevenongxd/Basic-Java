package main;

import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		String companyName;
		int age = 0;
		double income = 0;
		
		System.out.println("Welcome to ES Comapnies Portal");
		System.out.println("==============================");
		System.out.print("Input Your Name: ");
		name = scan.nextLine();
		
		System.out.print("Input Your Company's Name: ");
		companyName = scan.nextLine();
		
		System.out.print("Input Your Company's Age: ");
		age = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Input Your Company's Daily Income [Decimal Number]: $");
		income = scan.nextInt();
		scan.nextLine();
		
		System.out.println("");
		
		System.out.println("Thank you for filling the form, " + name);
		
		System.out.println("");
		
		System.out.println("=================================");
		System.out.println("Company Name     : " + companyName);
		System.out.println("Company Age      : " + age);
		System.out.println("Company Income   : $" + income);
		
		System.out.print("Is this information correct [True/False]? ");
		scan.nextLine();
		
		System.out.println("Thank for using this application!");
		
	}

}
