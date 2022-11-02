package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> noUrut = new ArrayList<Integer>();
		
		String nama = "";
		int tinggi = 0;
		
		System.out.println("------------------------------------------------");
		System.out.print("Masukkan Nama Anda: ");
		nama = scan.nextLine();
		
		System.out.print("Masukkan Tinggi Badan Anda [CM]: ");
		tinggi = scan.nextInt();	
		
		tinggi = tinggi/100;
		noUrut.add(1);
		
		//Model 1
		System.out.println("------------------------------------------------");
		System.out.println("Peserta " + noUrut + " | " + nama + " | " + "Tinggi Anda: " + tinggi + " [M]");
		
		//Model 2
		System.out.println("\n-------------------------------------------");
		System.out.println("Nomor | Nama | Tinggi Badan [M] |");
		System.out.println("-------------------------------------------");
		System.out.printf("%5d | %10s | %5d |", noUrut, nama, tinggi);
		System.out.println("-------------------------------------------");
	}
		
	}


