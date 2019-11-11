package chapter01;

import java.util.Scanner;

public class PrimeDetect04 {
	
	

	public static void main(String[] args) {
		
		// 15가 소수인지 판별
		// 소수 => 1과 자신으로만 나뉘는 숫자
		// 2부터  (자기자신 -1)  15에 나누어본다. 나머지가 0인게 존재하면 소수가 아님! 
		
		//for 문으로 돌게끔!
//		int j = 1;
//		while( j <= 500000 ) {
//			int num = j;
//
//  	        int i = 2;
//  	        boolean isPrime = true;
//			while(i < num) {
//				int result = num % i;
//				if( result == 0) {
//					isPrime = false;
//					break;
//				}
//				i++;
//			}
//			
//			if(isPrime) {
//				System.out.println(num);
//			} 
//			
//			j++;
//		}		
		

		for (int j = 1; j <= 500000; j++) {
		
			int num = j;
			boolean isPrime = true;
			
			for (int i = 2; i < num; i++) {
				int result = num % i;
				if(result == 0) {
					isPrime = false;
					break;
					
				}
			
			}
			if(isPrime) {
				System.out.println(num);
				
			}
			
		}	
		
	}//main
	
}//class	

		

