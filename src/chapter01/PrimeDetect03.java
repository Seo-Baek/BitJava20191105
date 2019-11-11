package chapter01;

import java.util.Scanner;

public class PrimeDetect03 {
	
	

	public static void main(String[] args) {
		
		// 15가 소수인지 판별
		// 소수 => 1과 자신으로만 나뉘는 숫자
		// 2부터  (자기자신 -1)  15에 나누어본다. 나머지가 0인게 존재하면 소수가 아님! 
		
		
		
		int j	= 1;
		
		while(j <= 1000) {
			int num = j;
			boolean result = isPrime(num);
			if (result == true) {
				System.out.println(num);
			}
			j++;	
		}	
		
		// 판별
	

		//{(x-1)!^2}/x
		
		
		
		
		/**
		 * while (i < num) { if (num % i == 0) { //소수아니면 System.out.println(num +
		 * "은 소수가 아닙니다."); return;
		 * 
		 * }
		 * 
		 * i++; }
		 * 
		 * System.out.println(num + "은 소수입니다.");
		 */		
		//{(x-1)!^2}/x
				
				
	}//main
	
	
	
	public static boolean isPrime(int x) {
			
			int i			= 2;
			boolean isPrime = true;
				
			while(i < x) {
				int result 	= x % i;
						
				if(result == 0) {
					isPrime = false;
					break;
			}
			i++;
	
		}
			return isPrime;
	}//main
}//class

			


