package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nama;
		System.out.print("Masukkan Nama [Huruf depan harus konsonan]: ");
		nama = scan.nextLine();
		
		if(nama.startsWith("A" + "I" + "U" + "E" + "O")) {
			System.out.println("Input Salah");
			
		}else {
			System.out.println("Input Benar");
		}
		
		System.out.println("");
		
		System.out.println("Masukkan Nama: " + nama);
		
		System.out.println("");
		
		int nilai1 = 0;
		System.out.print("Masukkan Nilai UTS [1..20]: ");
		nilai1 = scan.nextInt();
		
		if(nilai1 < 1 || nilai1 > 20) {
			System.out.println("Input Salah\n");
			System.exit(0);
		}else {
			System.out.println("Input Benar\n");
		}
		
		int nilai2 = 0;
		System.out.print("Masukkan Nilai UAS [1..20]: ");
		nilai2 = scan.nextInt();
		
		if(nilai2 < 1 || nilai2 > 20) {
			System.out.println("Input Salah\n");
			System.exit(0);
		}else {
			System.out.println("Input Benar\n");
		}
		
		double totalNilai = 0;
		totalNilai = ((0.3 * nilai1)) + (0.7 * nilai2);
		System.out.println("Total Nilai = " + totalNilai);
		
		if(totalNilai <= 5.0) {
			System.out.println("Kamu GAGAL!");
			scan.nextLine();
		}else {
			System.out.println("Kamu LULUS!");
			scan.nextLine();
		}
		
	}

}
