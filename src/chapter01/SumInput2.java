package chapter01;

import java.util.Scanner;

public class SumInput2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			//program�� �ܺ� �ڿ��� �̿��Ͽ� ��� ��, �ݳ��� �ؾ��� close�� ���ߴٰ� ����� ��.
		int number = scanner.nextInt(); // blocking
		int sum = 0;
		
		for(int i =1; i <= number; i++) {
			sum = sum + i;
			
		}
		
		
		
		
		System.out.println(number + "���� ����" + sum + "�Դϴ�.");
		
		scanner.close();
		

	}

}


//x + (x+1) + ....... (x+10)