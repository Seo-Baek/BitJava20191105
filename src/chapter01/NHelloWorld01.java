package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);			//program은 외부 자원을 이용하여 사용 됨, 반납을 해야함 close를 안했다고 경고가 뜸.
		int number = scanner.nextInt(); // blocking
		
		int i = 0;
		while(i < number) {
			
		System.out.println("Hello World");
		i++;
		}
		
		scanner.close(); //닫았당~!ㅎㅎ

	}

}
