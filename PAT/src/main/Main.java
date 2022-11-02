package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int angka1 = 0;
		int angka2 = 0;
		
		System.out.print("Masukkan Nilai 1: ");
		try {
			angka1 = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input Harus Angka!\n");
		}finally {
			sc.nextLine();
		}
		
		System.out.print("Masukkan Nilai 2: ");
		try {
			angka2 = sc.nextInt();
		}catch(Exception E) {
			System.out.println("Input Harus Angka!\n");
		}finally {
			sc.nextLine();
		}
		
		if(angka1 < angka2) {
			System.out.println("Angka 2 Lebih Besar");
		}
		if(angka1 > angka2){
			System.out.println("Angka 1 Lebih Besar");
		}
		if(angka1 == angka2) {
			System.out.println("Nilai Sama");
		}
		
		System.out.println("\nProcess Finished.");
		System.exit(0);
		
	}

}
