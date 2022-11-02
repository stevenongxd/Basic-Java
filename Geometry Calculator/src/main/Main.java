package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Geometry Area Counter");
		System.out.println("=====================");
		
		int menu = 0;
		do {
		do {
			System.out.println("1. Square");
			System.out.println("2. Rectangle");
			System.out.print(">> ");
			try {
			menu = sc.nextInt();
			}catch(Exception e) {
				System.out.println("[!] Input Must Be A Number [!]");
			}finally {
				sc.nextLine();
			}
		}while(menu < 1|| menu > 2);
		
		switch(menu) {
		
		case 1:
			float side;
			float area;
			System.out.print("Input Side: ");
			side = sc.nextFloat();
			
			area = side*side;
			
			System.out.println("Area: " + area);
			
			break;
			
		case 2:
			float width;
			float height;
			float area2;
			
			System.out.print("Input Width: ");
			width = sc.nextFloat();
			
			System.out.print("Input Height: ");
			height = sc.nextFloat();
			
			area2 = width*height;
			
			System.out.println("Area: " + area2);
			
			break;
		}
		
		}while(menu != 2);
		
		
	}

}
