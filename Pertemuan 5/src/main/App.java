package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public App() {
		
	}

	public static void main(String[] args) {
		//Repetition with For, While, Do-While
		
		Scanner scan = new Scanner(System.in);
		
//		//For, While, Do-While
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println("===========");
//		
//		for (int genap = 0; genap < 6; genap+=2) {
//			System.out.println(genap);
//		}
//		
//		System.out.println("===========");
//		
//		for (int ganjil = 1; ganjil < 6; ganjil+=2) {
//			System.out.println(ganjil);
//		}
//		
//		System.out.println("===========");
//		
//		int j = 0;
//		do {
//			System.out.println(j);
//		}while(j > 5);
//		
//		while(j > 5) {
//			System.out.println(j);
//		}
		
		//While, Do-While Email Loop
		
		String email;
		
		do {
			System.out.print("Input Email: ");
			email = scan.nextLine();
		}while(email.contains("@") || email.endsWith(".com"));
		
		while(!email.contains("@") || !email.endsWith(".com")) {
			System.out.print("Input Email: ");
			email = scan.nextLine();
		}
		
		//Exception Handling | Stack Trace | Muncul code error berdasarkan exception
		int investment = 0;
		do {
			try {
				System.out.print("Input Invesment: ");
				investment = scan.nextInt(); //error
				scan.nextLine();
				investment /= 0; //error
				
			}catch(InputMismatchException e) {
				//Ketika error, Kode ini jalan
				System.out.println("[!] Please Input a Number");
				scan.nextLine();
				
			}catch(ArithmeticException e) {
				System.out.println("[!] Divide Zero");
				
			}catch(NullPointerException ne) {
				System.out.println("[!] Null Pointer");
			}finally {
				//Error/No
				if(investment < 10000) {
					System.out.println("Work More!");
					continue;
				}
			
			System.out.println("Nice!");
			}
		}while(investment < 10000);
		
	}
		
}
