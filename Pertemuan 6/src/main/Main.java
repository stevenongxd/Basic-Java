package main;

public class Main {

	public Main() {
	//Break
//	for(int i = 0; i < 10; i++) {
//		if(i == 5) {
//			break;
//		}
//		System.out.println(i);
//	}
//		
//	int i = 0;
//	while(i < 10) {
//		i++;
//		
//		if(i == 7){
//			break;
//		}
//		System.out.println(i);
//	}
	
	String kata = "Hello World";
	int idx = 0;
	for(int k = 0; k < kata.length(); k++) {
		if(kata.charAt(k) == 'W') {
			idx = k;
			break;
		}
	}
	System.out.println(idx);
	System.out.println(kata.charAt(idx));
	
	//Continue
	for(int c = 0; c < 10; c++) {
		if(c == 5) {
			continue;
		}
		System.out.println(c);
	}
	
	}

	public static void main(String[] args) {
		new Main();
	}

}
