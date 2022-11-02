package main;

import java.util.Scanner;

public class Main {

	public Main() {
Scanner scan = new Scanner(System.in);

		double invest = 0;
		int multiplier = 0;
		int choice = 0;
		String enter;
		
		do {
		System.out.println("ES Companies Portal - Invesment Calculator");
		System.out.println("=========================================");
		System.out.println("Beginning");
		
		do {
			try {
			System.out.print("Input your money to be invested [1...5000] [Can Use Decimal]: $");
			invest = scan.nextDouble();	
			} catch (Exception e) {
				System.out.println("Please Input The Correct Value");
				scan.nextLine();
			}
		}while(invest < 1 || invest > 5000);
		
		do {
			try {
			System.out.print("Input the investment multiplier [1...99]: ");
			multiplier = scan.nextInt();			
			}catch (Exception e) {
				System.out.println("Please Input The Correct Value");
			}finally {
				scan.nextLine();				
			}
		}while(multiplier < 1 || multiplier > 99);
		
		for(int i = 1; i <= 12; i++) {
			do {
				try {
					System.out.println("\nMonth " + i);
					System.out.printf("Current Money: %.2f\n", invest);
					System.out.println("\nWhat happen");
					System.out.println("===========");
					System.out.println("1. Nothing");
					System.out.println("2. Take all money invested");
					System.out.println("3. Drop in investment");
					System.out.println("4. No addition to investment");
					System.out.print("choose: ");
			choice = scan.nextInt(); scan.nextLine();
				}catch(Exception e) {
					System.out.println("[!] Choose A Number [!]");
					scan.nextLine();
				}
			}while(choice < 1 || choice > 4);
		
		switch(choice) {
		case 1:
			System.out.println("Nothing Bad Happened...");
			System.out.println("Everything Is Normal");
			System.out.println("Press Enter To Continue");
			enter = scan.nextLine();
			invest = invest + (invest * multiplier)/100;
			break;
			
		case 2:
			System.out.println("You Have Taken All Your Money");
			System.out.println("Thank You For Using This Application!");
			enter = scan.nextLine();
			break;
		
		case 3:
			System.out.println("Oh no! The drop in investment causes your money to decrease!");
			System.out.println("Press Enter To Continue");
			enter = scan.nextLine();
			invest = invest + (invest * multiplier * -1 /100);			
			break;
			
		case 4:
			System.out.println("There's no changes in the invested money!");
			System.out.println("Press Enter To Continue");
			enter = scan.nextLine();
			break;
		}
		if(choice == 2) {
			break;
		}
		
	}

		String again;
		do {
		System.out.printf("Your Money After Investing: %2.f\n", invest);
		System.out.println("Do you want to try again [Y|N]? = ");
		again = scan.nextLine();
		
		if(again.equalsIgnoreCase("Y") == false && again.equalsIgnoreCase("N") == false){
			System.out.println("Choose Y/N");
			again = "W";
		}
		}while(again.equals("W"));
		
		if(again.equalsIgnoreCase("Y")) {
			continue;			
		}else if(again.equalsIgnoreCase("N")) {
			System.out.println("Thank You For Using This Application!");
			break;
		}
		}while(true);
	}

	public static void main(String[] args) {
		new Main();
}
		}



