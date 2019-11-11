package chapter01;

public class InvertedTriangle {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			
			for(int j = 6; j > i; j--) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
		for(int a = 0; a < 7; a++) {
			
			for(int b = 0; b < a; b++) {
				System.out.print(" ");
			}
			for(int c = 12; c > a * 2 - 1 ; c--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}//main

}//class
