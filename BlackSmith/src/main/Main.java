package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> nameList = new Vector<>();
        Vector<String> typeList = new Vector<>();
        Vector<String> rarityList = new Vector<>();
        Vector<Integer> priceList = new Vector<>();
        
        int price = 0;
		int menu = 0;
		
		do {
		do {
			System.out.println("Black Smith");
			System.out.println("===========");
			System.out.println("1. Order New Weapon");
			System.out.println("2. Check Out");
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
			String weapon;
			do {
			System.out.print("\nAssign Weapon Name [min 5 characters & start with UPPERCASE]: ");
			weapon = sc.nextLine();
			}while(weapon.length() < 5 || !Character.isUpperCase(weapon.charAt(0)));
			
			String type = "";
			do {
				System.out.print("\nChoose Weapon Type [ Ranged | Melee ] [Case Sensitive]: ");
				type = sc.nextLine();
			}while(!type.equals("Ranged") && !type.equals("Melee"));
			
			String rarity = "";
			do {
				System.out.print("\nChoose Weapon Rarity [ Common | Epic | Legendary ] [Case Sensitive]: ");
				rarity = sc.nextLine();
			}while(!rarity.equals("Common") && !rarity.equals("Epic") && !rarity.equals("Legendary"));
						
			if(rarity.equals("Common")) {
	            int randc = (int)Math.floor(Math.random()*(100-0+1)+0);
	            if(type.equals("Melee")) {
	            	price =  randc*2;
	            }else {
	            	price = randc*2;
	            }

	        }else if(rarity.equals("Epic")){
	            int rande = (int)Math.floor(Math.random()*(500-101+1)+101);
	            if(type.equals("Melee")) {
	            	price =  rande*2;
	            }else {
	            	price = rande*2;
	            }

	        }else if(rarity.equals("Legendary")){
	            int randl = (int)Math.floor(Math.random()*(1000-501+1)+501);
	            if(type.equals("Melee")) {
	            	price =  randl*2;
	            }else {
	            	price = randl*2;
	            }
	            }
			
			nameList.add(weapon);
			typeList.add(type);
			rarityList.add(rarity);
			priceList.add(price);
			
			System.out.println("\nSuccessfully added weapon to your order list!");
			System.out.println("\nPress ENTER to continue...");
			sc.nextLine();
			sc.nextLine();
			break;
		
		case 2:
			if(nameList.size() <= 0) {
				System.out.println("===================================");
				System.out.println("You Haven't ordered any weapon yet!");
				System.out.println("===================================");
			}else {
				System.out.println("===========");
				System.out.println("Weapon List");
				System.out.println("===========");
				
				for(int i = 0; i < nameList.size(); i++) {
				System.out.println("No           : " + (i+1));
				System.out.println("======================");
				System.out.println("1. Name      : " + nameList.get(i));
				System.out.println("2. Rarity    : " + typeList.get(i));
				System.out.println("3. Power     : " + rarityList.get(i));
				System.out.println("4. Price     : " + priceList.get(i));
				System.out.println();
				}
				int pay = 0;
				System.out.println("Total Price   : $ " + price);
				do {
				System.out.print("Total Pay     : $ ");
				try {
				pay = sc.nextInt();
				}catch(Exception E) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
				}while(pay < price);
				
				System.out.println("Total Change  : $ " + (pay - price));
				System.out.println("");
				System.out.println("Thank You For Your Purchase!");
				System.out.println("");
				System.out.println("Pess Enter To Continue...");
				sc.nextLine();
				sc.nextLine();
			}
			break;
		
		case 3:
			System.exit(0);
			break;
		
		}
		}while(menu != 3);

		}	
	}




