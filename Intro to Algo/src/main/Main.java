package main;

import java.util.Scanner;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Area of Triangle
		float z = 0, h = 0, area ;  
		
		System.out.print("Input 1st Area: ");
		z = sc.nextFloat();
		
		System.out.println("Input 2nd Area: ");
		h = sc.nextFloat();
		
        area = (z*h) / 2;  
        System.out.print("Area of Triangle is: " + area);  
		
		System.out.println("\n======================\n");
		
		// Second to Hours & Minutes
		int sec, min, hour = 0;
		
		System.out.print("Input Seconds: ");
		sec = sc.nextInt();
		
		min = sec/60;
		hour = sec/3600;
		
		System.out.println(sec + " seconds is equal to: " + hour + " hours " + min + " minutes");
		
		System.out.println("\n======================\n");
		
		// Max, Avg, Min Number
//		System.out.println("Please enter first number :");
//		 int first = sc.nextInt();   
//		 
//		System.out.println("Please enter second number :"); 
//		int second = sc.nextInt(); 
//		
//		System.out.println("Please enter third number :"); 
//		int third = sc.nextInt();   
//		
//		int largest = largest(first, second, third); 
//		int smallest = smallest(first, second, third);  
//		 System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest); 
//		System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
		
		System.out.println("\n======================\n");
		
		// Circle Area
		System.out.print("Enter the radius:");
		
        double r= sc.nextDouble();
        double  areas=(22*r*r)/7 ;
        
        System.out.println("Area of Circle is: " + areas); 
        
        System.out.println("\n======================\n");
        
        // Rectangle Perimeter
        float a ,b, c, d, perimeter;  
        a=c= 5;  
        b=d=4;  
        perimeter  = 2*(a+b);  
        
        System.out.println("Perimeter of Rectangle is: "+perimeter);  
		
	}

}
