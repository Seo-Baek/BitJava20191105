package chapter01;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				/*
				 * 기본타입(Primitive Type 8)
				 */
				//정수
				byte b = 1;
				short s = 10;
				int i = 2000;      //값  literal이라고도한다
				long l = 1234567890L;
				
				//실수
				float f = 3.14f;
				double d = 3.14;
				
				//뮨자
				char c = 'A';
				char c2 = 65;
				
				//불린
				boolean bool = true;
				boolean bool2 = false;
				
				System.out.println(b);
				System.out.println(s);
				System.out.println(i);
				System.out.println(l);
				System.out.println(f);
				System.out.println(d);
				System.out.println(c);
				System.out.println(c2);
				System.out.println(bool);
				System.out.println(bool2);
				
				/*
				 *  참조형(reference type)
				 */
				// 문자열은 기본타입이 아니다.
				// 문자열은 기본타입 char가 모여 있는 String 클래스의 객체다. (값개체)
				String str = "hello";
				System.out.println(str.length());
				
				// 지역변수 초기화가 되어야 한다.
				// 안되어 있는 상태로 사용하면 오류.
				int j = 0;   // = 0을 적는 것이 초기화임!
				
				
				System.out.println(j);
				
				/*
				 * 상수
				 */
				final int NUMBER = 10;  // 상수는 헷갈리지 않기 위해 대문자로 지정
				System.out.println(number);
				// 오류
				// 초기화할 때 final이 붙어 있는 변수는 
				// 초기화 이후부터는 값을 대입할 수 없다.
				//number = 100;			
				
	}

}
