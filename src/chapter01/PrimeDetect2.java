package chapter01;

import java.util.Scanner;

public class PrimeDetect2 {
	
	

	public static void main(String[] args) {
		
		// 15�� �Ҽ����� �Ǻ�
		// �Ҽ� => 1�� �ڽ����θ� ������ ����
		// 2����  (�ڱ��ڽ� -1)  15�� �������. �������� 0�ΰ� �����ϸ� �Ҽ��� �ƴ�! 
		
		
		
		int j	= 1;
		
		while(j <= 1000) {
			int num = j;
			boolean result = isPrime(num);
			if (result == true) {
				System.out.println(num);
			}
			j++;	
		}	
		
		// �Ǻ�
	

		//{(x-1)!^2}/x
		
		
		
		
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
		//{(x-1)!^2}/x
				
				
	}//main
	
	
	
	public static boolean isPrime(int x) {
			
			int i	= 2;
			boolean isPrime = true;
				
			while(i < x) {
				int result = x % i;
						
				if(result == 0) {
					isPrime = false;
					break;
			}
			i++;
	
		}
			return isPrime;
	}//main
}//class

			

