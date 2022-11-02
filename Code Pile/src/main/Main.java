package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
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
				}catch(Exception e) {
					System.out.println("[!] Please Input A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while (menu < 1 || menu > 5);
		

	}

}
