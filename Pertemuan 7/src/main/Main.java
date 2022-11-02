package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		// Array Declaration
		// 1 = High
		// 2 = Medium
		// 3 = Low
		int[] apples= new int[5];
		
		//How to assign value to an Array
		//Index -> Posisi sebuah ELEMENT dalam sebuah ARRAY
		apples[0] = 1;
		apples[1] = 3;
		apples[2] = 2;
		apples[3] = 3;
		apples[4] = 1;
		
		for(int i = 0; i < apples.length; i++) {
			System.out.printf("Apple Quality [%d]: %d\n", i, apples[i]);
		}
		
		System.out.println("");
		
		//[Tipe data] [Variable setiap element] : [Array]
		for(int appleQ : apples) {
			System.out.println("Apple Quality: " + appleQ);
		}
		System.out.println("");
		
		//Two Dimensional Array
//		int[] applesTD = new int[row][column];
//		int[] applesTD = new int[5][4];
		
		int[][] applesTD = {
				{3, 3, 3, 3},
				{2, 2, 2, 2},
				{1, 2, 1, 2},
				{3, 2, 1, 3},
				{2, 2, 2, 2},
		};
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(applesTD[i][j] + " ");
				if(j == 3) {
					System.out.println("");
				}
			}
		}
		System.out.println("");
		
		System.out.println(applesTD[0][0]);
		
		System.out.println("");
		
		int len = apples.length;
		try {
			apples[6] = 8;
		}catch(Exception e) {
			System.out.println("[!] There is no enough space");
		}
		
		System.out.println("");
		
		//Dynamic Array
		//Ketika memory di PC sudah tidak cukup
		//Maka ARRAY DYNAMIC sudah tidak bisa alokasi tempat lagi
		
		//ArrayList (Grow Size = 50%)
		ArrayList<Integer> orangeArrayList = new ArrayList<>();
		
		//Add ArrayList
		orangeArrayList.add(1);
		orangeArrayList.add(2);
		orangeArrayList.add(3);
		
//		//Remove ArrayList
//		orangeArrayList.add(0);
//		
//		//Remove All ArrayList Element
//		orangeArrayList.clear();
		
		//Update Value
		orangeArrayList.set(0,5);
				
		System.out.println("Contain '3' element = " + orangeArrayList.contains(3));
		
		System.out.println("");
		
		//For Each
		for(Integer orangeQ : orangeArrayList) {
			System.out.println("Orange ArrayList Qualities: " + orangeQ);
		}
		
		System.out.println("");
		
		//For Only
		for(int i = 0; i < orangeArrayList.size(); i++) {
			System.out.println("Orange ArrayList Qaulities: " + orangeArrayList.get(i));
		}
		
		System.out.println("");
		
		//Vector (Grow Size = 100%)
		Vector<Integer> orangeVector = new Vector<>();
		orangeVector.add(1);
		orangeVector.add(2);
		orangeVector.add(3);
		orangeVector.add(4);
		
//		//Remove
//		orangeVector.remove(orangeVector.size() - 1);
//		
//		//Remove All Vector Element
//		orangeVector.clear();
		
		System.out.println("Contain '3' element = " + orangeVector.contains(3));
		
		for(Integer orangeQ : orangeVector) {
			System.out.println("Orange Vector Qualities: " + orangeQ);
		}
		System.out.println("");
		
		ArrayList<Integer> numbers = new ArrayList <Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		//Convert ArrayList to Array
		Integer[]numberArray = numbers.toArray(new Integer[numbers.size()]);
		
		for(Integer integer : numberArray) {
			System.out.println("Number: " + integer);
		}
		
		System.out.println("");
		
		//Ubah Array ke ArrayList
		String[] strArray = {"Hello", "World", "..."};

		List<String> listOfString = Arrays.asList(strArray);
		ArrayList<String> stringArrayList = new ArrayList<String>(listOfString);
		
		for(String string : stringArrayList) {
			System.out.println(string);
		}
		
		//Lambda Expression
		stringArrayList.forEach(element -> {
			System.out.println(element);
		});
		
		stringArrayList.stream().filter(element -> {
			if(element.contains("Hello")) {
				return true;
			}
			return false;
		}).forEach(element -> {
			System.out.println(element);
		});
	}

}
