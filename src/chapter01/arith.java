package chapter01;

public class arith {

	public static void main(String[] args) {
		/**
		 * 산술연산자(이항연산자)
		 */
		int a = 3;
		int b = 7;
		
		int r1 = a + b;
		System.out.println(r1);
		
		int r2 = a - b;
		System.out.println(r2);
		
		int r3 = a * b;
		System.out.println(r3);
		
		int r4 = a / b;
		System.out.println(r4);
		
		int r5 = a % b;
		System.out.println(r5);

		// int op int => int 인트로 오퍼하면 값은 인트이다.
		System.out.println(10 / 3);
		
		// int op double => double
		System.out.println(10 / 3.); // 점만 찍어도 3.0 더블형이 됨
		
		// 주의
	
		System.out.println((double)10 / 3);  //10. / 3과 동일
		System.out.println((double)(10 / 3));  // int 10 / int 3 후 double로 캐스트
		
		/*
		 * 증감연산자(단항 연산자)
		 * ++, --
		 */
		int n = 1;
		n++;		// n = n + 1: 후위
		System.out.println(n);
		
		n--;		// n = n - 1
		System.out.println(n);
		
		++n;		// n = n + 1: 전위
		System.out.println(n);
		
		
		// 참고 (산술 연산자는 다음과 같이 축약형을 쓸 수 있다)
		n += 10;		// n = n + 10
		System.out.println(n);
		
		n -= 10;		// n = n - 10
		System.out.println(n);
		
		n *= 10;		// n = n * 10
		System.out.println(n);
		
		
		
		
	}

}
