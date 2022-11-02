package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> typeList = new Vector<>();
		Vector<String> nameList = new Vector<>();
		Vector<Double> caloriesList = new Vector<>();
		Vector<Integer> priceList = new Vector<>();
		
		int menu = 0;
		do {
		do {
		System.out.println("Food Order");
		System.out.println("==========");
		System.out.println("1. Insert New Food");
		System.out.println("2. List Of Food");
		System.out.println("3. Search Food");
		System.out.println("4. Delete Food");
		System.out.println("5. Exit");
		System.out.print(">> ");
		try {
			menu = sc.nextInt();
			break;
			}catch(Exception e) {
				System.out.println("[!] Please Input A Number [!]");
			}finally {
				sc.nextLine();
			}
		}while (menu < 1 || menu > 5);
		switch(menu) {
		
		case 1:
			
			String foodType = "";
			do {
			System.out.print("Input Food's Type [Appetizer | Main Course | Dessert]: ");
			foodType = sc.nextLine();
			}while(!foodType.equalsIgnoreCase("Appetizer") && !foodType.equalsIgnoreCase("Main Course") && !foodType.equalsIgnoreCase("Dessert"));
			
			String foodName = "";
			do {
				System.out.print("Input Food's Name [3-20]: ");
				foodName = sc.nextLine();
			}while(foodName.length() < 3 || foodName.length() > 20);
			
			Double calories;
			do {
			System.out.print("Input Food's Calories [1.0-4.0]: ");
					calories = sc.nextDouble();
					sc.nextLine();
			}while(calories < 1 || calories > 4);
			
			int price = 0;
			do {
				System.out.print("Input Food's Price [10000-50000]: ");
				price = sc.nextInt();
				sc.nextLine();
			}while(price < 10000 || price > 50000);
			
			typeList.add(foodType);
			nameList.add(foodName);
			caloriesList.add(calories);
			priceList.add(price);
			
			System.out.println("Data Has Been Successfully Inserted!");
			break;
			
		case 2:
			if(nameList.isEmpty()) {
				System.out.println("No Data! Please Insert Your Data First!");
				sc.nextLine();
			}else {
				for(int i = 0; i < nameList.size(); i++) {
					System.out.println("No           : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Type      : " + typeList.get(i));
					System.out.println("2. Name      : " + nameList.get(i));
					System.out.println("3. Calories  : " + caloriesList.get(i));
					System.out.println("4. Price     : " + priceList.get(i));
					System.out.println();
					System.out.println("Press Enter To Continue\n\n");
					sc.nextLine();
				}
			}
			break;	
		
		case 3:
			String search = "";
			int index = -1;
			
			do {
				System.out.print("Input Food's Name [3-20]: ");
				search = sc.nextLine();
			}while(search.length() < 3 || search.length() > 20);
			
			for (int i = 0; i < nameList.size(); i++) {
				if(nameList.get(i).equals(search)) {
					index = i;
					break;
				}
			}
			
			if(index == -1) {
				System.out.println("No Data Found!");
			}else {
				System.out.println("No           : " + (index+1));
				System.out.println("======================");
				System.out.println("1. Type      : " + typeList.get(index));
				System.out.println("2. Name      : " + nameList.get(index));
				System.out.println("3. Calories  : " + caloriesList.get(index));
				System.out.println("4. Price     : " + priceList.get(index));
				System.out.println();
				System.out.println("Press Enter To Continue\n\n");
				sc.nextLine();
			}
			break;
			
		case 4:
			if(nameList.isEmpty()) {
				System.out.println("No Data! Please Insert Your Data First!");
				sc.nextLine();
			}else {
			for(int i = 0; i < nameList.size(); i++) {
				System.out.println("No           : " + (i+1));
				System.out.println("======================");
				System.out.println("1. Type      : " + typeList.get(i));
				System.out.println("2. Name      : " + nameList.get(i));
				System.out.println("3. Calories  : " + caloriesList.get(i));
				System.out.println("4. Price     : " + priceList.get(i));
				System.out.println();
				System.out.println("Press Enter To Continue\n\n");
				sc.nextLine();
			}
			}
			int delete = 0;
			do {
			System.out.println("Input number <No> to be deleted [1 - " + nameList.size() + "] [0 To Cancel]: ");
			delete = sc.nextInt();
			sc.nextLine();
			}while(delete < 1 || delete > nameList.size());
			
			typeList.remove(delete -1);
			nameList.remove(delete -1);
			caloriesList.remove(delete -1);
			priceList.remove(delete - 1);
			
			System.out.println("Data Has Been Successfully Deleted!");
			break;
			
		case 5:
			System.out.println("Thank You For Using This Application!");
			System.exit(0);
			break;	
		}
		}while(menu != 5);
		}
		
	}


