package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int angka;
//		
//		do {
//			System.out.print("Input Number [1-100]: ");
//			angka = scan.nextInt();
//		}while(angka < 1 || angka > 100);
//		
//		//Deret Angka Kostum
//		for (int i = 0; i <= angka; i++) {
//			if(i % 5 == 0)
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("");
//		
//		//Deret Angka Genap
//		for (int o = 1; o <= angka; o++) {
//			System.out.print(o*2 + " ");
//		}
//		
//		System.out.println("");
//		
//		//Deret Angka Ganil
//		for (int p = 1; p <= angka; p++) {
//			System.out.print(p*2-1 + " ");
//		}
//		
//		System.out.println("");
//		System.out.println("");
//		
//		int number, input, total = 0;
//		System.out.print("Input Number: ");
//		number = scan.nextInt();
//		
//		for (int i = 1; i <= number; i++) {
//			System.out.print("Number " + i + ": ");
//			input = scan.nextInt();
//			total = total + input;
//		}
//		
//		System.out.println("Total: " + total);
//		System.out.println("Average: " + total/number);
//		
//		System.out.println("");
//		System.out.println("");
//		
//		int angkaBintang;
//		
//		do {
//			System.out.print("Input Number [1-100]: ");
//			angkaBintang = scan.nextInt();
//		}while(angkaBintang < 1 || angkaBintang > 100);
//		
//		for (int i = 0; i < angkaBintang; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		String nama = "Steven Ong";
		System.out.println(nama.substring(3));
		System.out.println(nama.substring(1, 5));
		
	}

}
