package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		//Static Array
		//int[] angka = {1, 2, 3, 4};
		//System.out.println(angka[0]);
		
		//Dynamic Array
		ArrayList<Integer> numberArrayList = new ArrayList<>();
		Vector<Integer> numberVector = new Vector<>();
		
		//ADD
		numberArrayList.add(10);
		numberArrayList.add(20);
		numberArrayList.add(30);
		
		numberVector.add(10);
		numberVector.add(20);
		numberVector.add(30);
		
		//SET
		numberArrayList.set(0, 11);
		numberVector.set(0, 11);
		
		//Remove
		numberArrayList.remove(2);
		numberVector.remove(2);
		
		//GET
		System.out.println(numberArrayList.get(1));
		System.out.println("--------------------");
		System.out.println(numberVector.get(1));
		System.out.println("--------------------");
		
		for(int i = 0; i < numberVector.size(); i++) {
			System.out.println(numberVector.get(i));
		}
		
		System.out.println("--------------------");
		
		for(int i = 0; i < numberArrayList.size(); i++) {
			System.out.println(numberArrayList.get(i));
		}
	}

}
