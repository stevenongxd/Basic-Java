package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userName;
		int parameter = 0;
		
		System.out.println("Selamat Datung Ke Username dan Password Generator");
		System.out.println("=================================================");
		System.out.println();
		
		String name;
		System.out.println("Silahkan masukkan Nama Anda: ");
		name = sc.nextLine();
		name.toLowerCase();
		
		String birthDate;
		System.out.println("Silahkan Masukkan Tanggal Lahir Anda (dd/mm/yyyy): ");
		birthDate = sc.nextLine();
		
		if(birthDate.length() != 8) {
			System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
			System.out.println("Salah memasukkan tanggal lahir. Harap gunakan format dd/mm/yyyy");
			
		}else {
			String getYear = birthDate.substring(4,8);
			int year = Integer.parseInt(getYear);
			String getMonth = birthDate.substring(2,4);
			int month = Integer.parseInt(getYear);
			String getDate = birthDate.substring(0,2);
			int date = Integer.parseInt(getYear);
			
			int age = 2021 - year;
			
			if(age < 20 || age > 60) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Usia harus diantara 20-60 tahun");
				parameter++;
			}else if (age == 20 && month > 11){
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Usia harus diantara 20-60 tahun");
				parameter++;
			}else if (age == 20 && month == 11 && date < 19) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Usia harus diantara 20-60 tahun");
				parameter++;
			}else if (month > 12) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Bulan tidak boleh lebih besar dari 12");
				parameter++;
			}else if (month < 1) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Bulan tidak boleh lebih kecil dari 1");
				parameter++;
			}else if (date < 1) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari tidak boleh lebih kecil dari 1");
				parameter++;
			}else if (year % 4 == 0) {
				if (month == 2 && date > 29) {
					System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
					System.out.println("Hari di bulan 2 tahun kabisar tidak boleh lebih dari 29");
					parameter++;
				}
			}
			
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31){
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari di bulan ke " + month + "tidak boleh lebih dari 31");
				parameter++;
			}
			
			if((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari di bulan ke " + month + "tidak boleh lebih dari 30");
				parameter++;
				
			}else if (year % 4 != 0) {
			
			if (month == 2 && date > 28) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari di bulan 2 tidak boleh lebih dari 28");
				parameter++;
			}
			
			if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31){
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari di bulan ke " + month + "tidak boleh lebih dari 31");
				parameter++;
			}
			
			if((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
				System.out.println("Maaf data yang Anda masukkan salah. Username dan Password tidak dapat dibuat.");
				System.out.println("Hari di bulan ke " + month + "tidak boleh lebih dari 30");
				parameter++;
		}
		
		if(parameter == 0) {
			name.toLowerCase();
			userName = name.replaceAll(" ", "");
			if(userName.length() < 8) {
				userName = name + name;
				if(userName.length() < 8) {
					userName = userName + userName;
				}if(name.length() < 8) {
					userName = userName + userName;
				}
			}
			if(userName.length() > 8) {
				userName = userName.substring(0, 8);
		}
		int randomGetYear = (int) (Math.random() * 3);
		
		switch(randomGetYear) {
		case 0:
			getYear = getYear.substring(0, 2);
			break;
		
		case 1:
			getYear = getYear.substring(1, 3);
			break;
			
		case 2:
			getYear = getYear.substring(2, 4);
			break;
			
		}
		
		int randomUsername = (int) (Math.random() * 6);
		
		switch(randomUsername) {
		case 0:
			getYear = userName.concat(getDate + getMonth);
			break;
			
		case 1:
			getYear = userName.concat(getMonth + getDate);
			break;
			
		case 2:
			getYear = userName.concat(getDate + getYear);
			break;
			
		case 3:
			getYear = userName.concat(getYear + getDate);
			break;
			
		case 4:
			getYear = userName.concat(getMonth + getYear);
			break;
			
		case 5:
			getYear = userName.concat(getYear + getMonth);
			break;
			
		}
		
		System.out.println("\nSelamat Datang " + name);
		System.out.println("Username Anda Adalah: " + userName);
		System.out.println("Password Anda Adalah: " + birthDate);
		
		}
		
		
	}

}
	}
}
