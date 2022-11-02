package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> nameList = new Vector<>();
		Vector<String> posList = new Vector<>();
		Vector<Integer> ageList = new Vector<>();
		Vector<Integer> numList = new Vector<>();
		
		System.out.println("Job Vacancy");
		System.out.println("===========");
		
		int menu = 0;
		do {
		do {
			System.out.println("1. Insert New Staff");
			System.out.println("2. List Of Staff");
			System.out.println("3. Search Staff");
			System.out.println("4. Exit");
			System.out.print(">> ");
			try {
			menu = sc.nextInt();
			break;
			}catch(Exception e) {
				System.out.println("[!] Please Input A Number [!]");
			}finally {
				sc.nextLine();
			}
		}while (menu < 1 || menu > 4);
		
		switch(menu) {
		
		case 1:
			String name = "";
			do {
			System.out.print("Input Staff's Name [3-20]: ");
			name = sc.nextLine();
			}while(name.length() < 3 || name.length() > 20);
			
			String position = "";
			do {
				System.out.print("Input Staff's Position [Manager|Analyst|Programmer]: ");
				position = sc.nextLine();
			}while(!position.equalsIgnoreCase("Manager") && !position.equalsIgnoreCase("Analyst") && !position.equalsIgnoreCase("Programmer"));
			
			int age = 0;
			do {
				System.out.print("Input Staff's Age [Above 17 Y/O]: ");
				try {
				age = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(age <= 17);
			
			nameList.add(name);
			posList.add(position);
			ageList.add(age);
			
			System.out.println("Data Has Benn Sucessfully Inserted!");
			System.out.println("Press Enter To Continue\n\n");
			break;
		
		case 2:
			if(nameList.isEmpty()) {
				System.out.println("No Data! Please Insert Your Data First!");
				sc.nextLine();
			}else {
				for(int i = 0; i < nameList.size(); i++) {
					System.out.println("No           : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Name      : " + nameList.get(i));
					System.out.println("2. Position  : " + posList.get(i));
					System.out.println("2. Age       : " + ageList.get(i));
					System.out.println();
					System.out.println("Press Enter To Continue\n\n");
				}
			}
			sc.nextLine();
			break;
		
		case 3:
			String search = "";
			int index = -1;
			
			do {
				System.out.print("Input Staff's Name [3-20]: ");
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
				System.out.println("1. Name      : " + nameList.get(index));
				System.out.println("2. Position  : " + posList.get(index));
				System.out.println("2. Age       : " + ageList.get(index));
				System.out.println();
				System.out.println("Press Enter To Continue\n\n");
				sc.nextLine();
				break;
			}
			
		case 4:
			System.exit(0);
			break;
		}
		}while(menu != 4);
	}

}








