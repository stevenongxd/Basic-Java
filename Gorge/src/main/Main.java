package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Vector<String> nameList = new Vector<>();
		Vector<Integer> ageList = new Vector<>();
		Vector<String> descList = new Vector<>();
		Vector<String> codeList = new Vector<>();
		
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String name = "";
		int age = 0;
		String desc = "";
		String code = "";
		
		do {
		do {
		System.out.println("Bluejack Hospital");
		System.out.println("=================");
		System.out.println("1. Insert");
		System.out.println("2. View");
		System.out.println("3. Next Queue");
		System.out.println("4. Exit");
		System.out.print(">> ");
		try {
			menu = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input Must Be A Number!\n");
		}
		}while(menu < 1 || menu > 4);
		
		switch(menu) {
		
		case 1:
			do {
				System.out.print("Input Patient Name [4-25]: ");
				name = sc.nextLine();
			}while(name.length() < 4 || name.length() > 25);
			
			do {
				System.out.print("Input Patient Age [>= 0]: ");
				try {
				age = sc.nextInt();
				}catch(Exception E) {
					System.out.println("Input Must Be A Number!\n");
				}
			}while(age < 0 || age > 0);
			
			do {
				System.out.print("Input Description [>= 6 Characters]: ");
				desc = sc.nextLine();
			}while(desc.length() >= 6);
			
			do {
				System.out.print("Input Code [Red | Yellow | Green]: ");
				code = sc.nextLine();
			}while(!code.equals("Red") && !code.equals("Yellow") && !code.equals("Green"));
			
			nameList.add(name);
			ageList.add(age);
			descList.add(desc);
			codeList.add(code);
			
			System.out.println("Insert Success!");
			break;
			
			
		case 2:
			
			
			break;
			
			
			
		case 3:
			
			
			
			break;
			
			
			
			
		case 4:
			System.out.println("Thank You For Visitting Bluejack Hospital!");
			System.exit(0);
			break;
			
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}while(menu != 4);
	}

}
