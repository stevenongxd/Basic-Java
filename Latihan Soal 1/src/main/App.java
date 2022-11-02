package main;

import java.util.Iterator;
import java.util.Scanner;

public class App {

	public App() {
		//Primitive Data Type = boolean, byte, char, int, long, float, double.....
		//Wrapper Class = Character, String, Byte, integer, Float, Double, Boolean, Short....
		//Vector & arrayList -> Wrapper Class
//		
//		//Variable Declare
		double var1 = 2.5;
		
//		//Inisialisasi Variable
		int var2 = 1;
//		
//		//(int) (Type Casting)
		int var3 = (int)var1;
		Integer var4 = 5;
		String kata = var4.toString();
		
		String nama;
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Nama: ");
		nama = scan.nextLine();
		System.out.println("Nama Anda Adalah: " + nama);
		
		int angka1;
		int angka2;
		
		System.out.print("Masukkan Angka Pertama: ");
		angka1 = scan.nextInt();
		
		//Cara supaya tidak terlewat scan.nextLine
		scan.nextLine();
		nama = scan.nextLine();
		
		System.out.print("Masukkan Angka Kedua: ");
		angka2 = scan.nextInt();
		scan.nextLine();
		System.out.println("Angka Pertama: " + angka1);
		System.out.println("Angka Kedua: " + angka2);
		
		//Operator Aritmatika
		System.out.println("Penjumlahan: " + (angka1 + angka2));
		System.out.println("Pengurangan: " + (angka1 - angka2));
		System.out.println("Perkalian: " + (angka1 * angka2));
		System.out.println("Pembagian: " + (angka1 / angka2));
		System.out.println("Modulo:" + (angka1 % angka2));
		
		//Operator Logika
		//And = && -> Keduanya benar = True | Salah satu benar/salah = False
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		//Or = || -> Salah satu benar = True
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		//Perulangan & Pemilihan
		//if, if-else, switch case
		
		int umur = 45;
		if (umur > 40) {
			System.out.println("Orang Tua");
		}
		else if (umur > 20){
			System.out.println("Remaja");
		}
		else if (umur > 13) {
			System.out.println("Anak Kecil");
		}
		else {
			System.out.println("Bayi");
		}
		
		//switch case
		int angka = 1;
		switch (angka) {
		case 1:
			System.out.println("Angka ini 1");
			break;
		case 2:
			System.out.println("Angka ini 2");
			break;
		case 3:
			System.out.println("Angka ini 3");
			break;
		default:
			System.out.println("Bukan 1, 2, 3");
			break;
		}
		
		String nama1;
		String nama2;
		nama1 = scan.nextLine();
		nama2 = scan.nextLine();
		
		if(nama1.equals(nama2)) {
			System.out.println("Nama Mereka Sama");
		}
		else {
			System.out.println("Nama Mereka Berbeda");
		}
		
		//for, while, do-while
//			i = i+2;
//			i +=2; Shorthand Operator
//			i++ -> i = i+1;
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i);
//		}
//		
//		int i = 0;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//			
//		}
//		do {
//			System.out.println(i);
//			i++;
//			if(i == 3) break;
//		}while (i<10);
		
		//break, continue, label
		for (int j = 0; j < 10; j++) {
			if (j == 3)continue;
			System.out.println(j);
		}
		
		outerA:
		for (int i = 0; i < 10; i++) {
			innerA:
			for (int j = 0; j < 10; j++) {
				if (j == 1) break innerA;
				System.out.println("i = " + i + " J = " + j);
			}
		}
		
		}
		

	public static void main(String[] args) {
		new App ();
	}

}
