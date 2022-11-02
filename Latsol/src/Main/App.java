package Main;

import java.util.Scanner;

public class App {

	public App() {
		double money = 0;
		int multiplier = 0, choice = 0;
		String returnChoice;
		String enter;
		
		Scanner scan = new Scanner(System.in);
		
		do{
		System.out.println("\nES Companies Portal – Investment Calculator");
		System.out.println("===========================================");
		System.out.println("begining");
		do {
		try {
			System.out.print("Input your money to be invested [1-5000] (can be decimal): ");
			money = scan.nextDouble();
			}catch(Exception e) {
				System.out.println("please input the right number");
				scan.nextLine();
			}
		}while(money<1 || money >5000);
		
		do {
		try {
		System.out.print("Input the investment multiplier [1-99]: ");
		multiplier = scan.nextInt();
		}catch(Exception e) {
			System.out.println("please input the right number");
		}finally {
			scan.nextLine();
		}
		}while(money<1 && money>99);
		
		for(int i = 1; i<=12; i++) {
			do {
				try {
			System.out.println("\nMonth " + i);
			System.out.printf("Current Money: %.2f\n", money );
			System.out.println("\nWhat happen");
			System.out.println("===========");
			System.out.println("1. Nothing");
			System.out.println("2. Take all money invested");
			System.out.println("3. Drop in investment");
			System.out.println("4. No addition to investment");
			System.out.print("choose: ");
			choice = scan.nextInt(); scan.nextLine();
				}catch(Exception e) {
					System.out.println("[!] input number");
					scan.nextLine();
				}
			}while(choice<1 || choice>4);
			
			switch(choice) {
			case 1:
				System.out.println("Nothing bad happened....");
				System.out.println("Everything is normal");
				System.out.println("click enter to continue...");
				enter = scan.nextLine();
				money += money*multiplier/100;
				break;
				
			case 2:
				System.out.println("You have taken all of your money!");
				System.out.println("click enter to continue...");
				enter = scan.nextLine();
				break;
			
			case 3:
				System.out.println("Oh no!\nThe drop in investment causes your money to decrease!");
				System.out.println("click enter to continue...");
				enter = scan.nextLine();
				money -= money*multiplier/100;
				break;
			
			case 4:
				System.out.println("There's no change in the investment money...");
				System.out.println("click enter to continue...");
				enter = scan.nextLine();
				break;
			}
			if(choice == 2) {
				break;
			}
			
		}
		System.out.printf("Your money after investing : %.2f\n", money);
		do {
		System.out.print("Do you want to try again [y|n]? ");
		returnChoice = scan.nextLine();
		if ((returnChoice.equalsIgnoreCase("y")) == false && (returnChoice.equalsIgnoreCase("n")) == false){
			System.out.println("Input the right Thing!");
			returnChoice = "w";
		}
		}while(returnChoice.equals("w"));
		
		if(returnChoice.equalsIgnoreCase("y")) {
			continue;
		}
		else if(returnChoice.equalsIgnoreCase("n")){
			System.out.println("Thank for using this application! :D");
			break;
		}
		
		}while(true);
	}

	public static void main(String[] args) {
		new App();

	}

}
