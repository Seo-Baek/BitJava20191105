package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		// 15�� �Ҽ����� �Ǻ�
		// �Ҽ� => 1�� �ڽ����θ� ������ ����
		// 2����  (�ڱ��ڽ� -1)  15�� �������. �������� 0�ΰ� �����ϸ� �Ҽ��� �ƴ�! 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Ҽ����� �Ǵ��� ����: ");

		int i	= 2;
		int num = scanner.nextInt();
		boolean isPrime = true;

		//while 
		//������
		//int a	= 1;
		
		//while (a <= num) {
		
		
		while (i < num) {
			System.out.println("i= " + i + " �����Ͽ���!!");
			//int result = num % i;
			//if ( result == 0) { }   ����
			
			if (num % i == 0) {		//�Ҽ��� �ƴ�
				isPrime = false;
				break;

			} 
			
			i++;
			
		}	
		
		// �Ǻ�
		if (isPrime) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
			
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");

		}

		//{(x-1)!^2}/x
		scanner.close();
			
		
			
		    	
		/**
		 * while (i < num) { if (num % i == 0) { //�Ҽ��ƴϸ� System.out.println(num +
		 * "�� �Ҽ��� �ƴմϴ�."); return;
		 * 
		 * }
		 * 
		 * i++; }
		 * 
		 * System.out.println(num + "�� �Ҽ��Դϴ�.");
		 */		
	}//main

			

}//class