package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		int qty1, qty2, total1, total2;
//		String nama1, nama2;
//		
//		System.out.print("Masukkan Kuantitas 1: ");
//		qty1 = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("Masukkan Nama Anda 1: ");
//		nama1 = scan.nextLine();
//		
//		System.out.print("Masukkan Kuantitas 2: ");
//		qty2 = scan.nextInt();
//		scan.nextLine();
//		
//		System.out.print("Masukkan Nama Anda 2: ");
//		nama2 = scan.nextLine();
//		
//		total1 = qty1 * 50000;
//		total2 = qty2 * 50000;
//		
//		// |	Nama	| Kuantitas	|	Total	|
//		// |	Steven	|	10		|	500000	|
//		// |	Ong		|	5		|	250000	|
//		
//		System.out.println(" |    Nama     | Kuantitas |    Total    |");
//		System.out.printf("| %-15s | %-3d | %-10d |\n", nama1, qty1, total1);
//		System.out.printf("| %-15s | %-3d | %-10d |\n", nama2, qty2, total2);
//		System.out.println("Total yang perlu dibayar oleh " + nama1 + " untuk " + qty1 + " eskrim = Rp. " + total1);
//		System.out.printf("Total yang perlu dibayar oleh %s untuk %d eskrim = Rp. %d \n", nama2, qty2, total2);
//		
//		double phi = 3.1452342342;
//		System.out.println(phi + " haha ");
//		System.out.printf("%.2f haha ", phi);
		
//		String ND, NB;
//		
//		System.out.print("Masukkan Nama Depan: ");
//		ND = scan.nextLine();
//		
//		System.out.print("Masukkan Nama Belakang: ");
//		NB = scan.nextLine();
//		
//		int PJ =ND.length() + NB.length();
//		
//		if (PJ % 2 == 0) {
//			System.out.println("Total Karakter Dari Nama Adalah Genap");
//		}else {
//			System.out.println("Total Karakter Dari Nama Adalah Ganjil");
//		}
//		
//		//Inisial
//		System.out.println("Inisial Anda Adalah " + ND.charAt(0) + NB.charAt(0));
//		
//		//Password Inisial
//		String PD = ND.substring(0,3);
//		PD = PD.toUpperCase();
//		
//		String PB = NB.substring(NB.length()-3, NB.length()).toLowerCase();
//		String PW = PD + PB;
//		System.out.println("Password Adalah: " + PW);
//		
//		Random rda = new Random();
//		int angka = rda.nextInt(10) + 1; //0-9 + 1 => 1-10
//		System.out.println(angka);
//		
//		Random rdh = new Random();
//		char huruf = (char) (rdh.nextInt(26) + 'a');
//		System.out.println(huruf);
	
		//Modulus
		int angka = 0;
		System.out.print("Masukkan Angka: ");
		scan.nextInt();
		
        int puluhanribu = (angka/10000)%10;
        System.out.println("Puluhan ribu : " + puluhanribu);
        
        int ribuan = (angka/1000)%10;
        System.out.println("Ribuan : " + ribuan);
        
        int ratusan = (angka/100)%10;
        System.out.println("Ratusan : " + ratusan);
        
        int puluhan = (angka/10)%10;
        System.out.println("Puluhan : " + puluhan);
        
        int satuan = (angka/1)%10;
        System.out.println("Satuan : " + satuan);

		
	}

}
