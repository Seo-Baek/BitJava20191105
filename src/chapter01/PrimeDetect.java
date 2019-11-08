package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		
		// 15가 소수인지 판별
		// 소수 => 1과 자신으로만 나뉘는 숫자
		// 2부터  (자기자신 -1)  15에 나누어본다. 나머지가 0인게 존재하면 소수가 아님! 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int i	= 2;
		int num = scanner.nextInt();
		boolean isPrime = true;

		//while 
		//ㆍㆍㆍ
		//int a	= 1;
		
		//while (a <= num) {
		
		
		while (i < num) {
			System.out.println("i= " + i + " 진입하였다!!");
			
			if (num % i == 0) {		//소수가 아님
				isPrime = false;
				break;

			} 
			
			i++;
			
		}	
		
		// 판별
		if (isPrime) {
			System.out.println(num + "은 소수입니다.");
			
		} else {
			System.out.println(num + "은 소수가 아닙니다.");

		}

		//{(x-1)!^2}/x
		scanner.close();
			
		
			
		    	
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
	}//main

			

}//class
