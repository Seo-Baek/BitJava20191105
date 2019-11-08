package chapter01;

import java.util.Scanner;

public class SumInput01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			//program은 외부 자원을 이용하여 사용 됨, 반납을 해야함 close를 안했다고 경고가 뜸.
		int number = scanner.nextInt(); // blocking
		int sum = 0;
		
		int i = 1;
		
		//?
		
		
		while(i <= number) {
			System.out.println(i);
			sum = sum + i;
			
			i++;
			
		}
		
		
		System.out.println(number + "까지 합은" + sum + "입니다.");
		
		scanner.close();
		

	}

}


//x + (x+1) + ....... (x+10)