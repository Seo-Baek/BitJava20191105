package chapter01;

public class Relation {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 7;
		
		boolean r1 = a == b;
		System.out.println(r1);
		
		boolean r2 = a != b;
		System.out.println(r2);
		System.out.println(a != b);	//변수 선언은 필요할 때만 한다
		

		System.out.println(a > b);
		System.out.println(a < b);
		
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		
	}

}
