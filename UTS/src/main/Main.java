package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int telur = 10000;
		int sabun = 50000;
		int sayur = 70000;
		int daging = 100000;
		int pilihan = 0;
		
		System.out.println("Selamat Datang di Myshopee");
		System.out.println("==========================\n");
		System.out.println("Promo Produk hari ini:");
		System.out.println("Telur  - Rp. 10,000");
		System.out.println("Sabun  - Rp. 50,000");
		System.out.println("Sayur  - Rp. 70,000");
		System.out.println("Daging - Rp. 100,000");
		
		System.out.println("Are you interested with these products?\n");	
		System.out.println("[1] Sell it to me!");
		System.out.println("[2] No");
		pilihan = scan.nextInt();
		scan.nextLine();
			
		switch(pilihan) {
		case 1:
			String login;
			System.out.println("Do you have an account?");
			login = scan.nextLine();
			
			if(login.equalsIgnoreCase("Yes")) {
				System.out.println("Please login to your account");
				System.out.print("Username: ");
				scan.nextLine();
				
				System.out.print("Password: ");
				scan.nextLine();
				System.out.println("Login Successful!\n");
				
				int totalHarga = 0;
				totalHarga = telur + sabun + sayur + daging;
				System.out.println("Jumlah Pembayaran: Rp." + totalHarga);
				System.out.println("");
				
				int opsi = 0;
				System.out.println("Opsi Pembayaran:");
				System.out.println("1. Kartu Kredit");
				System.out.println("2. Transfer");
				System.out.println("3. Virtual Account");
				System.out.print("Pilih Opsi Pembayaran Anda: ");
				System.out.println("");
				opsi = scan.nextInt();
				scan.nextLine();
				
				if(opsi < 1 || opsi > 3) {
					System.out.println("Opsi Pembayaran Tidak Tersedia!");
					System.exit(0);
				}else {
					System.out.println("Pembayaran Berhasil! Terima Kasih Telah Menggunakan Myshopee!");
				}
			}else {
				System.out.println("Create Account");
				System.out.print("Input Username: ");
				scan.nextLine();
				
				System.out.print("Input Address: ");
				scan.nextLine();
				
				System.out.print("Input Phone Number: ");
				scan.nextLine();
				
				System.out.print("Input Email:");
				scan.nextLine();
				
				System.out.println("Create Account Successful!\n");
				scan.nextLine();
				
				System.out.println("Please login to your account");
				System.out.print("Username: ");
				scan.nextLine();
				
				System.out.print("Password: ");
				scan.nextLine();
				
				System.out.println("Login Successful!\n");
				
				int totalHarga = 0;
				totalHarga = telur + sabun + sayur + daging;
				System.out.println("Jumlah Pembayaran: Rp." + totalHarga);
				System.out.println("");
				
				int opsi = 0;
				System.out.println("Opsi Pembayaran:");
				System.out.println("1. Kartu Kredit");
				System.out.println("2. Transfer");
				System.out.println("3. Virtual Account");
				System.out.print("Pilih Opsi Pembayaran Anda: ");
				opsi = scan.nextInt();
				scan.nextLine();
				
				if(opsi < 1 || opsi > 3) {
					System.out.println("Opsi Pembayaran Tidak Tersedia!");
					System.exit(0);
				}else {
					System.out.println("Pembayaran Berhasil! Terima Kasih Telah Menggunakan Myshopee!");
					break;
				}
			}
			
		case 2:
			System.out.println("Terima kasih telah menggunakan Myshopee!");
			System.exit(0);
			break;
		}
		
		
		
	}

}
