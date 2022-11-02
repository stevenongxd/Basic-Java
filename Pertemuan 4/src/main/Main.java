package main;

import java.util.Scanner;

public class Main {

	public Main() {
		//IF ELSE Statement
		int x = 5;
		
		if (x == 5) {
			System.out.println("X adalah 5");
		} else {
			System.out.println("X bukan 5");
		}
			
		// ELSE IF Statement
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		System.out.printf("Input your score: ");
		score = scan.nextInt();
		scan.nextLine();
		
		if (score > 90) {
			System.out.println("Grade: A");
		} else if (score > 80) {
			System.out.println("Grade: B");
		} else if (score > 70) {
			System.out.println("Grade: C");
		} else if (score > 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: E");
		}
		
		//STRING Selection
		String cuaca = "";
		System.out.printf("Input Weather: ");
		cuaca = scan.nextLine();
		
		if (cuaca.equalsIgnoreCase("Hujan")) {
			System.out.println("Bawa Payung");
		}else if (cuaca.equalsIgnoreCase("Panas")) {
			System.out.println("Bawa Topi");
		}else if (cuaca.equalsIgnoreCase("Badai")) {
			System.out.println("Jangan Keluar");
		}
		
		//SWITCH CASE Statement
		int menu = 0;
		System.out.printf("Input Menu: ");
		menu = scan.nextInt(); scan.nextLine();
		
		switch(menu) {
		case 1:
			System.out.println("Menu 1");
			break;
		
		case 2:
			System.out.println("Menu 2");
			break;
			
		case 3:
			System.out.println("Menu 3");
			break;
			
		default:
			System.out.println("Default");
			break;
		}
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
