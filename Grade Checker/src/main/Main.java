package main;

import java.util.Scanner;

public class Main {

	public Main() {
	}
	

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String nama = "";
	int nilai = 0;
		
	System.out.print("Masukkan Nama: ");
	nama = sc.nextLine();
	
	System.out.print("Masukkan Nilai: ");
	nilai = sc.nextInt();
	
	if(nilai < 0 || nilai > 100) {
		System.out.println("Nilai Harus 0-100");
	}else if(nilai >= 90) {
		System.out.println("Predikat " + nama + " Adalah A");
	}else if(nilai >= 80) {
		System.out.println("Predikat " + nama + " Adalah B");
	}else if(nilai >= 70) {
		System.out.println("Predikat " + nama + " Adalah C");
	}else if(nilai >= 60) {
		System.out.println("Predikat " + nama + " Adalah D");
	}else if(nilai >= 0) {
		System.out.println("Predikat " + nama + " Adalah E");
	}
	
	}

}
