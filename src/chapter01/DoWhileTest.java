package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		do {
			System.out.print("�Է�[0 to quit]>");
			input = scanner.nextInt();//blocking;
			sum = sum + input;
			
		} while (input > 0);
		
		System.out.println("�Է��� ���� �� ���� " + sum + "�Դϴ�.");
		scanner.close();
		
	}//main

}//class
