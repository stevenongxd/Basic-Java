import java.util.Scanner;
import java.io.IOException;
import java.lang.*;
public class Main {

	public Main() throws IOException {
		
		//True Or False
		String text = "Hello World";
		
		System.out.println("Char at 0: " + text.charAt(0));
		System.out.println(text.startsWith("H"));
		System.out.println(text.endsWith("Worldz"));
		System.out.println(text.compareTo("Hello Bnusan"));
		System.out.println(text.equals("Hello World"));
		System.out.println(text.indexOf(1));
		System.out.println(text.lastIndexOf(1));
		System.out.println(text.length());
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		Runtime.getRuntime().exec("cls");
		
		//Initial Finder
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String initial = "";
		
		System.out.print("Input your name: ");
		name = scan.nextLine();
		
		int spasi = name.indexOf(' ');
		
		initial = " " + name.charAt (0) + name.charAt(spasi+1);
		
		System.out.println("Your initial is " + initial);
		
		//Math Method
		float phi = 3.14f;
		int x = Math.max(25, 100);
		
		System.out.println(Math.abs(phi));
		System.out.println(Math.ceil(phi));
		System.out.println(Math.floor(phi));
		System.out.println(Math.round(phi));
		System.out.println(Math.max(x,  500));
		System.out.println(Math.min(25, 100));
		
		int a = (int) (Math.random()*10); // 0-9
		int b = (int) (Math.random()*7 + 9); //7-15
//		Math.random()*(akhir+1-awal) + awal
		
		System.out.println(a);
		System.out.println(b);
		
		//Wrapper Class
		//int -> Integer
		//float -> Float
		//double -> Double
		// char -> Character
		// boolean -> Boolean
		
		int y = Integer.parseInt("123");
		System.out.println(y);
		
		System.out.println(Integer.MAX_VALUE);
		
		char c = 'D';
		System.out.println(Character.isAlphabetic(c));
		System.out.println(Character.isDigit(c));
		
		//Type Casting
		// 1. Widening Casting = Kecil ke Besar
		int z = 12;
		long zlong = z;
		
		System.out.println(zlong);
		
		// 2. Narrowng Casting
		System.out.println("Byte max value: " + Byte.MAX_VALUE);
		System.out.println("Byte min value: " + Byte.MIN_VALUE);
		System.out.println("\nShort max value: " + Short.MAX_VALUE);
		short s = 127;
		byte sbyte = (byte) s;
		System.out.println(sbyte);
		
//		String kata = "125";
//		char d = kata.charAt(0); //Casting ke char
//		int e = Integer.parseInt(kata); //Casting ke int
//		System.out.println(d);
//		System.out.println(e);
		
		//ASCII -> Amercan Standard Code For Information Interchange
		int angka = 74;
		char f =(char) angka;
		System.out.println(f);
		
		char ch = 'A';
		int angka_ch = ch;
		System.out.println(angka_ch);	
	}

	public static void main(String[] args) throws IOException {
		new Main();
		
	}

}



