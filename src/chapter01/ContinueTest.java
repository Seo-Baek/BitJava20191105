package chapter01;

public class ContinueTest {

	// 1 ~ 20���� (2�� ��� �Ǵ� 3�� ���)�� �ƴ� ���� ����ϴ� ����.
	// 1 ~ 20���� (2�� ����� �ƴϰ� 3�� ����� �ƴ�) ���� ����ϴ� ����.
	public static void main(String[] args) {
//		for (int i = 1; i <= 20; i++) {
//			if(i % 2 != 0 && i % 3 != 0) {
//				System.out.println(i);
//				
//			}
//			
//		}

		for(int i = 1; i <= 20; i++) {
			
			if(i % 2 == 0) {
				continue;
				
			}
			
			if(i % 3 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
		
	}//main

}//class