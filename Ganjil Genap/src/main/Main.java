package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int angka = 0;
	
	System.out.println("Masukkan Angka:");
	System.out.print(">> ");
	try {
		angka = sc.nextInt();
	}catch(Exception E) {
		System.out.println("Input Harus Angka!");
	}finally {
		sc.nextLine();
	}
	
	if(angka % 2 != 0) {
		System.out.println("GANJIL");
	}else {
		System.out.println("GENAP");
	}

	}

}
