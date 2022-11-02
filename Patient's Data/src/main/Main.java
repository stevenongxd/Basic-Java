package main;

import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
import java.util.Collections; 

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> ageList = new Vector<>();
		Vector<String> nameList = new Vector<>();
		Vector<String> addressList = new Vector<>();
		
		int age = 0;
		int menu = 0;
		String name = "";
		String address = "";
		int swap = 0;
		String str_Array[] = {name}; 
		
		do {
			do {
				System.out.println("\nPatient's Data");
				System.out.println("==============");
				System.out.println("1. Input New Data");
				System.out.println("2. View Patient's Data");
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
					System.out.print("\nInput Name [3-20 Characters]: ");
					name = sc.nextLine();
					if(name.length() < 3 && name.length() > 20) {
						System.out.println("Name Length Must Be Between 3-20 Characters!");
					}
				}while(name.length() < 3 && name.length() > 20);
				
				do {
					System.out.print("\nInput Age [10-100]: ");
					try {
						age = sc.nextInt();
						}catch(Exception e) {
							System.out.println("[!] Input Must Be A Number [!]");
						}finally {
							sc.nextLine();
						}
				}while(age < 10 || age > 100);
				
				do {
					System.out.print("\nInput Address [5-30 Characters]: ");
					address = sc.nextLine();
					if(address.length() < 5 && address.length() > 30) {
						System.out.println("Address Must Be Between 5-30 Characters!");
					}
				}while(address.length() < 5 && address.length() > 30);
				
				ageList.add(age);
				nameList.add(name);
				addressList.add(address);
				
				System.out.println("\nData Has Been Successfully Inserted!");
				break;
			
			case 2:
				
				if(nameList.size() < 1) {
					System.out.println("\nPatient's Data List Is Empty!\n");
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
					System.out.println("Patient's Data List");
					for (int i = 0; i < nameList.size(); i++) {
						System.out.println("\nNo       : " + (i+1));
						System.out.println("======================");
						System.out.println("1. Name    : " + nameList.get(i));
						System.out.println("2. Age     : " + ageList.get(i));
						System.out.println("3. Address : " + addressList.get(i));
						System.out.println();
					}
				}
				do {
				do {
					System.out.println("\nPatient's Data");
					System.out.println("==============");
					System.out.println("1. Sort data by Name Ascending");
					System.out.println("2. Sort data by Name Descending");
					System.out.println("3. Sort data by Age Ascending");
					System.out.println("4. Sort data by Age Descending");
					System.out.println("5. Back");
					System.out.print("No:  ");
					try {
						swap = sc.nextInt();
						}catch(Exception e) {
							System.out.println("[!] Input Must Be A Number [!]");
						}finally {
							sc.nextLine();
						}
				}while(swap < 1 || swap > 5);
				
				switch(swap) {
				
				case 1:
					Arrays.sort(str_Array, Collections.reverseOrder());
					
					for (int i = 0; i < nameList.size(); i++) {
						System.out.println("\nNo       : " + (i+1));
						System.out.println("======================");
						System.out.println("1. Name    : " + nameList.get(i));
						System.out.println("2. Age     : " + ageList.get(i));
						System.out.println("3. Address : " + addressList.get(i));
						System.out.println();
						Arrays.toString(str_Array);
					}
					break;
					
				case 2:
					Arrays.sort(str_Array, Collections.reverseOrder());
					
					for (int i = 0; i < nameList.size(); i++) {
						System.out.println("\nNo       : " + (i+1));
						System.out.println("======================");
						System.out.println("1. Name    : " + nameList.get(i));
						System.out.println("2. Age     : " + ageList.get(i));
						System.out.println("3. Address : " + addressList.get(i));
						System.out.println();
						Arrays.toString(str_Array);
					}
					break;
				
				case 3:
					for (int i = 0; i < ageList.size()-1; i++) {
						for (int j = ageList.size()-1; j > i; j--) {
							if(ageList.get(j) < ageList.get(j - 1)) {
								int tempRating = ageList.get(j);
								ageList.set(j, ageList.get(j - 1));
								ageList.set(j - 1, tempRating);
							}
						}
					}
					for (int i = 0; i < nameList.size(); i++) {
						System.out.println("\nNo       : " + (i+1));
						System.out.println("======================");
						System.out.println("1. Name    : " + nameList.get(i));
						System.out.println("2. Age     : " + ageList.get(i));
						System.out.println("3. Address : " + addressList.get(i));
						System.out.println();
					}
					break;
					
				case 4:
					for (int i = 0; i < ageList.size()-1; i++) {
						for (int j = ageList.size()-1; j < i; j--) {
							if(ageList.get(j) > ageList.get(j - 1)) {
								int tempRating = ageList.get(j);
								ageList.set(j, ageList.get(j - 1));
								ageList.set(j - 1, tempRating);
							}
						}
					}
					for (int i = 0; i < nameList.size(); i++) {
						System.out.println("\nNo       : " + (i+1));
						System.out.println("======================");
						System.out.println("1. Name    : " + nameList.get(i));
						System.out.println("2. Age     : " + ageList.get(i));
						System.out.println("3. Address : " + addressList.get(i));
						System.out.println();
					}
					break;
					
				case 5:
					do {
						System.out.println("\nPatient's Data");
						System.out.println("==============");
						System.out.println("1. Input New Data");
						System.out.println("2. View Patient's Data");
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
					break;
				}
				}while(swap != 5);
				break;
				
			case 3:
				System.out.println("\nThank You For Using This Application!");
				System.exit(0);
				break;
			}	
			
		}while(menu != 3);
	}

}
