package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name;
		int luckyNumber = 0;
		
		System.out.println("ES Companies Portal - Simple Application");
		System.out.println("===========================================");
		System.out.print("Input your Company's Name: ");
		name = scan.nextLine(); 
		
		do{
			System.out.print("Input your company's lucky number [0...255]: ");
			luckyNumber = scan.nextInt();
		}while (luckyNumber < 0 || luckyNumber > 255);
		
		System.out.println("\n");
		
		System.out.println("Information");
		System.out.println("============");
		System.out.println("Company Name: " + name);
		System.out.println("Randoming Some Number...");
		System.out.println("Press Enter to Continue\n");
		scan.nextLine();
		scan.nextLine();

		System.out.println("First Character in your Company Name: " + name.charAt(0));
		
		int name2 = name.length();
		Random indexNum = new Random();
		int angka = indexNum.nextInt(name2);
		System.out.println("Character in Index number " + angka + " in your Company Name: " + name.charAt(angka));
		
		String lastName = name.substring(name.length()-1, name.length());
		System.out.println("Last Character in your Company Name: " + lastName);
		
		char c = (char)luckyNumber;
		System.out.println("This is the symbol of your company's lucky number: " + c);
		
		System.out.println("=========================================================\n");
		int luckyNumber2 = 0;
		do{
			System.out.print("Input your company's lucky number [1...50]: ");
			luckyNumber2 = scan.nextInt();
		}while (luckyNumber2 < 1 || luckyNumber2 > 50);
		
		System.out.println("Which is bigger, your lucky number <" + luckyNumber + "> or the second one <" + luckyNumber2 + ">?");
		if (luckyNumber > luckyNumber2) {
			System.out.println("Answer: " + luckyNumber);
		}else if (luckyNumber < luckyNumber2) {
			System.out.println("Answer: " + luckyNumber2);
		}
		
		System.out.println("Which is smaller, your lucky number <" + luckyNumber + "> or the second one <" + luckyNumber2 + ">?");
		if (luckyNumber > luckyNumber2) {
			System.out.println("Answer: " + luckyNumber2);
		}else if (luckyNumber < luckyNumber2) {
			System.out.println("Answer: " + luckyNumber);
		}
		
		System.out.println("What is the result of your lucky number powered by the second one?");
		System.out.println("Answer: " + luckyNumber*luckyNumber2);
	}

}
