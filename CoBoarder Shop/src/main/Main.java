package main;

import java.util.Scanner;


public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		
		System.out.println("CoBoarder Shop");
		System.out.println("==============");
		System.out.println("1. Buy New Skateboard");
		System.out.println("2. Exit");
		menu = scan.nextInt();
		scan.nextLine();
		
		if(menu == 1) {
		
		switch(menu) {
		case 1:
			String brand;
			do {
				System.out.print("Choose Your Skateboard Brand [Yelemen | Hacksaw | Boy | Turtle House]: ");
				brand = scan.nextLine();
			}while(!brand.equals("Yelemen") && !brand.equals("Hacksaw") && !brand.equals("Boy") && !brand.equals("Yelemen"));
		
			String itemName;
			do {
				System.out.print("Input Item Name [5-15 Characters]: ");
				itemName = scan.nextLine();
			}while(itemName.length() < 5 || itemName.length() > 15);
			
			String name;
			do {
				System.out.print("Input Your Name [2 Words]: ");
				name = scan.nextLine();
			}while(!name.contains(" "));
				
			int diameter;
			do {
				System.out.print("Input Wheel Diameter [48-60]: ");
				diameter = scan.nextInt(); 
				scan.nextLine();
			}while(diameter < 48 || diameter > 60);
			
			String color;
			do {
				System.out.print("Choose Skateboard Color [Red |  Green | Blue | Black]: ");
				color = scan.nextLine();
			}while(!color.equals("Red") && !color.equals("Green") && !color.equals("Blue") && !color.equals("Black"));
			
			String address;
			do {
				System.out.print("Input Your Address [Ends With Street]: ");
				address = scan.nextLine();
			}while(!address.contains("Street"));
			
			int shippingFee = 0;
			shippingFee = address.length() * 1000;
			
			int price = 0;
			price = diameter * 10000;
			
			int totalPrice = 0;
			totalPrice = price + shippingFee;
			
			System.out.println("");
			System.out.println("- Product Details -");
			System.out.println("===================");
			System.out.println("Skateboard Brand  : " + brand);
			System.out.println("Customer Name     : " + name);
			System.out.println("Item Name         : " + itemName);
			System.out.println("Wheel Diameter    : " + diameter);
			System.out.println("Color             : " + color);
			System.out.println("");
			System.out.println("Shipping Fee      : " + shippingFee + " IDR");
			System.out.println("Item Price        : " + price + " IDR");
			System.out.println("Total Price       : " + totalPrice + " IDR");
			System.out.println("");
			System.out.println("Press Enter To Continue");
			scan.nextLine();
			scan.nextLine();
			
		case 2:
			System.exit(0);
		}
		}
		
	}

}
