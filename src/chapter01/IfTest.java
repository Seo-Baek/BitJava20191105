package chapter01;

public class IfTest {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 29;
		
		//=======================
		int diff = 0;
		
		if(a > b) {
			 diff = a - b;
		} else {
				diff = b - a;		// 변수 선언을 하지 않으면 바깥의 변수를 사용한다.
		}							// 변수는 블락 안에서만 존자한다 (중요!!!!!)
		
		System.out.println(diff);

	}

}
