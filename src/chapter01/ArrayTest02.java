package chapter01;

public class ArrayTest02 {

	public static void main(String[] args) {
		/*
		 * �迭 ���� �����ϴ� ���
		 */
		int 	array1[];		// 1.����õ
		int[] 	array2;		// 2.��õ(****)
//		int[10] array3; 	// 3. ����
		
		/*
		 * �迭�ʱ�ȭ
		 */
		
		// 1.�⺻������ ����Ÿ���� �迭�� 0���� �ʱ�ȭ�� �ȴ�.
//		array4 = new int[5];
//		
//		for(int n : array4) {
//			System.out.println(n);
//			
//		}
		
		int[] array4 = new int[5];
		for(int n : array4) {
			System.out.println(n);
		}
		
		// 2.���� ���������� �ʱ�ȭ
		int[] array5 = new int[5];
		array5[0] = 0;
		array5[1] = 1;
		array5[2] = 2;
		array5[3] = 3;
		array5[4] = 4;
		
		for(int n : array5) {
			System.out.println(n);
			
		}
		
		int i = 10;
		String s = "hello";   // �� ��ü�� literal
		
		// 3.�迭 ���ͷ�(literal)�� �ʱ�ȭ (****��õ!)
		int[] array6 = {10, 20, 30, 40, 50};
		
		for(int n : array6) {
			System.out.println(n);
			
		}
		
		// 4.���ͷ� �ʱ�ȭ ������ ( �������� = �������� + ���ͷ��ʱ�ȭ  >> �������Ǹ� �����ϱ� ������! )
		//int[] array7;
		//array7 = {10, 20, 30, 40, 50};
		
		// 5.����õ�ʱ�ȭ
		int[] array8 = new int[] {100, 200, 300, 400, 500};
	
		for(int n : array8) {
			System.out.println(n);
		
		}
		
		
	}//main

}//class