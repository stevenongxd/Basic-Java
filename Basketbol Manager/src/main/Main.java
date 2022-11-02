package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		Scanner sc = new Scanner(System.in);
		Vector<String> nameList = new Vector<>();
		Vector<Integer> overallList = new Vector<>();
		Vector<Integer> salaryList = new Vector<>();
		Vector<Integer> contractList = new Vector<>();
		Vector<Integer> totalSalaryList = new Vector<>();
		
		String team = "";
		int contract = (int)(Math.random()*5);
		int salary = 0;
		int overall = 0;
		int menu = 0;
		do {
		do {
			System.out.print("Input your team name: ");
			System.out.println("\n[Team Name must be between 1-10]");
			team = sc.nextLine();
		}while(team.length() < 1 || team.length() > 10);
		
		if(nameList.size() < 5) {
		do {
			System.out.println("-There is no player-");
			System.out.println("1. Play a season");
			System.out.println("2. Contract a player");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			try {
			menu = sc.nextInt();
			}catch(Exception e) {
				System.out.println("[!] Input Must Be A Number [!]");
			}finally {
				sc.nextLine();
			}
		}while(menu < 1 || menu > 3);
		}else {
			do {
				for(int i = 0; i < nameList.size(); i++) {
					System.out.println("No           : " + (i+1));
					System.out.println("======================");
					System.out.println("1. Name                : " + nameList.get(i));
					System.out.println("2. Overall             : " + overallList.get(i));
					System.out.println("3. Salary              : " + salaryList.get(i));
					System.out.println("4. Contract Time       : " + contractList.get(i));
					System.out.println("5. Total Money Spent   : " + totalSalaryList.get(i));
					System.out.println();
				}
				
				System.out.println("1. Play a season");
				System.out.println("2. Contract a player");
				System.out.println("3. Exit");
				System.out.print("Choice: ");
				try {
				menu = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(menu < 1 || menu > 3);
		}
		
		switch(menu) {
		case 1:
			if(nameList.size() >= 5) {
				int winRate = (int)(Math.random()*100);
				
				if(winRate >= 75) {
					System.out.println("Congratulations! Team" + team + " has win the game!");
					sc.nextLine();
					salary = salary + 1500000;
					contract = - 1;
					if(contractList.equals(0)) {
						contractList.remove(contractList.equals(0));
					}
				}else {
					System.out.println("Too Bad! Try Again Next Season!");
					contract = - 1;
					if(contractList.equals(0)) {
						contractList.remove(contractList.equals(0));
					}
					sc.nextLine();
				}
			}else {
				System.out.println("Not Enough Player!");
			}
			break;
		
		case 2:
			String name = "";
			do {
			do {
			System.out.print("Input Player Name: ");
			System.out.println("\n[Name must be between 5-15 and 2 words]");
			name = sc.nextLine();
			}while(name.length() < 5 || name.length() > 15 || !name.contains(" "));
			
			do {
				System.out.print("Input player overall: ");
				System.out.println("\n[Overall must be between 1-100]");
				try {
				overall = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(overall < 1 || overall > 100);
			
			do {
				System.out.print("Input Player Salary: ");
				System.out.println("\n[Salary must be between 2000000 - 6000000]");
				try {
				salary = sc.nextInt();
				}catch(Exception e) {
					System.out.println("[!] Input Must Be A Number [!]");
				}finally {
					sc.nextLine();
				}
			}while(salary < 2000000 || salary > 6000000);
			
			int bonus = 0;
			if(overall <= 50) {
				bonus = 5000000;
			}else {
				bonus = 7500000;
			}
			
			int totalSalary = 0;
			
			totalSalary = (salary * contract) + bonus;
			
			nameList.add(name);
			overallList.add(overall);
			salaryList.add(salary);
			contractList.add(contract);
			totalSalaryList.add(totalSalary);
			System.out.println("Press Enter to Continue");
			sc.nextLine();
			}while(nameList.size() < 5);
			break;
			
		case 3:
			System.exit(0);
			break;
		}
		}while(menu != 3);
		
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
