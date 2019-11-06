package chapter01;

public class Arith2 {

	public static void main(String[] args) {
		
		//전위 후위 연산은 출력의 순서에 따라 이름지음
		
		
		int n = 1;
		System.out.println(n++);  
		//n을 먼저 출력하고 n+1을 하는 것
		//  System.out.println(n);
		//  n = n+1;
		System.out.println(n);
		
		System.out.println(--n);
		// n = n-1;
		// System.out.println(n);
		
	}
}
