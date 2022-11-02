package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> noList = new Vector<>();
		Vector<String> typeList = new Vector<>();
		Vector<String> cosList = new Vector<>();
		Vector<String> topList = new Vector<>();
		Vector<Integer> priceList = new Vector<>();
		Vector<Integer> quantityList = new Vector<>();
		
		String type = "";
		String cos = "";
		String top = "";
		int priceTop = 0;
		int price = 0;
		int menu = 0;
		int no = 0;
		int quantity = 0;
		
		do {
			do {
				System.out.println("\nBEE GELATO");
				System.out.println("1. Order");
				System.out.println("2. Order History");
				System.out.println("3. Exit");
				System.out.print(">> ");
				try {
					menu = sc.nextInt();
					}catch(Exception e) {
						System.out.println("[!] Input Must Be A Number [!]");
					}finally {
						sc.nextLine();
					}
			}while(menu < 1 || menu > 3);
		
		switch(menu) {
		
		case 1:
			do {
			System.out.println("\nBEE GELATO - Order");
			System.out.println("==================");
			System.out.print("\nInput No Order [1-1000]: ");
			try {
				no = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(no < 1 || no > 1000);
			
				do {
					System.out.println("\nIce Cream Type");
					System.out.println("==============");
					System.out.println("- Strawberry");
					System.out.println("- Coklat");
					System.out.println("- Vanilla");
					System.out.println("- Durian");
					System.out.println("- Blueberry");
					System.out.print(">> ");
					type = sc.nextLine();
					if((!type.equals("Strawberry") && !type.equals("Coklat") && !type.equals("Vanilla") && !type.equals("Durian") && !type.equals("Blueberry"))) {
						System.out.println("Ice Cream Type Must Be: Strawberry / Coklat / Vanilla / Durian / Blueberry!");
					}
					
				}while(!type.equals("Strawberry") && !type.equals("Coklat") && !type.equals("Vanilla") && !type.equals("Durian") && !type.equals("Blueberry"));
			
				do {
					System.out.println("\nCone/Sundae");
					System.out.println("==============");
					System.out.println("- Cone");
					System.out.println("- Sundae");
					System.out.print(">> ");
					cos = sc.nextLine();
					if((!cos.equals("Cone") && !cos.equals("Sundae"))) {
						System.out.println("Ice Cream Cone Must Be Cone / Sundae!");
					}
					
				}while(!cos.equals("Cone") && !cos.equals("Sundae"));
			
				do {
					System.out.println("\nTopping");
					System.out.println("==============");
					System.out.println("- No Topping");
					System.out.println("- Almond");
					System.out.println("- Nut");
					System.out.println("- Oreo");
					System.out.println("- Messes");
					System.out.print(">> ");
					top = sc.nextLine();
					if((!top.equals("No Topping") && !top.equals("Almond") && !top.equals("Nut") && !top.equals("Oreo") && !top.equals("Messes"))) {
						System.out.println("Ice Cream Topping Must Be: No Topping / Almond / Nut / Oreo / Messes!");
					}
				}while(!top.equals("No Topping") && !top.equals("Almond") && !top.equals("Nut") && !top.equals("Oreo") && !top.equals("Messes"));
			
			System.out.print("\nInput Quantity: ");
			quantity = sc.nextInt();
			sc.nextLine();
			
			if(cos.equals("Cone")) {
				if(type.equals("Strawberry")) {
					price = 10000;
				}
				if(type.equals("Coklat")) {
					price = 9000;
				}
				if(type.equals("Vanilla")) {
					price = 8000;
				}
				if(type.equals("Durian")) {
					price = 12000;
				}
				if(type.equals("Blueberry")) {
					price = 11000;
				}
			}else {
				if(type.equals("Strawberry")) {
					price = 12000;
				}
				if(type.equals("Coklat")) {
					price = 11000;
				}
				if(type.equals("Vanilla")) {
					price = 10000;
				}
				if(type.equals("Durian")) {
					price = 14000;
				}
				if(type.equals("Blueberry")) {
					price = 13000;
			}
			}
			
			if(top.equals("Almond")) {
				priceTop = 3000;
			}
			if(top.equals("Nut")) {
				priceTop = 2500;
			}
			if(top.equals("Oreo")) {
				priceTop = 1500;
			}
			if(top.equals("Messes")) {
				priceTop = 2000;
			}
			if(top.equals("Not Topping")) {
				priceTop = 0;
			}
			
			noList.add(no);
			typeList.add(type);
			cosList.add(cos);
			topList.add(top);
			priceList.add(price);
			quantityList.add(quantity);
			
			
			System.out.println("Press Enter To Continue...");
			sc.nextLine();
			break;
			
		case 2:
			if(typeList.size() < 1) {
				System.out.println("\nOrder History Is Empty!");
			}else {
				for (int i = 0; i < typeList.size(); i++) {
					System.out.println("\nNo              : " + (i+1));
					System.out.println("======================");
					System.out.println("No Order        : " + noList.get(i));
					System.out.println("Ice Cream Type  : " + typeList.get(i));
					System.out.println("Topping         : " + topList.get(i));
					System.out.println("Cone/Sundae     : " + cosList.get(i));
					System.out.println("Quantity        : " + quantityList.get(i));
					System.out.println("Price           : " + (price + priceTop));
					System.out.println("Sub Total       : " + (price + priceTop) * quantity); 
					System.out.println("Grand Total     : " + (price + priceTop) * quantity);
					System.out.println();
				}
			}
			break;
			
			
		case 3:
			System.out.println("\nThank You For Visiting BEE GELATO!");
			System.exit(0);
			break;
		
		}
		}while(menu != 3);
		
		

	}

}
