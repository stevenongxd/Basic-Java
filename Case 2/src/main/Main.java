package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String tambah;
		int topping = 0;
		int pilih = 0;
		int quantity = 0;
		int harga1 = 0;
		int harga2 = 0;
		
		
		System.out.println("Pilih Ukuran Yang Diinginkan: ");
		System.out.println("1. Small @ 10.000");
		System.out.println("2. Medium @ 20.000");
		System.out.println("3. Large @ 30.000");
		System.out.print("Pilihan [1-3]: ");
		pilih = scan.nextInt();
		
		if(pilih < 1 || pilih > 3) {
			System.out.println("Input Salah");
		}
		
		switch(pilih) {
		case 1: 
			System.out.print("Masukkan Quantity [1-10]: ");
			quantity = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Mau Tambah Topping [Y | y]: ");
			tambah = scan.nextLine();
			
			if(tambah.equalsIgnoreCase("y")){
				System.out.print("Masukkan Quantity Topping @5000 [1-10]: ");
				topping = scan.nextInt();
				
				if(topping < 1 || topping > 10) {
					System.out.println("Input Salah, Penambahan Topping Batal");
					harga1 = 10000 * quantity;
					System.out.println("Total Harga: Rp. " + harga1);
					
				}else {
					System.out.println("Penambahan Topping Berhasil");
					harga2 = 10000 * quantity + 5000 * topping;
					System.out.println("Total Harga: Rp. " + harga2);
				}
	
			}else {
				harga1 = 10000 * quantity;
				System.out.println("Total Harga: Rp. " + harga1);
			}
			break;
			
		case 2: 
			System.out.print("Masukkan Quantity [1-10]: ");
			quantity = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Mau Tambah Topping [Y | y]: ");
			tambah = scan.nextLine();
			
			if(tambah.equalsIgnoreCase("y")){
				System.out.print("Masukkan Quantity Topping @5000 [1-10]: ");
				topping = scan.nextInt();
				
				if(topping < 1 || topping > 10) {
					System.out.println("Input Salah, Penambahan Topping Batal");
					harga1 = 20000 * quantity;
					System.out.println("Total Harga: Rp. " + harga1);
					
				}else {
					System.out.println("Penambahan Topping Berhasil");
					harga2 = 20000 * quantity + 5000 * topping;
					System.out.println("Total Harga: Rp. " + harga2);
					}
				
				}else {
					harga1 = 20000 * quantity;
					System.out.println("Total Harga: Rp. " + harga1);
				}
				break;
			
		case 3: 
			System.out.print("Masukkan Quantity [1-10]: ");
			quantity = scan.nextInt();
			scan.nextLine();
			
			System.out.print("Mau Tambah Topping [Y | y]: ");
			tambah = scan.nextLine();
			
			if(tambah.equalsIgnoreCase("y")){
				System.out.print("Masukkan Quantity Topping @5000 [1-10]: ");
				topping = scan.nextInt();
				
				if(topping < 1 || topping > 10) {
					System.out.println("Input Salah, Penambahan Topping Batal");
					harga1 = 30000 * quantity;
					System.out.println("Total Harga: Rp. " + harga1);
					
				}else {
					System.out.println("Penambahan Topping Berhasil");
					harga2 = 30000 * quantity + 5000 * topping;
					System.out.println("Total Harga: Rp. " + harga2);
				}
	
			}else {
				harga1 = 30000 * quantity;
				System.out.println("Total Harga: Rp. " + harga1);
			}
			break;
						
		}
	}
}
