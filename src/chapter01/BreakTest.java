package chapter01;

public class BreakTest {

	public static void main(String[] args) {
		// 0�������� ���� 5000�̻��� �� ������ ��� ���� �ϴ� ��ƾ
		int sum = 0;
		
//		int i 	= 0;
//		while(sum < 5000) {
//			sum += i;
//			i++;
//			
//		}
		
//		for (int i = 0; sum < 5000; i++) {
//			sum += i;
//		}
//		
//		System.out.println(sum);

		//while (true) {
		// System.out.println("1111");
		//}
		
		int i = 0;
		while(true) {
			sum += i;
			if(sum >= 5000) {
				break;
				
			}
			i++;
		}
		System.out.println(sum);

	}//main

}//class