package main;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<String> nameList = new Vector<>();
		Vector<Float> gpaList = new Vector<>();
		
		int pilihan = 0;
		do {
		do {
			System.out.println("Selamat Datang!");
			System.out.println("1. Registrasi Data");
			System.out.println("2. Tampilkan Data");
			System.out.println("3. Tampilkan Rata-Rata Nilai");
			System.out.println("4. Exit");
			System.out.print(">> ");
			pilihan = sc.nextInt();
			sc.nextLine();
		}while(pilihan < 1 || pilihan > 4);
	
		System.out.println("");
		
		switch (pilihan) {
		case 1:
			String name;
			do {
				System.out.print("Input Your Name [Maximum 15 Characters]: ");
				name = sc.nextLine();
			}while(name.length() < 1 || name.length() > 15);
			
			Float gpa;
			do {
			System.out.print("Input Your GPA [1-4]: ");
			gpa = sc.nextFloat();
			sc.nextLine();
			}while(gpa < 1 || gpa > 4);
			
			System.out.println("");
			
			nameList.add(name);
			gpaList.add(gpa);
			System.out.println("Data Has Been Successfuly Stored!");
			System.out.println("Press Enter To Continue\n\n");
			sc.nextLine();
			break;
			
		case 2:
			if(nameList.isEmpty()) {
				System.out.println("No Data! Please Insert Your Data First!");
				sc.nextLine();
			}else {
				for(int i = 0; i < nameList.size(); i++) {
					System.out.println("No       : " + (i+1));
					System.out.println("============");
					System.out.println("1. Name  : " + nameList.get(i));
					System.out.println("2. GPA   : " + gpaList.get(i));
					System.out.println();
					System.out.println("Press Enter To Continue\n\n");
				}
			}
			sc.nextLine();
			break;
		
		case 3:
			
			if(nameList.isEmpty()) {
				System.out.println("No Data! Please Insert Your Data First!");
				sc.nextLine();
			}else { 
				float rata = 0;
				float rata2 = 0;
			for(int i = 0; i < gpaList.size(); i++)
				rata += gpaList.get(i);
				rata2 = rata/gpaList.size();
			
			System.out.printf("Rata-Rata GPA: %.2f\n", rata2);
			System.out.println("Press Enter To Continue\n\n");
			sc.nextLine();
		}	
			break;
		
			
		case 4:
			System.out.println("Terima Kasih Telah Mengunjungi!");
			System.exit(0);
			break;
		}
		}while(pilihan != 4);
		
	}

}
