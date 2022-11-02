package main;

public class Main {
	public void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public Main() {
		int[] arr = {5, 48, 23, 7, 4, 6};
		
		System.out.println("BEFORE SORT: ");
		printArr(arr);
		
		//BUBBLE SORT
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				printArr(arr);
			}
			System.out.println();
		}
		System.out.println("\nAFTER SORT: ");
		printArr(arr);
	}

	public static void main(String[] args) {
		new Main();
	}

}
