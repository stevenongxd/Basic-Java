package main;

import java.util.Scanner;

public class Main {
	
	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		do {
			System.out.print("Student Name [5-20 Karakter]: ");
			name = scan.nextLine();
		} while (name.length() < 5 || name.length() > 20);
		
		System.out.println("\n=== Exam Percentage ===");
		int midPercentage = 0, finalPercentage  = 0;
		do {
			do {
			System.out.printf("Mid Exam [1..99]: ");
			midPercentage = scan.nextInt();
			scan.nextLine();
		} while (midPercentage < 1 || midPercentage > 99);
		
		do {
			System.out.printf("Final Exam [1..%d]: ", (100 - midPercentage));
			finalPercentage = scan.nextInt();
			scan.nextLine();
		} while ((finalPercentage < 1 || finalPercentage > 100));
	} while (midPercentage + finalPercentage !=100);
		
		System.out.println("\n=== Exam Score ===");
		double midScore = 0;
		do {
			System.out.printf("Mid Exam [1-100]: ");
		midScore = scan.nextDouble();
		scan.nextLine();
		} while (midScore < 1 || midScore > 100);
		
		double finalScore = 0;
		do {
			System.out.printf("Final Exam [1-100]: ");
			finalScore = scan.nextDouble();
			scan.nextLine();
		} while (finalScore < 1 || midScore > 100);
		
		double totalScore = ((midPercentage * midScore) + (finalPercentage * finalScore)) / 100;
		
		char grade = 'E';
		if (totalScore >= 85) {
			grade = 'A';
		} else if (totalScore >= 75 && totalScore < 85) {
			grade = 'B';
		} else if (totalScore >= 65 && totalScore < 75) {
			grade = 'C';
		} else if (totalScore >= 55 && totalScore < 65) {
			grade = 'D';
		} 
		
		String comment = "";
		switch (grade) {
			 case 'A': {
			comment = "Very Nais";
			break;
		}
		case 'B': {
			comment = "K man";
			break;
		}
		case 'C': {
			comment = "Wtf is wong wid yu";
			break;
		}
		case 'D': {
			comment = "gblg";
			break;
		}
		case 'E': {
			comment = "gorge";
			break;
		}
		}
		
		System.out.println("\n=== Result ===");
		System.out.printf("Mid Exam    : %6.2f (%d%%)%n", midScore, midPercentage);
		System.out.printf("Final Exam  : %6.2f (%d%%)%n", finalScore, finalPercentage);
		System.out.printf("Total       : %6.2f (Grade %c)%n", totalScore, grade);
		System.out.printf("%s %s!%n", comment, name);
	}
	}
