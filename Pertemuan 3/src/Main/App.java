package Main;

public class App {
	//Camel Case
			int myFavoriteNumber;
			
			//Constant Variable = All UpperCase
			// Declaration = Bikin Variable
			final int MAX_COMP;

			public App() {
		myFavoriteNumber = 1;
		myFavoriteNumber = 7;
		MAX_COMP = 8;
		System.out.println("Number: " + MAX_COMP);
		
		int apple = 10;
		int orange = 8;
		
//		int totalFruits = apple + orange;
//		int fruitdiff = (apple - orange);
//		//fruitdiff2 -> kalo hasil - maka *1
//		int fruitdiff2 = (orange - apple) * -1;
//		System.out.println("Total Fruit: " + totalFruits);
//		System.out.println("Total Fruit: " + fruitdiff);
//		System.out.println("Total Fruit: " + fruitdiff2);
//		
//		//Perhitungan kotak
//		int box1 = totalFruits / 4;
//		System.out.println("Total Box Needed: " + box1);
//		
//		double box2 = (double)totalFruits / 4;
//		System.out.println("Total Box Needed: " + Math.ceil(box2));
//		
//		//Modulo -> Sisa Pembagian
//		int slot = 10 % 5;
//		System.out.println("Modulo: " + slot);
//		
//		apple = apple + 2;
//		System.out.println("Apple: " + apple);
//		
//		apple = apple + 5;
//		System.out.println("Apple: " + apple);

		//Shorthand Operator
		orange += 4;
		orange *= 2;
		orange /= 6;
		orange %= 2;
		System.out.println("Orange: " + orange);
		
		//Post & Pre Increment
		orange = +1;
		orange++;
		orange++;
		System.out.println("Orange: " + (++orange));
		
		//Post & Pre Decrement
		orange--;
		orange--;
		System.out.println("Orange: " + (--orange));
		
		//Boolean
//		boolean isRunning = true;
//		boolean isTired = false;
//		boolean isExercise = isRunning || isTired && isTired;
//		
//		boolean isSame = (69 == 69);
//		boolean isBigger = (20 > 10);
//		boolean isSmaller = (10 < 15);
//		boolean isBiggerEquals = (10 >= 11);
//		System.out.println(isExercise);
//		System.out.println(isSame);
//		System.out.println(isBigger);
//		System.out.println(isSmaller);
//		System.out.println(isBiggerEquals);
		
	}

	public static void main(String[] args) {
		new App ();

	}

}
