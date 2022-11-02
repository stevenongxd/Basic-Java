package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public Main() {
		Scanner sc = new Scanner(System.in);
		Vector<String> nameList = new Vector<>();
		Vector<String> genreList = new Vector<>();
		Vector<Double> ratingList = new Vector<>();
		Vector<String> statusList = new Vector<>();
		int menu = 0;
		String name = "";
		String genre = "";
		String status = "";
		double rating = 0.0;
		int choice = 0;
		int day = 0;
		int price = 0;
		int total = 0;
		int base = 0;
		int add = 0;
		int back = 0;
		
		do {
		do {
			System.out.println("Dope TV");
			System.out.println("============");
			System.out.println("1. Add New Movie");
			System.out.println("2. View A Movie");
			System.out.println("3. Rent A Movie");
			System.out.println("4. Return A Movie");
			System.out.println("5. Exit");
			System.out.print(">> ");
			try {
			menu = sc.nextInt();
			}catch(Exception E) {
				System.out.println("[!] Input Must Be A Number [!]");
			}finally {
				sc.nextLine();
			}
		}while(menu < 1 || menu > 5);
			
		
		switch(menu) {
		
		case 1:
			do {
				System.out.print("\nInput Movie Name [5-20 Characters]: ");
				name = sc.nextLine();
				if(name.length() < 5 || name.length() > 20) {
					System.out.println("Movie's Name Must Be Between 5-20 Characters!");
				}
				}while(name.length() < 5 || name.length() > 20);
				
			
			do {
				System.out.print("\nMovie Genre [Action | Drama | Horror] [Case Sensitive]: ");
				genre = sc.nextLine();
				if(!genre.equalsIgnoreCase("Action") && !genre.equalsIgnoreCase("Drama") && !genre.equalsIgnoreCase("Horror")) {
					System.out.println("Movie Genre Must Be Either Action, Drama, or Horror!");
				}
			}while(!genre.equalsIgnoreCase("Action") && !genre.equalsIgnoreCase("Drama") && !genre.equalsIgnoreCase("Horror"));
			
			do {
				System.out.print("\nMovie Rating [0.0 - 5.0]: ");
				rating = sc.nextDouble();
				if(rating < 0.0 || rating > 5.0){
					System.out.println("Movie Rating Must Be Between 0.0 - 5.0!");
				}
			}while(rating < 0.0 || rating > 5.0);
			
			statusList.add("Available");
			
			nameList.add(name);
			genreList.add(genre);
			ratingList.add(rating);
			statusList.add(status);
			
			System.out.println("\nMovie Added Successfully!\n");
			break;
		
		case 2:
			if(nameList.size() < 1) {
				System.out.println("\nMovie List Is Empty!\n");
			}else {
				for (int i = 0; i < ratingList.size()-1; i++) {
					for (int j = ratingList.size()-1; j > i; j--) {
						if(ratingList.get(j) < ratingList.get(j - 1)) {
							double tempRating = ratingList.get(j);
							ratingList.set(j, ratingList.get(j - 1));
							ratingList.set(j - 1, tempRating);
						}
					}
				}
				for (int i = 0; i < nameList.size(); i++) {
					System.out.println("\nNo              : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Movie Name   : " + nameList.get(i));
					System.out.println("2. Genre        : " + genreList.get(i));
					System.out.println("3. Rating       : " + ratingList.get(i));
					System.out.println("4. Status       : " + statusList.get(i));
					System.out.println();
				}
			}
			break;
		
		case 3:
			if(nameList.size() < 1) {
				System.out.println("\nMovie List Is Empty!\n");
				break;
			}else {
				for (int i = 0; i < ratingList.size()-1; i++) {
					for (int j = ratingList.size()-1; j > i; j--) {
						if(ratingList.get(j) < ratingList.get(j - 1)) {
							double tempRating = ratingList.get(j);
							ratingList.set(j, ratingList.get(j - 1));
							ratingList.set(j - 1, tempRating);
						}
					}
				}
				for (int i = 0; i < nameList.size(); i++) {
					System.out.println("\nNo           : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Movie Name   : " + nameList.get(i));
					System.out.println("2. Genre        : " + genreList.get(i));
					System.out.println("3. Rating       : " + ratingList.get(i));
					System.out.println("4. Status       : " + statusList.get(i));
					System.out.println();
				}
				do {
					System.out.print("\nWhich movie do you want to rent? " + "[" + "1 - " + nameList.size() + "]: ");
					try {
						choice = sc.nextInt();
					}catch(Exception E) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
				}while(choice < 1 || choice > nameList.size());
				
				
				do {
					System.out.print("\nHow many days do you want to borrow the movie? [1 - 7]: ");
					try {
						day = sc.nextInt();
					}catch(Exception E) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
				}while(day < 1 || day > 7);
				
				int value = (int) rating;
				base = 1000 * value;
				add = 2000 * day;
				price = base + add;
				total = price;
				
				int id1 = (int)(Math.random()*(9-0+1)+0);
				int id2 = (int)(Math.random()*(9-0+1)+0);
				int id3 = (int)(Math.random()*(9-0+1)+0);
				
				for (int i = 0; i < nameList.size(); i++) {
				System.out.println("\nRent Movie");
				System.out.println("=============");
				System.out.println("ID     :" + "TR-" + id1 + id2 + id3);
				System.out.println("Movie  :" + nameList.get(i));
				System.out.println("Genre  :" + genreList.get(i));
				System.out.println("Rating :" + ratingList.get(i));
				System.out.println("Price  :" + total);
				}
				
				statusList.clear();
				statusList.add("Not Available");
				System.out.println("\nMovie Rented Successfully!");
				for (int i =0 ; i < nameList.size(); i++) {
					System.out.println("\nNo           : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Movie Name   : " + nameList.get(i));
					System.out.println("2. Genre        : " + genreList.get(i));
					System.out.println("3. Rating       : " + ratingList.get(i));
					System.out.println("4. Status       : " + statusList.get(i));
					System.out.println();
				}	
			}
			break;
			
		case 4:
			if(nameList.size() < 1) {
				System.out.println("\nMovie List Is Empty!");
				break;
			}else {
				for (int i = 0; i < ratingList.size()-1; i++) {
					for (int j = ratingList.size()-1; j > i; j--) {
						if(ratingList.get(j) < ratingList.get(j - 1)) {
							double tempRating = ratingList.get(j);
							ratingList.set(j, ratingList.get(j - 1));
							ratingList.set(j - 1, tempRating);
						}
					}
				}
			}
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println("\nNo           : " + (i+1));
				System.out.println("======================");
				System.out.println("1. Movie Name   : " + nameList.get(i));
				System.out.println("2. Genre        : " + genreList.get(i));
				System.out.println("3. Rating       : " + ratingList.get(i));
				System.out.println("4. Status       : " + statusList.get(i));
				System.out.println();
			}
				do {
					System.out.print("\nWhich movie do you want to return? " + "[" + "1 - " + nameList.size() + "]: ");
					try {
						back = sc.nextInt();
					}catch(Exception E) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
				}while(back < 1 || back > nameList.size());
				
				statusList.clear();
				statusList.add("Available");
				System.out.println("\nMovie Returned Successfully!");
			
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println("\nNo           : " + (i+1));
				System.out.println("======================");
				System.out.println("1. Movie Name   : " + nameList.get(i));
				System.out.println("2. Genre        : " + genreList.get(i));
				System.out.println("3. Rating       : " + ratingList.get(i));
				System.out.println("4. Status       : " + statusList.get(i));
				System.out.println();
			}
			break;
		
		case 5:
			System.exit(0);
			System.out.println("Thank You For Using DOPE TV Application!");
			break;	
		}
		}while(menu != 5);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
