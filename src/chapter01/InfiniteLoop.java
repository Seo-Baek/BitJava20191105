package chapter01;

public class InfiniteLoop {

	public static void main(String[] args) {
		

		int i 	= 0;
		int sum = 0;
		while(true) {
			sum += i;
			if(sum >= 5000) {
				break;
				
			}
			i++;
		}
		
	
//		int sum = 0;
//		for(int i = 0; ��� ������ ���� ������ ���ѷ����̴� ; i++) {
//			sum += i;
//			if(sum >= 5000) {
//				break;
//				
//			}
//			
//		}
		
		
		
	}//main

}//class
