package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String name;
//		int umur;
//		int rek;
//		
//		System.out.println("Welcome to ABC Bank");
//		System.out.print("Input Name [Max. 20 Characters]: ");
//		name = scan.nextLine();
//		
//		if(name.length() <= 20) {
//			System.out.print("Input Age [17-65 Y/O]: ");
//			umur = scan.nextInt();
//			scan.nextLine();
//			
//			if(umur >= 17 && umur <= 65) {
//				System.out.println("Input Account Balance [/10000]: ");
//				rek = scan.nextInt();
//				scan.nextLine();
//				
//				if(rek % 10000 == 0) {
//					System.out.println("Successfully Input All Data!");
//				}
//			}
//			else {
//				System.out.println("Wrong Input!");
//			}
//		
//		}
//		else {
//			System.out.println("Wrong Input!");
//		}
			
//		int pilihan;
//		System.out.println("Menu Hitung Bentuk");
//		System.out.println("1. Persegi");
//		System.out.println("2. Persegi Panjang");
//		System.out.println("3. Lingakaran");
//		System.out.print("Pilih: ");
//		pilihan = scan.nextInt();
//		scan.nextLine();
//		
//		if(pilihan == 1) {
//		int sisi;
//		System.out.print("Input Sisi: ");
//		sisi = scan.nextInt();
//		scan.nextLine();
//		
//		int luas = sisi * sisi;
//		System.out.print("Luas " + sisi + " x " + sisi + " = " + luas);
//		
//		}
//		else if(pilihan == 2) {
//		int panjang;
//		int lebar;
//		System.out.print("Input Panjang: ");
//		panjang = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("Input Lebar: ");
//		lebar = scan.nextInt();
//		scan.nextLine();
//		
//		int luas = panjang * lebar;
//		System.out.println("Luas " + panjang + " x " + lebar + " = " + luas);
//		}
//		else if(pilihan == 3) {
//			double jari;
//			System.out.println("Input Jari-Jari: ");
//			jari = scan.nextInt();
//			scan.nextLine();
//			
//			double luas = 3.14 * jari * jari;
//			System.out.println("Luas: 3.14 x " + jari + " x " + jari + " = " + luas);
//		}
//		else {
//			System.out.println("Menu Tidak Tersedia!");
//		}
	
		int nilai;
		char grade;
		
		System.out.println("Masukkan Nilai: ");
		nilai = scan.nextInt();
		scan.nextLine();
		
		if(nilai >= 90) {
			grade = 'A';
		}
		else if(nilai >= 80) {
			grade ='B';
		}
		else if(nilai >= 70) {
			grade ='C';
		}
		else if(nilai >= 60) {
			grade ='D';
		}
		else {
			grade ='E';
		}
		
		switch(grade) {
		case 'A':
			System.out.println("Very Nice!");
			break;
		case 'B':
			System.out.println("Nice!");
			break;
		case 'C':
			System.out.println("Not Very Nice!");
			break;
		case 'D':
			System.out.println("Not Nice!");
			break;
		case 'E':
			System.out.println("No!");
			break;
		}
		
		
	}


}
