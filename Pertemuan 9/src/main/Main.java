//package main;
//
//import java.util.Scanner;
//
//public class Main {
//	
//	//Variable Scope - Global
//	Scanner sc = new Scanner(System.in);
//	
//	public Main() {
//		
//		int x = 3;
//		int y = sumBy2(x);
//		System.out.println("y: " + y);
//		System.out.println("-------------------");
//		
//		String userName = "Onk";
//		greetUser(userName);
//		
//		menu();
//		
//		Integer age, height, weight;
//		
//		
//		//Try Catch - Traditional
////		do {
////			System.out.print("Input Age: ");
////			try {
////		age = sc.nextInt();
////		break;
////			}catch (Exception e) {
////				System.out.println("[!] Input Integer Value");
////			}finally {
////		sc.nextLine();
////			}
////		}while(true);
////		
////		do {
////			System.out.print("Input Height: ");
////			try {
////		height = sc.nextInt();
////		break;
////			}catch (Exception e) {
////				System.out.println("[!] Input Integer Value");
////			}finally {
////		sc.nextLine();
////			}
////		}while(true);
////		
////		do {
////			System.out.print("Input Weight: ");
////			try {
////		weight = sc.nextInt();
////		break;
////			}catch (Exception e) {
////				System.out.println("[!] Input Integer Value");
////			}finally {
////		sc.nextLine();
////			}
////		}while(true);
//		
////		age = getIntegerInput("Input Age: ");
////		height = getIntegerInput("Input Height: ");
////		weight = getIntegerInput("Input Weight");
////	}
////	
////	void printMyBodyInfo(Integer age, Integer height, Integer weight) {
////		System.out.println("Age: " + age);
////		System.out.println("Height: " + height);
////		System.out.println("Weight: " + weight);
////		System.out.println("-------------------");
////	}
////	
////	//Try Catch Method
////	Integer getIntegerInput(String message) {
////		Integer temp;
////		do {
////			System.out.print(message);
////			try {
////				temp = sc.nextInt();
////		break;
////			}catch (Exception e) {
////				System.out.println("[!] Input Integer Value");
////			}finally {
////				sc.nextLine();
////			}
////		}while(true);
////		return temp;
////	}
////	
////	//Return Method
////	int sumBy2(Integer x) {
////		return x + 2;
////	}
//	
//	//Void
//	void greetUser(String name) {
//		System.out.println("Hello, " + name);
//		System.out.println("-------------------");
//	}
//	
//	//Void Menu
//	void menu() {
//		System.out.println("1. Add Food");
//		System.out.println("2. Update Food");
//		System.out.println("3. Delete Food");
//		System.out.println(">> ");
//		System.out.println("-------------------");
//	}
//	
//	//Variable Scope
//	//- Global -> Diketahui 1 program
//	//- Local -> Tidak dapat diketahui 1 program
//	
//	//Passing Array
//	String[] friends = {"Onk", "Aldo", "Dilen", "Gorge", "Akong"};
//	
//	//Methods
//	void printFriendsName(String[] friends) {
//		for (String friend : friends) {
//			System.out.println(friend);
//		}
//	}
//	
//	//Passing Array (by Reference)
//		String[] friend = {"Onk", "Aldo", "Dilen", "Gorge", "Akong"};
//		
//		String[] uppercaseElements = changeStringArrayElementToUppercase(friend);
//		
//		
//		//Methods
//		String[] changeStringArrayElementToUppercase(String[] array) {
//			for (int i = 0; i < array.length; i++) {
//				array[i] = array[i].toUpperCase();
//			}
//			return array;
//		}
//		
//		void printFriendName(String[] friend) {
//			for(String friendz : friend) {
//				System.out.println(friendz);
//			}
//		}
//		
//	public static void main(String[]args) {
//		new Main();
//	}
//}
