package chapter01;

import java.util.Scanner;

public class PowerOfTwo2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);			//program은 외부 자원을 이용하여 사용 됨, 반납을 해야함 close를 안했다고 경고가 뜸.
		System.out.print("승수: ");
		int power = scanner.nextInt(); // blocking
		
		long result = 1;
		for (int i = 0; i < power; i++) {
			result = result * 2;
			
		}
				
		System.out.println("2의" + power + "승은" + result + "입니다.");
		
		scanner.close();

	}

}
