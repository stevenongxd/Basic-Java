package main;

import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public static void rata(int[] array, int a)
	{
		float sum = 0;
		float n = 0;
		float hasil;
		for (int i = 0; i < 10; i++)
		{
			sum = sum + array[i];
			n++;
		}
		hasil = sum / n;
		System.out.printf("rata rata: %0.1f\n",hasil);
	}

	public static void sort(int[] array, int a) {
		
		int[] arrayn = new int[a + 1];
		int n = 0;
		for (int i = 0; i < a ;i++)
		{
			arrayn[array[i]]++;
		}
		
		for (int j = 1; j <= a; j++)
		{
			System.out.printf("Nilai %d: %d\n",j,arrayn[j]);
			if (n < arrayn[j])
			{
				n = arrayn[j];
			}
		}
		System.out.print("Modus: Nilai ");
		for (int l = 1; l <= a; l++)
		{
			if (arrayn[l] == n)
			{
				System.out.printf("%d ",l);
			}
		}
		
	}
	public Main() {
		Scanner scan = new Scanner(System.in);
		int jumlah = 0;
		int i = 0;
		int j = 0;
		int swap = 0;
		
		do {
			System.out.print("Masukkan Jumlah Siswa: ");
			try {
				jumlah = scan.nextInt();
			}catch(Exception E) {
				System.out.println("[!] Input Harus Angka [!]");
			}finally {
				scan.nextLine();
			}
		}while(jumlah < 10);
		
		int array[] = new int[jumlah];
		
		System.out.println("\nMasukkan " + jumlah + " Nilai");
		System.out.println("====================");
		
		for(i = 0; i < jumlah; i++) {
			System.out.print("Nilai Ke- " + (i + 1) + " = ");
			array[i]=scan.nextInt();
			array[i]++;
			if(array [i] < 1 || array[i] > 10) {
				i = i - 1;
				System.out.println("[!] Angka Tidak Boleh Kurang dari 1 / Lebih Dari 10");
			}
		}
		
		for(i = 0; i < (jumlah - 1); i++) {
			for(j = 0; j<jumlah-i-1; j++) {
				if (array[j] > array[j+1]) {
					swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
		System.out.println("");
		
		for( i = 0; i < jumlah; i++) {
			System.out.println("Nilai ke- " + (i + 1) + " = " + array[i] + " ");
		}
		
		System.out.println("");
		
		int a = 0;
		float rata;
		rata(array, a);
		System.out.print("\n");
		sort(array, a);

	}
public static void main(String[]args) {
	new Main();
}
}