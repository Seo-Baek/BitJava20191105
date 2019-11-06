package chapter01;

import java.util.Scanner; // Ctrl+Shift+O

public class Prob1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // Ctrl+Shift+On 외부에 있는 객체를 갖고 오는 것!
		int number = scanner.nextInt();  //console에 빨갛게 멈춤 blocking 입력값을 기다리는 중
		
		int result = number % 3;
		
		if(result == 0) 
		{		System.out.println("3의 배수입니다.");
		}else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
