package main;

import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> ageList = new Vector<>();
		Vector<Integer> priceList = new Vector<>();
		Vector<String> furList = new Vector<>();
		
		Random r = new Random();
		char id1 = (char)(r.nextInt(26) + 'A');
		
		Random t = new Random();
		char id2 = (char)(t.nextInt(26) + 'A');
		
		int id3 = (int)(Math.random()*(9-0+1)+0);
		int id4 = (int)(Math.random()*(9-0+1)+0);
		int id5 = (int)(Math.random()*(9-0+1)+0);

		int menu = 0;
		int age = 0;
		int price = 0;
		int choice = 0;
		int total = 0;
		String fur = "";
		
		do {
		do {
			System.out.println("HamstEN Sotre");
			System.out.println("1. Add Hamster");
			System.out.println("2. View Hamster");
			System.out.println("3. Buy Hamster");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
				menu = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
		}while(menu < 1 || menu > 4);
			
		switch(menu) {
		
		case 1:
			do {
			System.out.print("\nInput Hamster Age [1-5]: ");
			try {
				age = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(age < 1 || age > 5);
			
			do {
				System.out.print("\nInput Hamster Base Price [10.000 - 100.000]: ");
				try {
					price = sc.nextInt();
					}catch(Exception e) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
				}while(price < 10000 || price > 100000);
			
			do {
				System.out.print("\nInput Hamster Fur [Black | White | Rainbow] [Case Sensitive]: ");
				fur = sc.nextLine();
				if(!fur.equals("Black") && !fur.equals("White") && !fur.equals("Rainbow")) {
					System.out.println("Hamster Fur Must Be Black, White, Rainbow!");
				}
			}while(!fur.equals("Black") && !fur.equals("White") && !fur.equals("Rainbow"));
			
			System.out.println("\nHamster ID: " + id1 + id2 + id3 + id4 + id5);
			
			ageList.add(age);
			priceList.add(price);
			furList.add(fur);
			
			System.out.println("\nHamster Added!");
			break;
		
		case 2:
			if(furList.size() < 1) {
				System.out.println("\nHamster List Is Empty!\n");
			}else {
				for (int i = 0; i < ageList.size()-1; i++) {
					for (int j = ageList.size()-1; j > i; j--) {
						if(ageList.get(j) < ageList.get(j - 1)) {
							int tempRating = ageList.get(j);
							ageList.set(j, ageList.get(j - 1));
							ageList.set(j - 1, tempRating);
						}
					}
				}
				
				System.out.println("Hamster List");
				System.out.println("============");
				
				for (int i = 0; i < furList.size(); i++) {
					System.out.println("\nNo              : " + (i+1));
					System.out.println("======================");
					System.out.println("1. ID     : " + id1 + id2 + id3 + id4 + id5);
					System.out.println("2. Fur    : " + furList.get(i));
					System.out.println("3. Age    : " + ageList.get(i));
					System.out.println("4. Price  : " + priceList.get(i));
					System.out.println();
				}
			}
			break;
		
		case 3:
			if(furList.size() < 1) {
				System.out.println("\nHamster List Is Empty!\n");
			}else {
				for (int i = 0; i < ageList.size()-1; i++) {
					for (int j = ageList.size()-1; j > i; j--) {
						if(ageList.get(j) < ageList.get(j - 1)) {
							int tempRating = ageList.get(j);
							ageList.set(j, ageList.get(j - 1));
							ageList.set(j - 1, tempRating);
						}
					}
				}
				
				System.out.println("Hamster List");
				System.out.println("============");
				
				for (int i = 0; i < furList.size(); i++) {
					System.out.println("\nNo              : " + (i+1));
					System.out.println("======================");
					System.out.println("2. ID     : " + id1 + id2 + id3 + id4 + id5);
					System.out.println("3. Fur    : " + furList.get(i));
					System.out.println("4. Age    : " + ageList.get(i));
					System.out.println("4. Price  : " + priceList.get(i));
					System.out.println();
				}
			}
			
			do {
				System.out.print("\nChoose Number To Buy? " + "[" + "1 - " + furList.size() + "]: ");
				try {
					choice = sc.nextInt();
				}catch(Exception E) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(choice < 1 || choice > furList.size());
			
			total = price * age;
			
			System.out.println("================================");
			System.out.println("Total Price: " + total);
			System.out.println("================================");
			sc.nextLine();
			
			ageList.remove(age);
			furList.remove(fur);
			priceList.remove(price);
			
			System.out.println("\nTransaction Success!");
			break;
			
		case 4:
			System.exit(0);
			System.out.println("Thank You For Visitting!");
			break;
		}
		
		
		}while(menu != 4);

	}

}
