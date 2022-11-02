package main;

import java.util.Scanner;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int health = 100;
		int menu = 0;
		
		System.out.println("1. Fight");
		System.out.println("2. Exit");
		menu = scan.nextInt();
		scan.nextLine();
		
		if(menu == 1) {
		
		switch(menu) {
		case 1:
		String difficulties;
		do {
			System.out.print("Input enemy difficulties [Easy | Medium | Hard]: ");
			difficulties = scan.nextLine();
		}while(!difficulties.equals("Easy") && !difficulties.equals("Medium") && !difficulties.equals("Hard"));
		
		String name;
		do {
			System.out.print("Input Your Name [Maximum 15 Characters, No Space]: ");
			name = scan.nextLine();
		}while(name.length() < 1 || name.length() > 15 || name.contains(" "));
		
		int dex = 0;
		do {
			System.out.print("Input Your Dexterity [Must be between 1-100]: ");
			dex = scan.nextInt();
			scan.nextLine();
		}while(dex < 1 || dex > 100);

		String weapon;
		do {
			System.out.print("Input Your Weapon [ MP7 | AK47 | M4A1 ]: ");
			weapon = scan.nextLine();
		}while(!weapon.equals("MP7") && !weapon.equals("AK47") && !weapon.equals("M4A1"));
		
		int enemyPower = 0;
		if(difficulties.equals("Easy")){
			int healthenemy = 50;
			int powerenemy = 10;
			int dexenemy = 50;
			enemyPower = (powerenemy * dexenemy) + healthenemy;
			
		}else if(difficulties.equals("Medium")) {
			int healthenemy = 75;
			int powerenemy = 15;
			int dexenemy = 70;
			enemyPower = (powerenemy * dexenemy) + healthenemy;

		}else if(difficulties.equals("Hard")) {
			int healthenemy = 100;
			int powerenemy = 20;
			int dexenemy = 100;
			enemyPower = (powerenemy * dexenemy) + healthenemy;
		}
		
		int playerPower = 0;
		
		if(weapon.equals("MP7")){
			playerPower = (10 * dex) + health;
			
		}else if(weapon.equals("AK47")) {
			playerPower = (20 * dex) + health;
			
		}else if(weapon.equals("M4A1")) {
			playerPower = (15 * dex) + health;
		}
		
		if(playerPower < enemyPower) {
			System.out.println("Fighting...");
			System.out.println("The enemy kills you! " + name + " Lose!");
		}else if (playerPower > enemyPower) {
			System.out.println("Fighting...");
			System.out.println("The enemy is dead! " + name + " Wins!");
			break;
		}
		
		case 2:
			System.exit(0);
			break;
		}
		}
}
}
